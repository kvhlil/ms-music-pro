package com.demo.front.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.front.entity.SubCategoriaEntity;
import com.demo.front.repository.ISubCategoriaRepository;
import com.demo.front.service.ISubCategoriaService;
//La interfaz tienes que implementarla
@Service
public  class SubCategoriaServiceImpl implements ISubCategoriaService {

	@Autowired
	private ISubCategoriaRepository subCategoriaRepository;

	@Override
	public List<SubCategoriaEntity> getSubCategoria(){
		return subCategoriaRepository.findAll();
	}
	//Usa camelCase -> partes en minuscula y la otra palabra en mayuscula
	@Override
	public SubCategoriaEntity getSubCategoriaById(Integer idSubcategoria) {
		Optional<SubCategoriaEntity> subCategoria = subCategoriaRepository.findById(idSubcategoria);
		return subCategoria.isPresent() ? subCategoria.get() : null;
	}

	
}
