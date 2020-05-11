package com.fanjia.fjrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * description: JsonDecoder <br>
 * date: 2020/5/11 22:46 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class JsonDecoder implements Decoder{
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
