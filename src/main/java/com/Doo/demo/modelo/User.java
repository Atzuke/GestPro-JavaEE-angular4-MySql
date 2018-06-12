package com.Doo.demo.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	private static final long serialVersionUID = 4064159245991343351L;
	
	
	@Column(name = "Nombre", nullable= false, length=45)
	private String nombre;
	
	@Column(name = "Apellido", nullable = true, length=45)
	private String apellido;
	
	@Column(name = "Correo", nullable = false, length=255)
	private String correo;
	
	@Column(name = "Telefono", nullable = true, length=45)
	private String telefono;
	
	@Column(name = "Contraseña", nullable = false, length=45)
	private String contraseña;
	
	@Column(name = "Empresa", nullable = true, length=45)
	private String empresa;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
    
}   
