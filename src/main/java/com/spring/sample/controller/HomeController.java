package com.spring.sample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.sample.service.LogTestService;

import lombok.extern.slf4j.Slf4j;

//롬복 사용방식

@Slf4j
@Controller
public class HomeController {
	
	//로거 객체 사용방식
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//ioc컨테이너에 들어간 빈 가져오는 어노테이션
	@Autowired
	LogTestService logTestService;
	
	/* @RequestMapping(value = "/", method = RequestMethod.GET) */
	@RequestMapping(value = {"/","/home","/index","/main","/h"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model, String msg) {
		//locale은 국가 설정
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("msg",msg);
		return "home";
	}
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	@GetMapping("/0611/index")
//	public String getIndex(Model model) {
//		model.addAttribute("data","이것은 홈 컨트롤러에서 실어준 값");
//		return "0611/index";
//	}
//	@GetMapping("/0611/test1")
//	public String getTest1() {
//		
//		return "0611/test1";
//	}
	
	
	
	/*
	 	log level의 5가지 (자세한정도) : trace > debug > info > warn < error 
	 */
	@RequestMapping(value="/logTest", method=RequestMethod.GET)
	public String getLogTest(Model model) {
		Date today = new Date();
		System.out.println();
		//로거 객체 사용한것
		logger.info("logger 객체를 이용한 출력");
		logger.trace("trace: {}",today);
		logger.debug("debug: {}",today);
		logger.info("info: {}",today);
		logger.warn("warn: {}",today);
		logger.error("error: {}",today);
		
		//롬복 사용한것
		System.out.println();
		log.info("롬복 이용한 출력");
		log.trace("trace: {}",today);
		log.debug("debug: {}",today);
		log.info("info: {}",today);
		log.warn("warn: {}",today);
		log.error("error: {}",today);
		
		
		//서비스객체 호출하여 로그 찍어보기
		//자바 방식임 생성하는것
//		LogTestService logTest = new LogTestService();
//		logTest.getLogTest1();
		logTestService.getLogTest1();
		
		model.addAttribute("msg","로그파일을 출력합니다 콘솔창에서 확인하세용");
		return "redirect:/";
	}
}
