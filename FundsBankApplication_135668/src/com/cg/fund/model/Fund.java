package com.cg.fund.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Complaint")
public class Fund implements Serializable{
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="complaintid")
private int complaintId;

@NotNull(message="Id is required")
@Length(min=10,max=10 ,message="It can accept only 10 digits")
/*@Pattern(regexp="[0-9]{10}", message = "Enter account Id of 10 digits")
*/@Column(name="accountid")
private String accountId;

@NotEmpty(message="Branch code is required")
@Column(name="branchcode")
private String branchCode;

@NotEmpty(message="Email is required")
@Column(name="emailid")
@Email(message = "Enter valid email Id")
private String emailId;

@NotEmpty(message="Complaint Category is required")
@Column(name="category")
private String compCat;

@NotEmpty(message="Description is required")
@Column(name="description")
private String desc;

@Column(name="priority")
private String priority;

@Column(name="status")
private String status;





public int getComplaintId() {
	return complaintId;
}
public void setComplaintId(int complaintId) {
	this.complaintId = complaintId;
}
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public String getBranchCode() {
	return branchCode;
}
public void setBranchCode(String branchCode) {
	this.branchCode = branchCode;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getCompCat() {
	return compCat;
}
public void setCompCat(String compCat) {
	this.compCat = compCat;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
