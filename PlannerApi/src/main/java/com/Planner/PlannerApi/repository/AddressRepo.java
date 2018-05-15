package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
