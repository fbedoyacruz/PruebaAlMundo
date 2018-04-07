package com.co.almundo.prueba.callcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.co.almundo.prueba.callcenter.enums.EmployeeType;
import com.co.almundo.prueba.callcenter.enums.EmployeeState;

/**
 * Entidad encargada de representar un empleado del callcenter de almundo
 * @author Ferney Bedoya
 *
 */
@Entity
@Table(name = "empleado", schema="callCenter_alMundo")
public class Employee {
	
	@Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private EmployeeState estado;
	
	@Enumerated(EnumType.STRING)
	private EmployeeType cargo;
	
	public Employee(){
		
	}
	
	public Employee(EmployeeState estado, EmployeeType cargo) {
		this.estado = estado;
		this.cargo = cargo;
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
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeState getEstado() {
		return estado;
	}
	
	public void setEstado(EmployeeState estado) {
		this.estado = estado;
	}
	
	public EmployeeType getCargo() {
		return cargo;
	}
	
	public void setCargo(EmployeeType cargo) {
		this.cargo = cargo;
	}	
}
