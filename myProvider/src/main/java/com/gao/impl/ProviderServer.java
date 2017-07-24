package com.gao.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fahaimac on 2017/7/24.
 */
public class ProviderServer {
    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
            context.start();
            System.out.println("启动provider");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
