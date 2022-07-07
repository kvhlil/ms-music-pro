package com.demo.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.front.config.ConfigValues;
import com.demo.front.dto.ResponseDTO;
import com.demo.front.service.ISubCategoriaService;

@RestController
@RequestMapping("/subCategoria")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class SubCategoriaController {
	
	@Autowired
	private ISubCategoriaService subCategoriaService;
	
	@Autowired
	private ConfigValues configValues;
	
	@GetMapping
	public ResponseEntity<ResponseDTO> getAllCategoria(){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName(configValues.getNameService())
				.status(true)
				.data(subCategoriaService.getSubCategoria())
				.build()
				, HttpStatus.OK);
	}
}
