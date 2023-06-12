package com.restApi.project.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForgotPasswordEntity {
	@JsonProperty("Email Id")
	private String email;
	@JsonIgnore
	private String newPass;
	@JsonIgnore
	private String confirmPass;
	public ForgotPasswordEntity() {
	
	}
	public ForgotPasswordEntity(String email, String newPass, String confirmPass) {
		super();
		this.email = email;
		this.newPass = newPass;
		this.confirmPass = confirmPass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	@Override
	public String toString() {
		return "ForgotPasswordModel [email=" + email + ", newPass=" + newPass + ", confirmPass=" + confirmPass + "]";
	}

}
