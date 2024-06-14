package com.spring.sample.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString		//롬복사용하기 

@Data			//이건 위에 3개 포함 근데 에러가 잘남 
//롬복 쓸때는 nName이런식으로 2번째 글자에 대문자 케이스일때 오류남 그럴땐 스네이크표기법 or 첫번째도 대문자로 바꿔주자.. 
public class S0612VO {
	private String mid;
	private String pwd;
	private int age;
	private int sex;
	private String name;
}
