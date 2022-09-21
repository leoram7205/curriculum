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

import com.leoram.curriculum.dto.PersonalSkillsDTO;
import com.leoram.curriculum.service.PersonalSkillsService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/personalSkills")
public class PersonalSkillsRest {
	
	@Autowired
	PersonalSkillsService personalSkillsService;
	
	@GetMapping(value = "/all")
	public List<PersonalSkillsDTO> getAll(){
		return personalSkillsService.findAll();
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<PersonalSkillsDTO> get(@PathVariable String id){
		
		return new ResponseEntity<PersonalSkillsDTO>(personalSkillsService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<PersonalSkillsDTO> save(@RequestBody PersonalSkillsDTO personalSkillsDto){
		PersonalSkillsDTO obj = personalSkillsService.save(personalSkillsDto);
		return new ResponseEntity<PersonalSkillsDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<PersonalSkillsDTO> delete(@PathVariable String id){
		PersonalSkillsDTO personalSkillsDto = personalSkillsService.findByid(id);
		if(personalSkillsDto != null) {
			personalSkillsService.delete(personalSkillsDto);
		}else {
			return new ResponseEntity<PersonalSkillsDTO>(personalSkillsDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<PersonalSkillsDTO>(personalSkillsDto, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/loadImage/{id}")
	public ResponseEntity<PersonalSkillsDTO> loadImage(@RequestParam("file") MultipartFile archivo,
							@PathVariable String id){
		
		PersonalSkillsDTO obj = personalSkillsService.updatePhoto(archivo, id);
		
		return new ResponseEntity<PersonalSkillsDTO>(obj, HttpStatus.ACCEPTED);
	}
	
}
