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

/**
 * Controlador para gestionar las operaciones relacionadas con los cursos.
 */
@RestController
public class CursoController {

    @Autowired
    private CursoServicioImp servicio;

    /**
     * Obtiene la lista de todos los cursos.
     *
     * @return Lista de cursos en formato JSON.
     */
    @GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos() {
        return servicio.listarCursos();
    }

    /**
     * Busca un curso por su código.
     *
     * @param codigo El código del curso a buscar.
     * @return El curso encontrado en formato JSON o null si no se encuentra.
     */
    @GetMapping(value = "buscar", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getBuscarCurso(@RequestParam("codigo") int codigo) {
        return servicio.buscarCurso(codigo);
    }

    /**
     * Crea un nuevo curso.
     *
     * @param nuevoCurso El curso a crear en formato JSON.
     * @return Lista de cursos actualizada en formato JSON.
     */
    @PostMapping(value = "alta", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> postAltaCurso(@RequestBody Curso nuevoCurso) {
        servicio.darDeAltaCurso(nuevoCurso);
        return servicio.listarCursos();
    }

    /**
     * Elimina un curso por su código.
     *
     * @param codigo El código del curso a eliminar.
     * @return Lista de cursos actualizada en formato JSON.
     */
    @DeleteMapping(value = "eliminar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> deleteEliminarCurso(@RequestParam("codigo") int codigo) {
        servicio.eliminarCurso(codigo);
        return servicio.listarCursos();
    }

    /**
     * Actualiza la duración de un curso por su código.
     *
     * @param codigo El código del curso a actualizar.
     * @param horas  Las nuevas horas de duración del curso.
     */
    @PutMapping(value = "actualizarduracion")
    public void putActualizarDuracionCurso(@RequestParam("codigo") int codigo, @RequestParam("horas") int horas) {
        servicio.actualizarDuracionCurso(codigo, horas);
    }
}
