package com.demo.front.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.front.entity.SubCategoriaEntity;



@Repository
public interface ISubCategoriaRepository extends JpaRepository<SubCategoriaEntity,Integer> {

}