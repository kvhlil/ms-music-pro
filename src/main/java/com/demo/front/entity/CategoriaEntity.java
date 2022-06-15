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
@Table(name="CATEGORIA")

public class CategoriaEntity implements Serializable {
	
	private static final long serialVersionUID = 6698829018460421948L;
	
	@Id
	@Column(name="ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

}
