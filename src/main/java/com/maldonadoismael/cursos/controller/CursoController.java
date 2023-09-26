package com.maldonadoismael.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.maldonadoismael.cursos.model.Curso;
import com.maldonadoismael.cursos.service.CursoServicioImp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class CursoController {

    @Autowired
    private CursoServicioImp servicio;

    @GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos() {
        return servicio.listarCursos();
    }

    @GetMapping(value = "buscar", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getBuscarCurso(@RequestParam("codigo") int codigo) {
        return servicio.buscarCurso(codigo);
    }

    @PostMapping(value = "alta", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> postAltaCurso(@RequestBody Curso nuevoCurso) {
        servicio.altaCurso(nuevoCurso);
        return servicio.listarCursos();
    }

    @DeleteMapping(value = "eliminar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> deleteEliminarCurso(@RequestParam("codigo") int codigo) {
        servicio.eliminacionCurso(codigo);

        return servicio.listarCursos();
    }

    @PutMapping(value = "actualizarduracion")
    public void putActualizarDuracionCurso(@RequestParam("codigo") int codigo, @RequestParam("horas") int horas) {
        servicio.actualizacionDuracionCurso(codigo, horas);

    }

}
