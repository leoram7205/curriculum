package com.leoram.curriculum.dto;

import java.util.Date;

public class EducationDataDTO {
private String edId;
	
	private String edInstitution;
	
	private String edTitle;
	
	private Date edGraduationDate;
	
	private String edPerson;

	public String getEdId() {
		return edId;
	}

	public void setEdId(String edId) {
		this.edId = edId;
	}

	public String getEdInstitution() {
		return edInstitution;
	}

	public void setEdInstitution(String edInstitution) {
		this.edInstitution = edInstitution;
	}

	public String getEdTitle() {
		return edTitle;
	}

	public void setEdTitle(String edTitle) {
		this.edTitle = edTitle;
	}

	public Date getEdGraduationDate() {
		return edGraduationDate;
	}

	public void setEdGraduationDate(Date edGraduationDate) {
		this.edGraduationDate = edGraduationDate;
	}

	public String getEdPerson() {
		return edPerson;
	}

	public void setEdPerson(String edPerson) {
		this.edPerson = edPerson;
	}
	
}
