package com.leoram.curriculum.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.leoram.curriculum.commons.GenericService;
import com.leoram.curriculum.dto.PersonalDataDTO;
import com.leoram.curriculum.entity.PersonalData;

public interface PersonalDataService extends GenericService<PersonalData, String>{
	
	List<PersonalDataDTO> findAll();
	
	PersonalDataDTO findByid(String id);
	
	PersonalDataDTO save(PersonalDataDTO personalDataDto);
	
	void delete(PersonalDataDTO personalDataDto);
	
	PersonalDataDTO updatePhoto(MultipartFile archivo, String id);
}
