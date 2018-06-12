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
	
	
	@Column(name = "Nombre", nullable = false, length=255)
	private String Nombre;
	
	@Column(name = "Apellido", nullable = false, length=255)
	private String Apellido;
	
	@Column(name = "Correo", nullable = false, length=255)
	private String Correo;
	
	@Column(name = "Telefono", nullable = false, length=255)
	private String Telefono;
	
	@Column(name = "Constraseña", nullable = false, length=255)
	private String Contraseña;
	
	@Column(name = "Empresa", nullable = false, length=255)
	private String Empresa;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	
	
	
    
}   
