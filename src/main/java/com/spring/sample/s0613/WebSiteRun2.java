package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebSiteRun2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webSite2.xml");
		WebSiteInfor2 infor2 = (WebSiteInfor2) ctx.getBean("infor2");
		System.out.println(infor2);
		
		ctx.close();
	}
}
