package com.stonecode.tiendabarberia.model;
import com.stonecode.tiendabarberia.enums.EnumRol;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
	private long id;
	
	private String nombreEmpleado;
	private String correoEmpleado;
	private String empresaEmpleado;
	private String rolEmpleado;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private EnumRol rol;
	
	@ManyToMany
    @JoinTable(name = "empresa_empleado")
    private List<Empresa> empresas;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getCorreoEmpleado() {
		return correoEmpleado;
	}
	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}
	public String getEmpresaEmpleado() {
		return empresaEmpleado;
	}
	public void setEmpresaEmpleado(String empresaEmpleado) {
		this.empresaEmpleado = empresaEmpleado;
	}
	public String getRolEmpleado() {
		return rolEmpleado;
	}
	public void setRolEmpleado(String rolEmpleado) {
		this.rolEmpleado = rolEmpleado;
	}
	public EnumRol getRol() {
		return rol;
	}
	public void setRol(EnumRol rol) {
		this.rol = rol;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	public Empleado() {
	
	}
	public Empleado(long id, String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado,
			EnumRol rol, List<Empresa> empresas) {
		super();
		this.id = id;
		this.nombreEmpleado = nombreEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.empresaEmpleado = empresaEmpleado;
		this.rolEmpleado = rolEmpleado;
		this.rol = rol;
		this.empresas = empresas;
	}
	
	
}

