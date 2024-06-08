package org.delivery.db.userordermenu.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserOrderMenuStatus {

    REGISTERD("등록") ,
    UNREGISTERD("해지"),
    ;

    private String description;

}
