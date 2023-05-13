package com.example.dao;

public class Request {

	private String username;
    private String action;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Request [username=" + username + ", action=" + action + "]";
	}
	public Request(String username, String action) {
		super();
		this.username = username;
		this.action = action;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
