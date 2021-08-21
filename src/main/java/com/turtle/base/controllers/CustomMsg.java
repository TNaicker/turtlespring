package com.turtle.base.controllers;

public class CustomMsg {
	
	private final long id;
	private final String money;
	private final String taco;
	private final String content; 

	public CustomMsg(long id, String money, String content, String taco) {
		this.id = id;
		this.money = money;
		this.taco = taco;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public String getMoney() {
		return money;
	}
	
	public String getTaco() {
		return taco;
	}

}
