package com.leoram.curriculum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="personal_data")
public class PersonalData {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "pd_id", columnDefinition = "VARCHAR(36)")
	private String pdId;
	
	@Column(name = "pd_ident_type", columnDefinition = "VARCHAR(5)")
	private String pdIdentType;
	
	@Column(name="pd_ident_number", columnDefinition = "VARCHAR(15)")
	private String pdIdentNumber;
	
	@Column(name="pd_names", columnDefinition = "VARCHAR(50)")
	private String pdNames;
	
	@Column(name="pd_last_names", columnDefinition = "VARCHAR(50)")
	private String pdLastNames;
	
	@Column(name="pd_adress", columnDefinition = "VARCHAR(100)")
	private String pdAdress;
	
	@Column(name="pd_city", columnDefinition = "VARCHAR(60)")
	private String pdCity;
	
	@Column(name="pd_country", columnDefinition = "VARCHAR(50)")
	private String pdCountry;
	
	@Column(name="pd_nationality", columnDefinition = "VARCHAR(60)")
	private String pdNationality;
	
	@Column(name="pd_language", columnDefinition = "VARCHAR(10)")
	private String pdLanguage;
	
	@Column(name="pd_cellphone", columnDefinition = "VARCHAR(15)")
	private String pdCellPhone;
	
	@Column(name="pd_email", columnDefinition = "VARCHAR(50)")
	private String pdEmail;
	
	@Column(name="pd_photo", columnDefinition = "BYTE[]")
	private byte[] pdPhoto;
	
	@Column(name="pd_profile", columnDefinition = "VARCHAR(500)")
	private String pdProfile;

	public String getPdId() {
		return pdId;
	}

	public void setPdId(String pdId) {
		this.pdId = pdId;
	}

	public String getPdIdentType() {
		return pdIdentType;
	}

	public void setPdIdentType(String pdIdentType) {
		this.pdIdentType = pdIdentType;
	}

	public String getPdIdentNumber() {
		return pdIdentNumber;
	}

	public void setPdIdentNumber(String pdIdentNumber) {
		this.pdIdentNumber = pdIdentNumber;
	}

	public String getPdNames() {
		return pdNames;
	}

	public void setPdNames(String pdNames) {
		this.pdNames = pdNames;
	}

	public String getPdLastNames() {
		return pdLastNames;
	}

	public void setPdLastNames(String pdLastNames) {
		this.pdLastNames = pdLastNames;
	}

	public String getPdAdress() {
		return pdAdress;
	}

	public void setPdAdress(String pdAdress) {
		this.pdAdress = pdAdress;
	}

	public String getPdCity() {
		return pdCity;
	}

	public void setPdCity(String pdCity) {
		this.pdCity = pdCity;
	}

	public String getPdCountry() {
		return pdCountry;
	}

	public void setPdCountry(String pdCountry) {
		this.pdCountry = pdCountry;
	}

	public String getPdNationality() {
		return pdNationality;
	}

	public void setPdNationality(String pdNationality) {
		this.pdNationality = pdNationality;
	}

	public String getPdLanguage() {
		return pdLanguage;
	}

	public void setPdLanguage(String pdLanguage) {
		this.pdLanguage = pdLanguage;
	}

	public String getPdCellPhone() {
		return pdCellPhone;
	}

	public void setPdCellPhone(String pdCellPhone) {
		this.pdCellPhone = pdCellPhone;
	}

	public String getPdEmail() {
		return pdEmail;
	}

	public void setPdEmail(String pdEmail) {
		this.pdEmail = pdEmail;
	}

	public byte[] getPdPhoto() {
		return pdPhoto;
	}

	public void setPdPhoto(byte[] pdPhoto) {
		this.pdPhoto = pdPhoto;
	}

	public String getPdProfile() {
		return pdProfile;
	}

	public void setPdProfile(String pdProfile) {
		this.pdProfile = pdProfile;
	}
	
}
