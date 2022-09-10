/*
package com.stonecode.tiendabarberia.model;

import javax.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@ToString
public class Empresa {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
	private long id;
	private String nombreEmpresa;
	private String direccionEmpresa;
	private int telefonoEmpresa;
	private int nit;
   
	@OneoMany(mappedBy = "empresas")
	private List<Empleado> empleado;

	public Empresa(long id, String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int nit,
			List<Empleado> empleado) {
		super();
		this.id = id;
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.nit = nit;
		this.empleado = empleado;
	}
	
	public Empresa() {
		
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public int getTelefonoEmpresa() {
		return telefonoEmpresa;
	}

	public void setTelefonoEmpresa(int telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpresa(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
}
*/
