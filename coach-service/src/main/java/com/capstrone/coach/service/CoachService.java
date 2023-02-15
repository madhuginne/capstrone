package com.capstrone.coach.service;

import com.capstrone.coach.dto.CoachRequest;
import com.capstrone.coach.dto.CoachResponse;
import com.capstrone.coach.dto.CoachSchedules;

public interface CoachService {

	public CoachResponse addNewCoach(CoachRequest coachRequest);

	public CoachResponse loginCoach(CoachRequest coachRequest);

	public CoachSchedules getCoachSchedules();

	public CoachResponse getCoachprofile(String coachId);


}
