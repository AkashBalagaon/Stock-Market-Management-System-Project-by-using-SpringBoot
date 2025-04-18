package com.akash.spring_org_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.spring_org_project.dto.Stock;

public interface StockRepository extends JpaRepository<Stock, String>{

	List<Stock> findByCompanyNameLike(String string);

}
