package com.akash.spring_org_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.spring_org_project.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);

	Optional<User> findByEmail(String email);

}
