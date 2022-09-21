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

import com.leoram.curriculum.dto.InformalEducationDTO;
import com.leoram.curriculum.service.InformalEducationService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/informalEducation")
public class InformalEducationRest {
	
	@Autowired
	private InformalEducationService informalEducationService;
	
	@GetMapping(value = "/all")
	public List<InformalEducationDTO> getAll(){
		return informalEducationService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<InformalEducationDTO> get(@PathVariable String id){
		
		return new ResponseEntity<InformalEducationDTO>(informalEducationService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<InformalEducationDTO> save(@RequestBody InformalEducationDTO informalEducationDto){
		InformalEducationDTO obj = informalEducationService.save(informalEducationDto);
		return new ResponseEntity<InformalEducationDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<InformalEducationDTO> delete(@PathVariable String id){
		InformalEducationDTO informalEducationDto = informalEducationService.findByid(id);
		if(informalEducationDto != null) {
			informalEducationService.delete(informalEducationDto);
		}else {
			return new ResponseEntity<InformalEducationDTO>(informalEducationDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<InformalEducationDTO>(informalEducationDto, HttpStatus.OK);
		
	}
}
