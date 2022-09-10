/*
package com.stonecode.tiendabarberia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stonecode.tiendabarberia.model.Empresa;
import com.stonecode.tiendabarberia.repository.EmpresaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository empresaRepository;

	public void crearYActualizarEmpresa(Empresa empresa){
		empresaRepository.save(empresa);
	}

	public List<Empresa> verEmpresa(){
	    List<Empresa> empresa = new ArrayList<Empresa>();
	    empresa.addAll(empresaRepository.findAll());
	    return empresa;
	}

	public void eliminarEmpresa(Long id){
		empresaRepository.deleteById(id);
	}
}
*/