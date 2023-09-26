package com.maldonadoismael.cursos.service;

import java.util.List;

import com.maldonadoismael.cursos.model.Curso;

public interface CursoServicio {

    public List<Curso> listarCursos();

    public List<Curso> altaCurso(Curso nuevoCurso);

    public List<Curso> eliminacionCurso(int codigo);

    public Curso buscarCurso(int codigo);

    public void actualizacionDuracionCurso(int codigo, int horas);
}
