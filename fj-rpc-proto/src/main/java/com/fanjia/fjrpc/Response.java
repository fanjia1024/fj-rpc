package com.fanjia.fjrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: Response <br>
 * date: 2020/5/11 22:06 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
public class Response {

    private int code;

    private String message;

    private Object data;

}
