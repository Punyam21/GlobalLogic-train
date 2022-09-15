package com.micro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.employee.entity.Emplo;

@Repository
public interface EmploRepo extends JpaRepository<Emplo,Integer>{

}
