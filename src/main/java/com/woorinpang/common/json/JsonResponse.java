package com.woorinpang.common.json;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JsonResponse {

    private LocalDateTime timestamp;
    private String message;
    private int status;


}
