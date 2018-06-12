package com.Doo.demo.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="proyecto")
@Access(AccessType.FIELD)
public class Project extends ParentEntity {


	private static final long serialVersionUID = -995623998844282426L;
	
	@Column(name = "Nombre", nullable= false, length=45)
	private String nombre;
	
	@Column(name = "tipo", nullable= true, length=45)
	private String tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
