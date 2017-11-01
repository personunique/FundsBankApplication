package com.cg.fund.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestParam;

import com.cg.fund.model.Fund;
import com.cg.fund.service.IFund;

@Controller
public class FundController {
	@Autowired
	IFund service;
	
	@RequestMapping("/index")
	public String goToStart(Model m){
		m.addAttribute("bean",new Fund());
		return "index";
	}
	
	@RequestMapping("/start")
	public String registration(@ModelAttribute("bean") @Valid Fund fund, BindingResult result, Model m){
		
		if(result.hasErrors()){
			return "index";
		}
		else{
			service.moreInfo(fund);
			service.addDetails(fund);
			m.addAttribute("k", fund);
			return "Success";
			
		}
		
		}
	@RequestMapping("/status")
	public String statusPage(){
		return "status";
	}
	@RequestMapping("/checkStatus")
	public String goToStatus(@RequestParam("complaintId") int complaintId, Model model){
		Fund fund=service.getById(complaintId);
		model.addAttribute("fund", fund);
		return "status";
		
		
	}
}
