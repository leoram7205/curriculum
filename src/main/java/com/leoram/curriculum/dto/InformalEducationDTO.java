package com.leoram.curriculum.dto;

import java.util.Date;

public class InformalEducationDTO {
	private String ieId;
	
	private String ieInstitution;
	
	private String ieDesc;
	
	private Date ieDate;
	
	private String iePerson;

	public String getIeId() {
		return ieId;
	}

	public void setIeId(String ieId) {
		this.ieId = ieId;
	}

	public String getIeInstitution() {
		return ieInstitution;
	}

	public void setIeInstitution(String ieInstitution) {
		this.ieInstitution = ieInstitution;
	}

	public String getIeDesc() {
		return ieDesc;
	}

	public void setIeDesc(String ieDesc) {
		this.ieDesc = ieDesc;
	}

	public Date getIeDate() {
		return ieDate;
	}

	public void setIeDate(Date ieDate) {
		this.ieDate = ieDate;
	}

	public String getIePerson() {
		return iePerson;
	}

	public void setIePerson(String iePerson) {
		this.iePerson = iePerson;
	}
	
}
