package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Calendar;

public interface CalendarRepo extends JpaRepository<Calendar, Integer> {

}
