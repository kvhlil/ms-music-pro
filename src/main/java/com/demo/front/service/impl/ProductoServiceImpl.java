package com.demo.front.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.front.entity.ProductoEntity;
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

}
