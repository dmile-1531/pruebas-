/*
package com.stonecode.tiendabarberia.controller;
import com.stonecode.tiendabarberia.model.Empresa;
import com.stonecode.tiendabarberia.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmpresaController {

	@Autowired
    EmpresaService empresaService;

    @GetMapping("/empresa/get")
    private List<Empresa> verEmpresa(){
        return empresaService.verEmpresa();
    }

    @PostMapping("/empresa/post")
    private void crearEmpresa(@RequestBody Empresa empresa){
    	empresaService.crearYActualizarEmpresa(empresa);
    }

    @DeleteMapping("/empresa/{id}")
    private void eliminarEmpresa(@PathVariable("id") Long id){
    	empresaService.eliminarEmpresa(id);
    }

    @PutMapping("/empresa/put")
    private void editarEmpresa(@RequestBody Empresa empresa){
        empresaService.crearYActualizarEmpresa(empresa);
    }
}
*/
