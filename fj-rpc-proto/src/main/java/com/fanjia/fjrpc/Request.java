package com.fanjia.fjrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: Request <br>
 * date: 2020/5/11 22:03 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private ServiceDescriptor serviceDescriptor;

    private Object[] parameters;
}
