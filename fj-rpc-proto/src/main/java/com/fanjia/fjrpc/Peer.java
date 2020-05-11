package com.fanjia.fjrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * description: Peer 表示网络传输中的一个端点<br>
 * date: 2020/5/11 21:56 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
public class Peer {

    //主机名称
    private String hosts;
    //端口
    private int port;
}
