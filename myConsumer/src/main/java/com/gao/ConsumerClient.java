package com.gao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerClient {
    public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		HelloService helloService = (HelloService) context.getBean("helloService");
		String result = helloService.speakHello("skyjilygao");
		System.out.println("启动consumer");
		System.out.println(result);
		System.in.read();
	}
}