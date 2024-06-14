package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		SungjukVO vo1 = (SungjukVO) ctx.getBean("vo1");
		
		System.out.println("name : "+vo1.getName());
		System.out.println("kor : "+vo1.getKor());
		System.out.println("eng : "+vo1.getEng());
		System.out.println("mat : "+vo1.getMat());
		
		vo1 = (SungjukVO) ctx.getBean("vo2");
		
		System.out.println("name : "+vo1.getName());
		System.out.println("kor : "+vo1.getKor());
		System.out.println("eng : "+vo1.getEng());
		System.out.println("mat : "+vo1.getMat());
		
		vo1 = (SungjukVO) ctx.getBean("vo3");
		System.out.println("name : "+vo1.getName());
		System.out.println("kor : "+vo1.getKor());
		System.out.println("eng : "+vo1.getEng());
		System.out.println("mat : "+vo1.getMat());
		
		ctx.close();
	}
}
