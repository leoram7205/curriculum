package com.leoram.curriculum.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leoram.curriculum.dto.EducationDataDTO;
import com.leoram.curriculum.service.EducationDataService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/educationData")
public class EducationDataRest {
	
	@Autowired
	private EducationDataService educationDataService;
	
	@GetMapping(value = "/all")
	public List<EducationDataDTO> getAll(){
		return educationDataService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<EducationDataDTO> get(@PathVariable String id){
		
		return new ResponseEntity<EducationDataDTO>(educationDataService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<EducationDataDTO> save(@RequestBody EducationDataDTO educationDataDto){
		EducationDataDTO obj = educationDataService.save(educationDataDto);
		return new ResponseEntity<EducationDataDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<EducationDataDTO> delete(@PathVariable String id){
		EducationDataDTO educationDataDto = educationDataService.findByid(id);
		if(educationDataDto != null) {
			educationDataService.delete(educationDataDto);
		}else {
			return new ResponseEntity<EducationDataDTO>(educationDataDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<EducationDataDTO>(educationDataDto, HttpStatus.OK);
		
	}
}
