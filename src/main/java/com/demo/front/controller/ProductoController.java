package com.demo.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.front.dto.ResponseDTO;
import com.demo.front.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping
	public ResponseEntity<ResponseDTO> getAllCategoria(){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName("Service music pro")
				.status(true)
				.data(productoService.getProduct())
				.build()
				, HttpStatus.OK);
	}

}
