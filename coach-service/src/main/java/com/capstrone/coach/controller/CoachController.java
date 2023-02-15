package com.capstrone.coach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstrone.coach.dto.CoachRequest;
import com.capstrone.coach.dto.CoachResponse;
import com.capstrone.coach.dto.CoachSchedules;
import com.capstrone.coach.service.CoachService;

@RestController
@RequestMapping("/api/coach")
public class CoachController {

	@Autowired
	private CoachService coachService;

	@PostMapping("/signup")
	public CoachResponse signUpCoach(@RequestBody CoachRequest coachRequest) {
		return coachService.addNewCoach(coachRequest);
	}

	@PostMapping("/login")
	public CoachResponse loginCoach(@RequestBody CoachRequest coachRequest) {
		return coachService.loginCoach(coachRequest);
	}

	@GetMapping("/viewprofile")
	public CoachResponse loadCoachProfile(@RequestParam String coachId) {
		return coachService.getCoachprofile(coachId);
	}

	@GetMapping("/coachschedules")
	public CoachSchedules loadCoachSchedules() {
		return coachService.getCoachSchedules();
	}

}
