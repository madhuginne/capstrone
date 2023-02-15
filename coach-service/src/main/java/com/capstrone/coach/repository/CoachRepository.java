package com.capstrone.coach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstrone.coach.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer> {

}
