package com.leoram.curriculum.service;

import java.util.List;

import com.leoram.curriculum.commons.GenericService;
import com.leoram.curriculum.dto.InformalEducationDTO;
import com.leoram.curriculum.entity.InformalEducation;

public interface InformalEducationService extends GenericService<InformalEducation, String>{
	List<InformalEducationDTO> findAll();
	
	InformalEducationDTO findByid(String id);
	
	InformalEducationDTO save(InformalEducationDTO informalEducationDto);
	
	void delete(InformalEducationDTO informalEducationDto);
}
