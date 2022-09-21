package com.leoram.curriculum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="informal_education")
public class InformalEducation {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ie_id", columnDefinition = "VARCHAR(36)")
	private String ieId;
	
	@Column(name = "ie_institution", columnDefinition = "VARCHAR(60)")
	private String ieInstitution;
	
	@Column(name = "ie_desc", columnDefinition = "VARCHAR(60)")
	private String ieDesc;
	
	@Column(name = "ie_date", columnDefinition = "DATE")
	private Date ieDate;
	
	@Column(name = "ie_person", columnDefinition = "VARCHAR(36)")
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
