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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.leoram.curriculum.dto.PersonalDataDTO;
import com.leoram.curriculum.service.PersonalDataService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/personalData")
public class PersonalDataRest {
	
	@Autowired
	PersonalDataService personalDataService;
	
	@GetMapping(value = "/all")
	public List<PersonalDataDTO> getAll(){
		return personalDataService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<PersonalDataDTO> get(@PathVariable String id){
		
		return new ResponseEntity<PersonalDataDTO>(personalDataService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<PersonalDataDTO> save(@RequestBody PersonalDataDTO personalDataDto){
		PersonalDataDTO obj = personalDataService.save(personalDataDto);
		return new ResponseEntity<PersonalDataDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<PersonalDataDTO> delete(@PathVariable String id){
		PersonalDataDTO personalDataDto = personalDataService.findByid(id);
		if(personalDataDto != null) {
			personalDataService.delete(personalDataDto);
		}else {
			return new ResponseEntity<PersonalDataDTO>(personalDataDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<PersonalDataDTO>(personalDataDto, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/loadImage/{id}")
	public ResponseEntity<PersonalDataDTO> loadImage(@RequestParam("file") MultipartFile archivo,
							@PathVariable String id){
		PersonalDataDTO obj = personalDataService.updatePhoto(archivo, id);
		
		return new ResponseEntity<PersonalDataDTO>(obj, HttpStatus.ACCEPTED);
	}
		
}
