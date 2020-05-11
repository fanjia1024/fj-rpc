package com.fanjia.transport;

import com.fanjia.fjrpc.Peer;

import java.io.InputStream;

/**
 * description: TransportCilent <br>
 * date: 2020/5/11 22:52 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public interface TransportCilent {
    void connect(Peer peer);

    InputStream write(InputStream inputStream);

    void close();
}
