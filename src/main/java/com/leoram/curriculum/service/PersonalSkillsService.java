package com.leoram.curriculum.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.leoram.curriculum.commons.GenericService;
import com.leoram.curriculum.dto.PersonalSkillsDTO;
import com.leoram.curriculum.entity.PersonalSkills;

public interface PersonalSkillsService extends GenericService<PersonalSkills, String>{
	List<PersonalSkillsDTO> findAll();
	
	PersonalSkillsDTO findByid(String id);
	
	PersonalSkillsDTO save(PersonalSkillsDTO personalSkillsDto);
	
	void delete(PersonalSkillsDTO personalSkillsDto);
	
	PersonalSkillsDTO updatePhoto(MultipartFile archivo, String id);
}
