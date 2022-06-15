package com.demo.front.service;

import java.util.List;

import com.demo.front.entity.ProductoEntity;

public interface IProductoService {

	List<ProductoEntity> getProduct();
	
	List<ProductoEntity> getProductBySucursal(Integer idSucursal);
	
	List<ProductoEntity> getProductByCategoria(Integer idCategoria);
	
	List<ProductoEntity> getProductBySubCategoria(Integer idSubCategoria);
	
	ProductoEntity getProductById(Integer codigo);
}
