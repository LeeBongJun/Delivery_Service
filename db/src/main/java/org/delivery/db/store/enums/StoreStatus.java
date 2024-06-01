package org.delivery.db.store.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StoreStatus {

    REGISTERD("등록"),
    UNREGISTERD("해지");

    private String description;
}
