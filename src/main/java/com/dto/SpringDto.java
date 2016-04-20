package com.dto;


public class SpringDto {
	
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void sayHello(){
		System.out.println(msg); 
	}

}
