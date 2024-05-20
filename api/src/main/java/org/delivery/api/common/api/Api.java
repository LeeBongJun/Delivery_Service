package org.delivery.api.common.api;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Api<T> {

    private Result result;

    @Valid
    private T body;

    public static <T> Api<T> Ok(T data) {
        var api = new Api<T>();
        api.result = Result.Ok();
        api.body = data;
        return api;
    }

}
