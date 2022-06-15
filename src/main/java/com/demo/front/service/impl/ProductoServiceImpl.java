package com.demo.front.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.front.entity.CategoriaEntity;
import com.demo.front.entity.ProductoEntity;
import com.demo.front.entity.SubCategoriaEntity;
import com.demo.front.entity.SucursalEntity;
import com.demo.front.repository.IProductoRepository;
import com.demo.front.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public List<ProductoEntity> getProduct() {
		return productoRepository.findAll();
	}

	@Override
	public List<ProductoEntity> getProductBySucursal(Integer idSucursal) {
		return productoRepository.findBySucursal(SucursalEntity.builder().idSucursal(idSucursal).build());
	}

	@Override
	public List<ProductoEntity> getProductByCategoria(Integer idCategoria) {
		return productoRepository.findByCategoria(CategoriaEntity.builder().idCategoria(idCategoria).build());
	}

	@Override
	public List<ProductoEntity> getProductBySubCategoria(Integer idSubCategoria) {
		return productoRepository.findBySubcategoria(SubCategoriaEntity.builder().idSubcategoria(idSubCategoria).build());
	}

	@Override
	public ProductoEntity getProductById(Integer codigo) {
		Optional<ProductoEntity> product = productoRepository.findById(codigo);
		return product.isPresent() ? product.get() : null;
	}

}
