package com.temp.javaprac.common;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    NOT_FOUND(404, "未找到"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_SUPPORTED(415, "不支持"),
    NOT_ACCEPTABLE(406, "不支持"),
    REQUEST_TIMEOUT(408, "请求超时"),
    CONFLICT(409, "冲突"),
    UNPROCESSABLE_ENTITY(422, "不可处理的实体");

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
