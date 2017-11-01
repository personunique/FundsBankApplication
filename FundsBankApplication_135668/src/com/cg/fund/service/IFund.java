package com.cg.fund.service;

import com.cg.fund.model.Fund;

public interface IFund {

	void addDetails(Fund bean);

	void moreInfo(Fund fund);

	Fund getById(int complaintId);

}
