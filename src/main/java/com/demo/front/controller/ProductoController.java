package com.demo.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/findBySucursal/{idSucursal}")
	public ResponseEntity<ResponseDTO> findBySucursal(@PathVariable("idSucursal") Integer idSucursal){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName("Service music pro")
				.status(true)
				.data(productoService.getProductBySucursal(idSucursal))
				.build()
				, HttpStatus.OK);
	}
	
	@GetMapping("/findByCategoria/{idCategoria}")
	public ResponseEntity<ResponseDTO> findByCategoria(@PathVariable("idCategoria") Integer idCategoria){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName("Service music pro")
				.status(true)
				.data(productoService.getProductByCategoria(idCategoria))
				.build()
				, HttpStatus.OK);
	}
	
	@GetMapping("/findBySubcategoria/{idSubcategoria}")
	public ResponseEntity<ResponseDTO> findBySubcategoria(@PathVariable("idSubcategoria") Integer idSubcategoria){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName("Service music pro")
				.status(true)
				.data(productoService.getProductBySubCategoria(idSubcategoria))
				.build()
				, HttpStatus.OK);
	}
	
	@GetMapping("/findByCodigo/{codigo}")
	public ResponseEntity<ResponseDTO> findByCodigo(@PathVariable("codigo") Integer codigo){
		return new ResponseEntity<ResponseDTO>(
				ResponseDTO
				.builder()
				.serviceName("Service music pro")
				.status(true)
				.data(productoService.getProductById(codigo))
				.build()
				, HttpStatus.OK);
	}

}
