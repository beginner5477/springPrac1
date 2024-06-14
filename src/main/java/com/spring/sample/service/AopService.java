package com.spring.sample.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AopService {

	public void getAopServiceTest1() {
		log.info("이곳은 AopService 클래스의 getAopServiceTest1메소드입니다.\n");
	}
	public int getAopServiceTest2() {
		log.info("이곳은 AopService 클래스의 getAopServiceTest2메소드입니다.\n");
		int tot = 0;
		for(int i = 1; i <= 100; i++) {
			tot += i;
		}
		System.out.println("1~100까지의 합은: "+tot);
		return tot;
	}
	public void getAopServiceTest3() {
		log.info("이곳은 AopService 클래스의 getAopServiceTest3메소드입니다.\n");
		int i = 0, tot = 0;
		while(i < 100) {
			i++;
			tot += i;
		}
		System.out.println("1에서 100까지의 합:" + tot);
	}
	public void getAopServiceTest4() {
		log.info("이곳은 AopService 클래스의 getAopServiceTest3메소드입니다.\n");
		getAopServiceTest2();
		getAopServiceTest3();
	}
	public void getAopServiceT_5() {
		log.info("이곳은 AopService 클래스의 getAopServiceT_5메소드입니다.\n");
	}

}
