FROM maven:3-eclipse-temurin-22-alpine
WORKDIR /app

ENV TZ UTC
ENV OTEL_VERSION=2.16.0


ADD ./ /app
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_VERSION}/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar

# 8081 - management endpoint -> /howru/health
# 9464 - prometheus port jmx backdoor

ENV PORT=80
EXPOSE 80 8080 8081 9464

# Environment variables for OpenTelemetry
ENV OTEL_SERVICE_NAME "mphasis-dashboard"
ENV OTEL_RESOURCE_ATTRIBUTES "deployment.environment=production,service.namespace=com.vodafone.vois.iotlabs,service.version=v1.1"
ENV OTEL_RESOURCE_PROVIDERS_AWS_ENABLED=true

ENV _JAVA_OPTIONS="-XX:MetaspaceSize=128m"
ENV _JAVA_TOOLS_OPTIONS="--enable-preview"

# grafana based otel
#ENV JAVA_TOOL_OPTIONS=-javaagent:/app/grafana-opentelemetry-java.jar

# JVM tune for CDS / G1GC and Metaspace
#  "-XX:MinHeapFreeRatio=20", \
 #  "-XX:MaxHeapFreeRatio=40", \
 #  "-XX:MaxGCPauseMillis=200", \
 #  "-XX:G1HeapRegionSize=8m", \
ENV JAVA_TOOL_OPTIONS="-DMaxRAM=512m -D:+UseG1GC=true -D:MaxGCPauseMillis=200 -DMetaspaceSize=64m -DMaxMetaspaceSize=256m -DTieredCompilation=true -DUseStringDeduplication=true -DAlwaysPreTouch=true -Djdk.virtualThreadScheduler.parallelism=32 -Djdk.virtualThreadScheduler.maxPoolSize=204"
#ENV OTEL_EXPORTER_OTLP_ENDPOINT=http://localhost:4317
#ENV OTEL_EXPORTER_OTLP_PROTOCOL=grpc


ENTRYPOINT [ "java", \
#ENTRYPOINT [ "java", "-javaagent:/app/opentelemetry-javaagent.jar", \
#  "-Dotel.service.name=cspreport-dashboard", \
#  "-Dotel.metrics.exporter=otlp", \
#  "-Dotel.traces.exporter=otlp", \
#  "-Dotel.exporter.otlp.endpoint=http://collector:4317", \
#  "-Dotel.instrumentation.runtime-metrics.enabled=true", \
  "-server" ]

CMD [ "-jar", "/app/target/*.jar" ]
