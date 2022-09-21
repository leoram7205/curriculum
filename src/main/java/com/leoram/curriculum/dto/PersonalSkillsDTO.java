package com.leoram.curriculum.dto;

public class PersonalSkillsDTO {
	private String psId;
	
	private String psCategory;
	
	private String psDesc;
	
	private String psSeniority;
	
	private String psPerson;
	
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
