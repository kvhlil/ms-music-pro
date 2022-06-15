package com.demo.front.entity;

import java.io.Serializable;

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
@Table(name="COMUNA")
public class ComunaEntity implements Serializable {
	
	private static final long serialVersionUID = -8341144666283739086L;

	@Id
	@Column(name="ID_COMUNA")
	private Integer idComuna;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idRegion", referencedColumnName = "ID_REGION")
	private RegionEntity region;

}
