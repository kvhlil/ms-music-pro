package com.demo.front.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.front.entity.CategoriaEntity;
import com.demo.front.entity.ProductoEntity;
import com.demo.front.entity.SubCategoriaEntity;
import com.demo.front.entity.SucursalEntity;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoEntity,Integer> {

	List<ProductoEntity> findBySucursal(SucursalEntity sucursal);
	
	List<ProductoEntity> findByCategoria(CategoriaEntity categoria);
	
	List<ProductoEntity> findBySubcategoria(SubCategoriaEntity subcategoria);
}
