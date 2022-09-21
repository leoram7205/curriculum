package com.leoram.curriculum.service;

import java.util.List;

import com.leoram.curriculum.commons.GenericService;
import com.leoram.curriculum.dto.WorkExperienceDTO;
import com.leoram.curriculum.entity.WorkExperience;

public interface WorkExperienceService extends GenericService<WorkExperience, String>{
	List<WorkExperienceDTO> findAll();
	
	WorkExperienceDTO findByid(String id);
	
	WorkExperienceDTO findBycoWorkExperienceSfl(String id);
	
	WorkExperienceDTO save(WorkExperienceDTO workExperienceDto);
	
	void delete(WorkExperienceDTO workExperienceDto);
}
