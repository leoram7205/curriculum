package com.leoram.curriculum.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.leoram.curriculum.commons.impl.GenericServiceImpl;
import com.leoram.curriculum.dao.EducationDataDAO;
import com.leoram.curriculum.dto.EducationDataDTO;
import com.leoram.curriculum.entity.EducationData;
import com.leoram.curriculum.service.EducationDataService;
import com.leoram.curriculum.utils.MHelpers;

@Service
public class EducationDataServiceImpl extends GenericServiceImpl<EducationData, String> implements EducationDataService{

	@Autowired 
	EducationDataDAO educationDataDao;
	
	@Override
	public CrudRepository<EducationData, String> getDao() {
		return educationDataDao;
	}
	
	@Override
	public List<EducationDataDTO> findAll() {
		List<EducationDataDTO> listaEducationDataDto = new ArrayList<>();
		
		Iterable<EducationData> educationDataIt = this.educationDataDao.findAll();
		
		for(EducationData educationData: educationDataIt) {
			EducationDataDTO educationDataDto = new EducationDataDTO();
			educationDataDto = MHelpers.modelMapper().map(educationData, EducationDataDTO.class);
			listaEducationDataDto.add(educationDataDto);
		}
		
		return listaEducationDataDto;
	}

	@Override
	public EducationDataDTO findByid(String id) {
		Optional<EducationData> educationData = this.educationDataDao.findById(id);
		EducationDataDTO educationDataDto = MHelpers.modelMapper().map(educationData.get(), EducationDataDTO.class);
		
		return educationDataDto;
	}

	@Override
	public EducationDataDTO save(EducationDataDTO educationDataDto) {
		EducationData educationData = new EducationData();
		educationData = MHelpers.modelMapper().map(educationDataDto, EducationData.class);
		educationData =  this.educationDataDao.save(educationData);
		educationDataDto = MHelpers.modelMapper().map(educationData, EducationDataDTO.class);
		
		return educationDataDto;
	}

	@Override
	public void delete(EducationDataDTO educationDataDto) {
		EducationData educationData = new EducationData();
		educationData = MHelpers.modelMapper().map(educationDataDto, EducationData.class);
		this.educationDataDao.delete(educationData);
	}

}
