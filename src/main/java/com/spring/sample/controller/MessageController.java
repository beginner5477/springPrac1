package com.spring.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {
	
	@RequestMapping(value="/message/{msgFlag}", method=RequestMethod.GET)
	public String getMessage(Model model, @PathVariable String msgFlag) {
		if(msgFlag.equals("memberInputOk")) {
			model.addAttribute("msg","회원가입 성공");
			model.addAttribute("url","/0611/test15");
		} else if(msgFlag.equals("memberInputNo")) {
			model.addAttribute("msg","회원가입 실패");
			model.addAttribute("url","/0611/index");
		}
		return "include/message";
	}
		
	
}
