package org.delivery.db.user.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserStatus {

    REGISTER("등록"),

    UNREGISTER("해지"),
    ;

    private final String description;

}
