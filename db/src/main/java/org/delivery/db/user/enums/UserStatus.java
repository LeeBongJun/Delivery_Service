package org.delivery.db.user.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserStatus {

    REGISTER("등록"),
    UNREGISTERED("해지"),
    ;

    private final String description;
}
