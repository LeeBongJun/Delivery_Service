package org.delivery.api.common.api;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.delivery.api.common.error.ErrorCodeIfs;

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

    public static Api<Object>ERROR(Result result) {
        var api = new Api<Object>();
        api.result = result;
        return api;
    }

    public static Api<Object>ERROR(ErrorCodeIfs errorCodeIfs , Throwable tx) {
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeIfs , tx);
        return api;
    }

    public static Api<Object>ERROR(ErrorCodeIfs errorCodeIfs , String description) {
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeIfs , description);
        return api;
    }
}
