package com.spring.sample.vo;

public class S0611VO {
	private String name;
	private String mid;
	private String pwd;
	private int age;
	private int sex;
	public String getMid() {
		return mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "S0611VO [mid=" + mid + ", pwd=" + pwd + ", age=" + age + ", sex=" + sex + ", getMid()=" + getMid()
				+ ", getPwd()=" + getPwd() + ", getAge()=" + getAge() + ", getSex()=" + getSex() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
