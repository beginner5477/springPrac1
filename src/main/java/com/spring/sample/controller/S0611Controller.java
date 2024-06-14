package com.spring.sample.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.sample.vo.S0611VO;
import com.spring.sample.vo.S0612VO;

@Controller
@RequestMapping("/0611")
public class S0611Controller {
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String getIndex() {
		
		return "0611/index";
	}
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String getTest1(HttpServletRequest request) {
		String mid = request.getParameter("mid");
		String pwd = request.getParameter("pwd");
		
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		return "0611/test1";
	}
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String getTest2(String mid, String pwd, Model model, int age, int sex) {
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		model.addAttribute("age",age - 1);
		if(sex == 1 || sex == 3) {
			model.addAttribute("sex", "남자");
		} else {
			model.addAttribute("sex", "여자");
		}
		return "0611/test2";
	}
	@RequestMapping(value="/test3", method = RequestMethod.GET)
	public String getTest3(String mid, String pwd, Model model, int age,
//			@RequestParam(name="sex") int gender
			@RequestParam(name="sex", defaultValue = "1", required = false) int gender
			) {
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		model.addAttribute("age",age - 1);
		if(gender == 1 || gender == 3) {
			model.addAttribute("sex", "남자");
		} else {
			model.addAttribute("sex", "여자");
		}
		return "0611/test3";
	}
	@RequestMapping(value="/test4", method = RequestMethod.GET)
	public String getTest4(String mid, String pwd, Model model, int age,
			@RequestParam(name="sex", defaultValue = "1", required = false) int gender
			) {
		
		S0611VO vo = new S0611VO();
		vo.setMid(mid);
		vo.setPwd(pwd);
		vo.setAge(age);
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		model.addAttribute("age",age - 1);
		model.addAttribute("vo",vo);
		if(gender == 1 || gender == 3) {
			model.addAttribute("sex", "남자");
		} else {
			model.addAttribute("sex", "여자");
		}
		return "0611/test4";
	}
	@RequestMapping(value="/test5", method = RequestMethod.GET)
	public String getTest5(S0611VO vo, Model model) {
		
		if(vo.getSex() == 1 || vo.getSex() == 3) {
			model.addAttribute("sex", "남자");
		} else {
			model.addAttribute("sex", "여자");
		}
		return "0611/test5";
	}
	@RequestMapping(value="/test7", method = RequestMethod.POST)
	public ModelAndView getTest7(S0611VO vo, Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("vo",vo);
		mv.setViewName("0611/test7");
		return mv;
	}
	@PostMapping("/test8")
	public ModelAndView getTest8(S0611VO vo, Model model, HttpServletRequest request) throws UnsupportedEncodingException {
//		request.setCharacterEncoding("UTF-8");	의미없다 왜냐는 공부해보자..
		ModelAndView mv = new ModelAndView();
		model.addAttribute("vo",vo);
		mv.setViewName("0611/test8");
		return mv;
	}
	
	@GetMapping("/test6")
	public ModelAndView getTest6(S0611VO vo, Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("vo",vo);
		mv.setViewName("0611/test6");
//		return "0611/test6";
		return mv;
	}
//	@GetMapping("/test9")
	@RequestMapping(value = "/test9", method = RequestMethod.GET)
	public String getTest9() {
		return "0611/test9";
	}
	@RequestMapping(value = "/test9", method = RequestMethod.POST)
	public String postTest9(S0612VO vo, Model model) {
		model.addAttribute("vo",vo);
		return "0611/test9";
	}
	@RequestMapping(value = "/test10", method = RequestMethod.GET)
	public String getTest10(S0612VO vo, Model model) {
		model.addAttribute("vo",vo);
		return "0611/test10";
	}
	@RequestMapping(value = "/test10", method = RequestMethod.POST)
	public String postTest10(S0612VO vo, Model model) {
		String viewPage = "";
		if(vo.getMid().substring(0,1).equals("a")) {
			model.addAttribute("msg","회원가입되었습니다.");
			viewPage = "0611/test10Ok";
		} else {
			model.addAttribute("msg","회원실패되었습니다.");
			viewPage = "0611/test10";
		}
		model.addAttribute("vo",vo);
		return viewPage;
	}
	
	@RequestMapping(value = "/test11", method = RequestMethod.GET)
	public String getTest11(Model model, 
			@RequestParam(name="name", defaultValue = "김도완", required = false) String name,
			@RequestParam(name="age", defaultValue = "30", required = false) String age
			) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "0611/test11";
	}
	@RequestMapping(value = "/test11", method = RequestMethod.POST)
	public String postTest11(Model model, 
			String name,
			String age
			) {
		String viewPage = "";
		if(name.equals("김도완")) {
			model.addAttribute("msg","회원가입완료요");
			viewPage = "0611/test10Ok";
		} else {
			model.addAttribute("msg","회원가입실패");
			//리다이렉트 붙이면 context.xml에 설정해둔 prefix랑 suffix 무시한다는 뜻임
			//즉 해석해보면 뷰페이지로 안보내고 재 명령으로다가 컨트롤러로 다시보낸다는 것임.
			//model 저장소는 리다이렉트로 다시 컨트롤러로 보내면 다시 받아서 실어줘야댐 
			//당연한게 첨에 모델로 선언해서 다른 객체? 같기도 하고 그냥 확실하게 다시 받아서 실어주자
			viewPage = "redirect:/0611/test11";
		}
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return viewPage;
	}
	
	
	@RequestMapping(value = "/test12/{mid}/{pwd}", method = RequestMethod.GET)
	public String getTest12(Model model, @PathVariable String mid, @PathVariable String pwd) {
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		return "0611/test12";
	}
	@GetMapping("/test13")
	public String getTest13() {
		
		return "0611/test13";
	}
	@GetMapping("/test13/{mid}/{pwd}")
	public String getTest13(Model model, @PathVariable String mid, @PathVariable String pwd) {
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		return "0611/test13Ok";
	}
	@GetMapping("/test14")
	public String getTest14() {
		
		return "0611/test14";
	}
	//패쓰 베리어블 방식일때 중간 구분자는 지좆대로 써도댐 ㅇㅇ 대신 넘기고 받을 때 똑같이 써줘야댐 
	//대신 넘길때 중간에 섞어서 보내면  받을 때도 어노테이션에서 일치 시켜줘야댐 
	@GetMapping("/test14/{mid}-{pwd}")
	public String getTest14(Model model, @PathVariable String mid, @PathVariable String pwd) {
		model.addAttribute("mid",mid);
		model.addAttribute("pwd",pwd);
		return "0611/test14Ok";
	}
	@RequestMapping(value = "/test15", method = RequestMethod.GET)
	public String getTest15() {
		
		return "0611/test15";
	}
	@RequestMapping(value = "/test15", method = RequestMethod.POST)
	public String postTest15(S0612VO vo, Model model) {
//		if(vo.getMid().substring(0,1).equals("a")) {
//			model.addAttribute("vo",vo);
//			model.addAttribute("msg","회원가입 성공");
//			model.addAttribute("url","/0611/test15");
//		} else {
//			model.addAttribute("msg","회원가입 실패");
//			model.addAttribute("url","/0611/index");
//		}
//		return "redirect:/message";
		if(vo.getMid().substring(0,1).equals("a")) {
			return "redirect:/message/memverInputOk";
		} else {
			return "redirect:/message/memverInputNo";
		}
	}
	
}
