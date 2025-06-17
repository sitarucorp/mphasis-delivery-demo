package com.mphasis.delivery.dashboard.observability.ui.view;

import com.mphasis.delivery.dashboard.base.ui.component.MainLayout;
import com.mphasis.delivery.dashboard.base.ui.component.ViewToolbar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "/observability", layout = MainLayout.class)
@PageTitle("Status Page | Observability")
@PermitAll
public class ObservabilityView extends Main {

    public ObservabilityView() {
        Button topologyBtn = new Button("Show Topology", e -> {
            Notification.show("This displays apps http traffic in a topology way visually", 3000, Notification.Position.MIDDLE);
        });

        Button statusPageBtn = new Button("Status Page", e -> {
            Notification.show("This displays status page of project rss feed", 3000, Notification.Position.MIDDLE);
        });

        add(new ViewToolbar("View Observability | Deployments", ViewToolbar.group(statusPageBtn, topologyBtn)));
    }

}
