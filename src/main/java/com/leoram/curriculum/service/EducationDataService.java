package com.leoram.curriculum.service;

import java.util.List;

import com.leoram.curriculum.commons.GenericService;
import com.leoram.curriculum.dto.EducationDataDTO;
import com.leoram.curriculum.entity.EducationData;


public interface EducationDataService extends GenericService<EducationData, String>{
	List<EducationDataDTO> findAll();
	
	EducationDataDTO findByid(String id);
	
	EducationDataDTO save(EducationDataDTO educationDataDto);
	
	void delete(EducationDataDTO educationDataDto);
}
