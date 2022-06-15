package com.demo.front.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.front.entity.ProductoEntity;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoEntity,Integer> {

}
