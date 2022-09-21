package com.leoram.curriculum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="education_data")
public class EducationData {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ed_id", columnDefinition = "VARCHAR(36)")
	private String edId;
	
	@Column(name = "ed_institution", columnDefinition = "VARCHAR(60)")
	private String edInstitution;
	
	@Column(name = "ed_title", columnDefinition = "VARCHAR(60)")
	private String edTitle;
	
	@Column(name = "ed_graduation_date", columnDefinition = "DATE")
	private Date edGraduationDate;
	
	@Column(name = "ed_person", columnDefinition = "VARCHAR(36)")
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
