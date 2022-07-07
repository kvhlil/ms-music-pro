package com.demo.front.service;

import java.util.List;

import com.demo.front.entity.SubCategoriaEntity;
//los metodos que crees acá los tienes que implemntar en el servicio Impl
public interface ISubCategoriaService {
	
	List<SubCategoriaEntity> getSubCategoria();
	//Estas implemtando un metodo nada que ver aca
	//List<SubCategoriaEntity> getSubCategoriaById(SubCategoriaEntity subcategoria);
	SubCategoriaEntity getSubCategoriaById(Integer idSubcategoria);
	
}
