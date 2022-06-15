package com.demo.front.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name="PRODUCTO")
public class ProductoEntity implements Serializable {

	private static final long serialVersionUID = -6917102438973819084L;

	@Id
	@Column(name="CODIGO")
	private Integer codigo;

	@Column(name="SERIE")
	private String serie;

	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="STOCK")
	private Integer stock;

	@Column(name="PRECIO")
	private Integer precio;

	@Column(name="MODELO")
	private String modelo;

	@Column(name="MARCA")
	private String marca;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSucursal", referencedColumnName = "ID_SUCURSAL")
	private SucursalEntity sucursal;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria", referencedColumnName = "ID_CATEGORIA")
	private CategoriaEntity categoria;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSubcategoria", referencedColumnName = "ID_SUBCATEGORIA")
	private SubCategoriaEntity subcategoria;

}
