package com.leoram.curriculum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="personal_skills")
public class PersonalSkills {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ps_id", columnDefinition = "VARCHAR(36)")
	private String psId;
	
	@Column(name = "ps_category", columnDefinition = "VARCHAR(36)")
	private String psCategory;
	
	@Column(name = "ps_desc", columnDefinition = "VARCHAR(50)")
	private String psDesc;
	
	@Column(name = "ps_seniority", columnDefinition = "VARCHAR(50)")
	private String psSeniority;
	
	@Column(name = "ps_person", columnDefinition = "VARCHAR(36)")
	private String psPerson;
	
	@Column(name = "ps_image", columnDefinition = "BYTE[]")
	private byte[] psImage;

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public String getPsCategory() {
		return psCategory;
	}

	public void setPsCategory(String psCategory) {
		this.psCategory = psCategory;
	}

	public String getPsDesc() {
		return psDesc;
	}

	public void setPsDesc(String psDesc) {
		this.psDesc = psDesc;
	}

	public String getPsSeniority() {
		return psSeniority;
	}

	public void setPsSeniority(String psSeniority) {
		this.psSeniority = psSeniority;
	}

	public String getPsPerson() {
		return psPerson;
	}

	public void setPsPerson(String psPerson) {
		this.psPerson = psPerson;
	}

	public byte[] getPsImage() {
		return psImage;
	}

	public void setPsImage(byte[] psImage) {
		this.psImage = psImage;
	}
	
}
