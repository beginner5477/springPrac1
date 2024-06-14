package com.spring.sample.s0613;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class WebSiteInfor2 {
	private String driver;
	private String url;
	private String user;
	private String password;
}
