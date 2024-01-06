package com.parthu.binding;

public class LogInForm {
	
	private String email;
	private String pwd;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "LogInForm [email=" + email + ", pwd=" + pwd + "]";
	}
	
	

}
