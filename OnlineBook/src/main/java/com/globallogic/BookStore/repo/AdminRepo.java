package com.globallogic.BookStore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.entity.admin;

public interface AdminRepo extends JpaRepository<admin, Long> {
	
public List<admin> findByPhone(long phone);
}
