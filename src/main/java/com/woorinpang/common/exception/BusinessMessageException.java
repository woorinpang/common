package com.woorinpang.common.exception;


import com.woorinpang.common.exception.dto.ErrorCode;

public class BusinessMessageException extends BusinessException {

    public BusinessMessageException(String customMessage) {
        super(ErrorCode.BUSINESS_CUSTOM_MESSAGE, customMessage);
    }
}
