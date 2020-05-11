package com.fanjia.transport;

import com.fanjia.fjrpc.Peer;
import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.HttpConnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * description: HttpTransportClient <br>
 * date: 2020/5/11 23:00 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class HttpTransportClient implements TransportCilent {
    private String url;

    @Override
    public void connect(Peer peer) {
        this.url="http://"+peer.getHosts()+":"+peer.getPort();
    }

    @Override
    public InputStream write(InputStream inputStream) {
        try {
            HttpURLConnection httpConnection =(HttpURLConnection) new URL(url).openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setDoInput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.connect();

            //发送数据到sever
            IOUtils.copy(inputStream,httpConnection.getOutputStream());

            int responseCode=httpConnection.getResponseCode();

            if (responseCode == 200){
                return httpConnection.getInputStream();
            }else {
                return httpConnection.getErrorStream();
            }
        } catch (IOException e) {
            throw  new IllegalStateException(e);
        }
    }

    @Override
    public void close() {

    }
}
