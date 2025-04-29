package com.chj.gr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Data
public class UserDto {

	private long id;
	private String login;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String token;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private char[] password;

	public UserDto() {
		super();
	}

	public UserDto(long id, String login, String token, char[] password) {
		super();
		this.id = id;
		this.login = login;
		this.token = token;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

}
