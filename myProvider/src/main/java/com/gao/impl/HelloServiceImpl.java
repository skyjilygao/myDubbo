package com.gao.impl;

import com.gao.HelloService;

/**
 * Created by fahaimac on 2017/7/24.
 */
public class HelloServiceImpl implements HelloService {
    public String speakHello(String name) {
        return "你好："+name+" welcome my blog...";
    }
}
