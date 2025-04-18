package com.akash.spring_org_project.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.spring_org_project.dto.UserStocksTransaction;

public interface UserStocksTransactionRepository extends JpaRepository<UserStocksTransaction, Integer>{

}
