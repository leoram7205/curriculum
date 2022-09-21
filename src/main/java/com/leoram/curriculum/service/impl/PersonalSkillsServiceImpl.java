package com.leoram.curriculum.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.leoram.curriculum.commons.impl.GenericServiceImpl;
import com.leoram.curriculum.dao.PersonalSkillsDAO;
import com.leoram.curriculum.dto.PersonalSkillsDTO;
import com.leoram.curriculum.entity.PersonalSkills;
import com.leoram.curriculum.service.PersonalSkillsService;
import com.leoram.curriculum.utils.MHelpers;

@Service
public class PersonalSkillsServiceImpl extends GenericServiceImpl<PersonalSkills, String> implements PersonalSkillsService{

	@Autowired
	PersonalSkillsDAO personalSkillsDao;

	@Override
	public CrudRepository<PersonalSkills, String> getDao() {
		return personalSkillsDao;
	}
	
	@Override
	public List<PersonalSkillsDTO> findAll() {
		List<PersonalSkillsDTO> listaPersonalSkillsDto = new ArrayList<>();
		
		Iterable<PersonalSkills> personalSkillsIt = this.personalSkillsDao.findAll();
		
		for(PersonalSkills personalSkills: personalSkillsIt) {
			PersonalSkillsDTO personalSkillsDto = new PersonalSkillsDTO();
			personalSkillsDto = MHelpers.modelMapper().map(personalSkills, PersonalSkillsDTO.class);
			listaPersonalSkillsDto.add(personalSkillsDto);
		}
		
		return listaPersonalSkillsDto;
	}

	@Override
	public PersonalSkillsDTO findByid(String id) {
		Optional<PersonalSkills> personalSkills = this.personalSkillsDao.findById(id);
		PersonalSkillsDTO personalSkillsDto = MHelpers.modelMapper().map(personalSkills.get(), PersonalSkillsDTO.class);
		
		return personalSkillsDto;
	}

	@Override
	public PersonalSkillsDTO save(PersonalSkillsDTO personalSkillsDto) {
		PersonalSkills personalSkills = new PersonalSkills();
		personalSkills = MHelpers.modelMapper().map(personalSkillsDto, PersonalSkills.class);
		personalSkills =  this.personalSkillsDao.save(personalSkills);
		personalSkillsDto = MHelpers.modelMapper().map(personalSkills, PersonalSkillsDTO.class);
		
		return personalSkillsDto;
	}

	@Override
	public void delete(PersonalSkillsDTO personalSkillsDto) {
		PersonalSkills personalSkills = new PersonalSkills();
		personalSkills = MHelpers.modelMapper().map(personalSkillsDto, PersonalSkills.class);
		this.personalSkillsDao.delete(personalSkills);
	}

	@Override
	public PersonalSkillsDTO updatePhoto(MultipartFile archivo, String id) {
		PersonalSkillsDTO personalSkillsDto = new PersonalSkillsDTO();
		try {
			personalSkillsDto.setPsImage(archivo.getBytes());
			personalSkillsDto.setPsId(id);
		}catch (Exception e) {
			// TODO: handle exception
		}
		personalSkillsDto = this.save(personalSkillsDto);
				
		return personalSkillsDto;
	}

}
