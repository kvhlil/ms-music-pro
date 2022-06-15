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
@Table(name="REGION")
public class RegionEntity implements Serializable {
	
	private static final long serialVersionUID = -932872073740626583L;

	@Id
	@Column(name="ID_REGION")
	private Integer idRegion;
	
	@Column(name="NOMBRE")
	private String nombre;
	
}
