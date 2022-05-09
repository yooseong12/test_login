package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserVO {

	
	int id;
	String firstname;
	String lastname;
	String email;
	String password;
	
}
