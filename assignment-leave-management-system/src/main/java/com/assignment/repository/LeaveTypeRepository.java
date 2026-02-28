package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.LeaveType;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long> {

}
