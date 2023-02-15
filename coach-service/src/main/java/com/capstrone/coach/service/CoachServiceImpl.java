package com.capstrone.coach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstrone.coach.dto.CoachRequest;
import com.capstrone.coach.dto.CoachResponse;
import com.capstrone.coach.dto.CoachSchedules;
import com.capstrone.coach.entity.Coach;
import com.capstrone.coach.repository.CoachRepository;

@Service
public class CoachServiceImpl implements CoachService {
	
	@Autowired
	private CoachRepository coachRepository;

	@Override
	public CoachResponse addNewCoach(CoachRequest coachRequest) {
		Coach coach = new Coach();
		coach.setName(coachRequest.getName());
		coach.setPassword(coachRequest.getPassword());
		coach.setDateOfBirth(coachRequest.getDateOfBirth());
		coach.setGender(coachRequest.getGender());
		coach.setMobileNumber(coachRequest.getMobileNumber());
		coach.setSpeciality(coachRequest.getSpeciality());
		
		coach = coachRepository.save(coach);
		CoachResponse response = new CoachResponse(coach);
		return response;
	}

	@Override
	public CoachResponse loginCoach(CoachRequest coachRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CoachSchedules getCoachSchedules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CoachResponse getCoachprofile(String coachId) {
		// TODO Auto-generated method stub
		return null;
	}

}
