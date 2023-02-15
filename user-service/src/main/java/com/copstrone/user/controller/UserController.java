package com.copstrone.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copstrone.user.request.UserRequest;
import com.copstrone.user.response.UserResponse;
import com.copstrone.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public UserResponse signUpUser(@RequestBody UserRequest userRequest) {
		return userService.signUpNewUser(userRequest);
	}

	@PostMapping("/login")
	public UserResponse loginUser(@RequestBody UserRequest userRequest) {
		return userService.loginUser(userRequest);
	}

	@GetMapping("/getallusers")
	public List<UserResponse> loadAllUsers(){
		return new ArrayList<UserResponse>();
	}

	
	

}
