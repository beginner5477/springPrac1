package com.spring.sample.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

//서비스 어노테이션 붙여서 ioc컨테이너에 넣어서 일일히 생성안하고 다른 클래스에서 접근해서 사용가능하게 해주기
@Slf4j
@Service
public class LogTestService {
	 public void getLogTest1() {
		 System.out.println();
		 log.info("이곳은 LogTestService 객체?의 getLogTest1메소드입니다.");
		 System.out.println();
	 }
}
