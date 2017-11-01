package com.cg.fund.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.fund.Dao.IDaoFund;
import com.cg.fund.model.Fund;

@Service
@Transactional
public class FundService implements IFund{
	@Autowired
	private IDaoFund dao;

	@Override
	public void addDetails(Fund bean) {
		dao.addDetails(bean);
		
	}

	@Override
	public void moreInfo(Fund fund) {
		if(fund.getCompCat().equals("Internet Banking")){
			fund.setPriority("High");
			fund.setStatus("Open");
		}
		else if(fund.getCompCat().equals("General Banking")){
			fund.setPriority("Medium");
			fund.setStatus("Open");
		}
		else if(fund.getCompCat().equals("Others")){
			fund.setPriority("Low");
			fund.setStatus("Open");
		}
		else
		{
			fund.setStatus("Closed");
		}
		
	}

	@Override
	public Fund getById(int complaintId) {
		
		return dao.getById(complaintId);
	}
	
	
	
	
}
