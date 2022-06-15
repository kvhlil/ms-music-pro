package com.demo.front.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="SUCURSAL")
public class SucursalEntity {

	@Id
	@Column(name="ID_SUCURSAL")
	private Integer idSucursal;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idComuna", referencedColumnName = "ID_COMUNA")
	private ComunaEntity comuna;
}
