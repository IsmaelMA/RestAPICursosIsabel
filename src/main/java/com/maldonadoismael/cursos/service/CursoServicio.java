package com.maldonadoismael.cursos.service;

import java.util.List;

import com.maldonadoismael.cursos.model.Curso;

public interface CursoServicio {

    public List<Curso> listarCursos();

    public List<Curso> darDeAltaCurso(Curso nuevoCurso);

    public List<Curso> eliminarCurso(int codigo);

    public Curso buscarCurso(int codigo);

    public void actualizarDuracionCurso(int codigo, int horas);
}
