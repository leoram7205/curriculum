package com.leoram.curriculum.dto;

import java.util.Date;

public class WorkExperienceDTO {
	private String weId;
	
	private String weCompany;
	
	private Date weDateFrom;

	private Date weDateTo;
	
	private String wePosition;
	
	private String weDesc;
	
	private String wePerson;

	public String getWeId() {
		return weId;
	}

	public void setWeId(String weId) {
		this.weId = weId;
	}

	public String getWeCompany() {
		return weCompany;
	}

	public void setWeCompany(String weCompany) {
		this.weCompany = weCompany;
	}

	public Date getWeDateFrom() {
		return weDateFrom;
	}

	public void setWeDateFrom(Date weDateFrom) {
		this.weDateFrom = weDateFrom;
	}

	public Date getWeDateTo() {
		return weDateTo;
	}

	public void setWeDateTo(Date weDateTo) {
		this.weDateTo = weDateTo;
	}

	public String getWePosition() {
		return wePosition;
	}

	public void setWePosition(String wePosition) {
		this.wePosition = wePosition;
	}

	public String getWeDesc() {
		return weDesc;
	}

	public void setWeDesc(String weDesc) {
		this.weDesc = weDesc;
	}

	public String getWePerson() {
		return wePerson;
	}

	public void setWePerson(String wePerson) {
		this.wePerson = wePerson;
	}
	
	
}
