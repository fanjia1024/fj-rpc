package com.fanjia.fjrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * description: JsonEncoder <br>
 * date: 2020/5/11 22:43 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class JsonEncoder implements Encoder{
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
