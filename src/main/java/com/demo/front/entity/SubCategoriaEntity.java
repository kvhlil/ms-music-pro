package com.demo.front.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="SUBCATEGORIA")

public class SubCategoriaEntity implements Serializable{
	 
	private static final long serialVersionUID = 3675597828682911971L;
	
	@Id
	@Column(name="ID_SUBCATEGORIA")
	private Integer idSubcategoria;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	@Column(name="URL")
	private String url;
}
