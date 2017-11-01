package com.cg.fund.Dao;

import com.cg.fund.model.Fund;

public interface IDaoFund {

	void addDetails(Fund bean);

	Fund getById(int complaintId);

}
