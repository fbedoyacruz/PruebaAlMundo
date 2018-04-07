package com.co.almundo.prueba.callcenter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidad encargada hacer la relación entre la tabla llamada y empleado para la
 * separación de muchos a muchos
 * 
 * @author Ferney Bedoya
 *
 */
@Entity
@Table(name = "llamada_empleado", schema = "callCenter_alMundo")
public class EmployeeCalled {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empleado_id")
	private Employee empleado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "llamada_id")
	private Call llamada;

	private Long duracion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	/**
	 * Constructor por defecto
	 */
	public EmployeeCalled() {
	}

	/**
	 * Constructor con parametros para la asignación de los atributos
	 * @param empleado
	 * @param llamada
	 * @param duracion
	 */
	public EmployeeCalled(Employee empleado, Call llamada, Long duracion) {
		this.empleado = empleado;
		this.llamada = llamada;
		this.duracion = duracion;
		this.fecha = new Date();
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

	public Employee getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Employee empleado) {
		this.empleado = empleado;
	}

	public Call getLlamada() {
		return llamada;
	}

	public void setLlamada(Call llamada) {
		this.llamada = llamada;
	}

	public Long getDuracion() {
		return duracion;
	}

	public void setDuracion(Long duracion) {
		this.duracion = duracion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
