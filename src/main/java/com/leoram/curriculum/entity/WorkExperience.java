package com.leoram.curriculum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="work_experience")
public class WorkExperience {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "we_id", columnDefinition = "VARCHAR(36)")
	private String weId;
	
	@Column(name = "we_company", columnDefinition = "VARCHAR(100)")
	private String weCompany;
	
	@Column(name = "we_date_from", columnDefinition = "DATE")
	private Date weDateFrom;

	@Column(name = "we_date_to", columnDefinition = "DATE")
	private Date weDateTo;
	
	@Column(name = "we_position", columnDefinition = "VARCHAR(100)")
	private String wePosition;
	
	@Column(name = "we_desc", columnDefinition = "VARCHAR(500)")
	private String weDesc;
	
	@Column(name = "we_person", columnDefinition = "VARCHAR(36)")
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
