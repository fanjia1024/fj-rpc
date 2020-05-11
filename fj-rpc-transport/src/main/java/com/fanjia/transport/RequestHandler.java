package com.fanjia.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/5/11
 */
public interface RequestHandler {
    void onRequest(InputStream toRecive, OutputStream toResp);
}
