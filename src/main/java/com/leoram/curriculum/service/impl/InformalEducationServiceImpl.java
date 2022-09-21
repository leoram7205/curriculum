package com.leoram.curriculum.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.leoram.curriculum.commons.impl.GenericServiceImpl;
import com.leoram.curriculum.dao.InformalEducationDAO;
import com.leoram.curriculum.dto.InformalEducationDTO;
import com.leoram.curriculum.entity.InformalEducation;
import com.leoram.curriculum.service.InformalEducationService;
import com.leoram.curriculum.utils.MHelpers;

@Service
public class InformalEducationServiceImpl extends GenericServiceImpl<InformalEducation, String> implements InformalEducationService{

	@Autowired
	InformalEducationDAO informalEducationDao;
	
	@Override
	public CrudRepository<InformalEducation, String> getDao() {
		return informalEducationDao;
	}
	
	@Override
	public List<InformalEducationDTO> findAll() {
		List<InformalEducationDTO> listaInformalEducationDto = new ArrayList<>();
		
		Iterable<InformalEducation> informalEducationIt = this.informalEducationDao.findAll();
		
		for(InformalEducation informalEducation: informalEducationIt) {
			InformalEducationDTO informalEducationDto = new InformalEducationDTO();
			informalEducationDto = MHelpers.modelMapper().map(informalEducation, InformalEducationDTO.class);
			listaInformalEducationDto.add(informalEducationDto);
		}
		
		return listaInformalEducationDto;
	}

	@Override
	public InformalEducationDTO findByid(String id) {
		Optional<InformalEducation> informalEducation = this.informalEducationDao.findById(id);
		InformalEducationDTO informalEducationDto = MHelpers.modelMapper().map(informalEducation.get(), InformalEducationDTO.class);
		
		return informalEducationDto;
	}

	@Override
	public InformalEducationDTO save(InformalEducationDTO informalEducationDto) {
		InformalEducation informalEducation = new InformalEducation();
		informalEducation = MHelpers.modelMapper().map(informalEducationDto, InformalEducation.class);
		informalEducation =  this.informalEducationDao.save(informalEducation);
		informalEducationDto = MHelpers.modelMapper().map(informalEducation, InformalEducationDTO.class);
		
		return informalEducationDto;
	}

	@Override
	public void delete(InformalEducationDTO informalEducationDto) {
		InformalEducation informalEducation = new InformalEducation();
		informalEducation = MHelpers.modelMapper().map(informalEducationDto, InformalEducation.class);
		this.informalEducationDao.delete(informalEducation);
	}

}
