package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebSiteRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webSite.xml");
		WebSiteInfor vo = (WebSiteInfor) ctx.getBean("vo1");
		System.out.println(vo);
		
		ctx.close();
	}
}
