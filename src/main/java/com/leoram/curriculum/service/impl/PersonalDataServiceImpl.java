package com.leoram.curriculum.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.leoram.curriculum.commons.impl.GenericServiceImpl;
import com.leoram.curriculum.dao.PersonalDataDAO;
import com.leoram.curriculum.dto.PersonalDataDTO;
import com.leoram.curriculum.entity.PersonalData;
import com.leoram.curriculum.service.PersonalDataService;
import com.leoram.curriculum.utils.MHelpers;

@Service
public class PersonalDataServiceImpl extends GenericServiceImpl<PersonalData, String> implements PersonalDataService{
	
	@Autowired
	PersonalDataDAO personalDataDao;

	@Override
	public CrudRepository<PersonalData, String> getDao() {
		return personalDataDao;
	}
	
	@Override
	public List<PersonalDataDTO> findAll() {
		List<PersonalDataDTO> listaPersonalDataDto = new ArrayList<>();
		
		Iterable<PersonalData> personalDataIt = this.personalDataDao.findAll();
		
		for(PersonalData personalData: personalDataIt) {
			PersonalDataDTO personalDataDto = new PersonalDataDTO();
			personalDataDto = MHelpers.modelMapper().map(personalData, PersonalDataDTO.class);
			listaPersonalDataDto.add(personalDataDto);
		}
		
		return listaPersonalDataDto;
	}

	@Override
	public PersonalDataDTO findByid(String id) {
		Optional<PersonalData> personalData = this.personalDataDao.findById(id);
		PersonalDataDTO personalDataDto = MHelpers.modelMapper().map(personalData.get(), PersonalDataDTO.class);
		
		return personalDataDto;
	}

	@Override
	public PersonalDataDTO save(PersonalDataDTO personalDataDto) {
		PersonalData personalData = new PersonalData();
		personalData = MHelpers.modelMapper().map(personalDataDto, PersonalData.class);
		personalData =  this.personalDataDao.save(personalData);
		personalDataDto = MHelpers.modelMapper().map(personalData, PersonalDataDTO.class);
		
		return personalDataDto;
	}

	@Override
	public void delete(PersonalDataDTO personalDataDto) {
		PersonalData personalData = new PersonalData();
		personalData = MHelpers.modelMapper().map(personalDataDto, PersonalData.class);
		this.personalDataDao.delete(personalData);
	}

	@Override
	public PersonalDataDTO updatePhoto(MultipartFile archivo, String id) {
		PersonalDataDTO personalDataDto = this.findByid(id);
		try {
			personalDataDto.setPdPhoto(archivo.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personalDataDto = this.save(personalDataDto);
				
		return personalDataDto;
	}
}
