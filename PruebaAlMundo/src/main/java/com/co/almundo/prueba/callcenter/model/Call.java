package com.co.almundo.prueba.callcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.co.almundo.prueba.callcenter.enums.StateCalled;

/**
 * Entidad encargada de representar un la tabla llamada del callcenter de almundo
 * @author Ferney Bedoya
 *
 */
@Entity
@Table(name = "llamada", schema="callCenter_alMundo")
public class Call {
	
	@Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="llamada_generator", sequenceName = "llamada_seq", allocationSize=1)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private StateCalled estado;
	
	
	public void llamada() {
		
	}
	
	public Call() {
		this.estado = StateCalled.EN_ESPERA;
	}

	/*
	 * Inicio sección geters y seters autogenerados
	 * 
	 */	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StateCalled getEstado() {
		return estado;
	}

	public void setEstado(StateCalled estado) {
		this.estado = estado;
	}	
}
