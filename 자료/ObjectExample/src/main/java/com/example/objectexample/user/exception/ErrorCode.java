package com.example.objectexample.user.exception;

import lombok.Getter;

public enum ErrorCode {
    SAME_ID("동일한 ID가 있습니다"),
    ID_NOT_FOUND("해당 ID를 찾을 수 없습니다."),


    INVALID_TYPE_VALUE("유요하지 않은 타입입니다");


    @Getter
    private String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
