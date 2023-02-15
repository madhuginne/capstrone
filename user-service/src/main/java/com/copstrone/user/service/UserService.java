package com.copstrone.user.service;

import com.copstrone.user.request.UserRequest;
import com.copstrone.user.response.UserResponse;

public interface UserService {

	public UserResponse signUpNewUser(UserRequest userRequest);

	public UserResponse loginUser(UserRequest userRequest);

}
