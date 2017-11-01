package com.cg.fund.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.cg.fund.model.Fund;

@Repository
public class FundDao implements IDaoFund {
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public void addDetails(Fund fund) {
		entityManager.persist(fund);
	}



	@Override
	public Fund getById(int complaintId) {
		Fund fund = entityManager.find(Fund.class, complaintId);
		return fund;
		
	}

}
