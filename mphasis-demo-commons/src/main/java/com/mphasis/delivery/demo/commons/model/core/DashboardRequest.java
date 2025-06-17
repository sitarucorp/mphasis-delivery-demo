package com.mphasis.delivery.demo.commons.model.core;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class DashboardRequest <T> implements Serializable {
    private T payload;
}
