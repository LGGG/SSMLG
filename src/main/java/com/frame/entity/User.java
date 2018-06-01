package com.frame.entity;

public class User {
	private int id;
	private String uname,upassword,slogan;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return uname;
	}
	public void setUsername(String username) {
		this.uname = username;
	}
	public String getPassword() {
		return upassword;
	}
	public void setPassword(String password) {
		this.upassword = password;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
}
