package com.fanjia.fjrpc.codec;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/5/11
 */
public interface Decoder {
    <T> T decode(byte[] bytes,Class<T> clazz);
}
