package com.fanjia.fjrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: ServiceDescriptor <br>
 * date: 2020/5/11 22:00 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDescriptor {

    private String clazz;

    private String method;

    private String returnType;

    private String[] parameterTypes;
}
