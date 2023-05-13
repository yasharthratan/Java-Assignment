package com.example.dao;

public class Response {

	private String status;
    private String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Response(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + "]";
	}
    
    
}
