package com.orange.blog.net.protocol;

/**
 * Created by orange on 16/6/17.
 */
public class RequestProtocol extends BasicProtocol {
    public static String HEART_COMMEND="0002";

    @Override
    public String getCommend() {
        return HEART_COMMEND;
    }
}
