package com.springboot.domain;

import lombok.Data;

@Data
public class Bill {
    String orderDetailId;
    String parentDetailId;
    String transType;
}
