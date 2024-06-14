package com.spring.sample.s0613;

import java.util.Scanner;

public class SungRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("성명을 입력하세요:");
		String name = sc.next();
		System.out.print("국어을 입력하세요:");
		int kor = sc.nextInt();
		System.out.print("영어을 입력하세요:");
		int eng = sc.nextInt();
		System.out.print("수학을 입력하세요:");
		int mat = sc.nextInt();
		
		SungVO vo = new SungVO(name,kor,eng,mat);
		vo.getService().getLine();
		vo.getService().printTitle();
		vo.SungPrint();
		vo.getService().getLine();
		
		sc.close();
	}
}
