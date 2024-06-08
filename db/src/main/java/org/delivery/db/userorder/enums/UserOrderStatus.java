package org.delivery.db.userorder.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserOrderStatus {

    REGISTERD("등록") ,
    UNREGISTERD("해지"),
    ;

    private String description;

}
