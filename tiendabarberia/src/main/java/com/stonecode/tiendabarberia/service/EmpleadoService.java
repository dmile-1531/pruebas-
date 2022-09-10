package com.stonecode.tiendabarberia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stonecode.tiendabarberia.model.Empleado;
import com.stonecode.tiendabarberia.repository.EmpleadoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;

	public void crearYActualizarEmpleado(Empleado empleado){
		empleadoRepository.save(empleado);
	}

	public List<Empleado> verEmpleado(){
	    List<Empleado> empleado = new ArrayList<Empleado>();
	    empleado.addAll(empleadoRepository.findAll());
	    return empleado;
	}

	public void eliminarEmpleado(Long id){
		empleadoRepository.deleteById(id);
	}
}
