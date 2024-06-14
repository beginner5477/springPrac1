package com.spring.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class AspectTest {
	/*
	//Advice
	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")	//PointCut설정(사용범위를 설정한다.): ("execution(타입 패키지명.클래스명.메소드명(매개변수))")
	public void AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 타겟 메소드 실행전 어라운드 어드바이스입니다." + joinPoint);
		joinPoint.proceed();	//여기가 타겟 메소드가 실행되는 시점임
		System.out.println("이곳은 타겟 메소드 실행후 어라운드 어드바이스입니다." + joinPoint);
	}
	
	//Before
	@Before("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")	//PointCut설정(사용범위를 설정한다.): ("execution(타입 패키지명.클래스명.메소드명(매개변수))")
	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 before 어드바이스입니다.");
	}
	
	//AfterReturning
	@AfterReturning("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")	//PointCut설정(사용범위를 설정한다.): ("execution(타입 패키지명.클래스명.메소드명(매개변수))")
	public void AfterReturningAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 AfterReturning 어드바이스입니다.");
	}
	*/
	
	/*
	@Pointcut("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")
	private void cut() {}
	
	@Before("cut()")
	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 before 어드바이스입니다." + joinPoint);
	}
	@AfterReturning("cut()")	
	public void AfterReturningAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 AfterReturning 어드바이스입니다.");
	}
	*/
	
//	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
//	public void aroundAdvice() {
//		System.out.println("이곳은 aroundAdvice메소드입니다.");
//	}
	
	@AfterReturning(value="execution(* com.spring.sample.service.AopService.getAopServiceTest2(..))", returning="obj")
	public void AfterReturningAdvice(Object obj) {
		System.out.println("이곳은 AfterReturningAdvice메소드입니다." + obj);
	}
	
	/*
	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("이곳은 aroundAdvice메소드입니다.");
		long startTime = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long endTime = System.nanoTime();
			long executionTime = endTime - startTime;
			System.out.println("수행시간: "+executionTime+"[ns]");
		}
		
	}
	*/
}
