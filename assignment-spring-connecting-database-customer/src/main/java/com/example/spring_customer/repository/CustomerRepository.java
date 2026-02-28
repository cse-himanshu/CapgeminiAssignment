package com.example.spring_customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
