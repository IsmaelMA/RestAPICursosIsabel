package com.maldonadoismael.cursos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.maldonadoismael.cursos.model.Curso;

@Service
public class CursoServicioImp implements CursoServicio {

    List<Curso> cursos;

    public CursoServicioImp() {
        this.cursos = new ArrayList<>();
        cursos.add(new Curso(100, "Master Java", 140, 5000));
        cursos.add(new Curso(200, "Desarrollo Web Frontend Avanzado", 60, 200));
        cursos.add(new Curso(150, "Marketing Digital", 45, 150));
        cursos.add(new Curso(300, "Fotografía Profesional", 80, 300));
        cursos.add(new Curso(180, "Cocina Internacional", 50, 180));
        cursos.add(new Curso(250, "Inglés Avanzado", 40, 250));
        cursos.add(new Curso(120, "Yoga y Meditación", 30, 120));
        cursos.add(new Curso(220, "Programación en Python", 70, 220));
        cursos.add(new Curso(180, "Diseño Gráfico", 60, 180));
        cursos.add(new Curso(300, "Gestión de Proyectos", 45, 300));
        cursos.add(new Curso(160, "Marketing de Contenidos", 35, 160));
        cursos.add(new Curso(250, "Música Digital", 50, 250));
        cursos.add(new Curso(280, "Fotografía de Naturaleza", 60, 280));
        cursos.add(new Curso(100, "Finanzas Personales", 20, 100));
        cursos.add(new Curso(300, "Programación en Java", 80, 300));
        cursos.add(new Curso(150, "Escritura Creativa", 40, 150));
        cursos.add(new Curso(220, "Diseño de Moda", 55, 220));
        cursos.add(new Curso(200, "Fotografía de Retrato", 45, 200));
        cursos.add(new Curso(180, "Marketing en Redes Sociales", 30, 180));
        cursos.add(new Curso(120, "Cocina Saludable", 25, 120));
        cursos.add(new Curso(350, "Negocios Internacionales", 70, 350));

    }

    @Override
    public List<Curso> listarCursos() {
        return this.cursos;
    }

    @Override
    public List<Curso> altaCurso(Curso nuevoCurso) {
        this.cursos.add(nuevoCurso);
        return this.cursos;

    }

    @Override
    public List<Curso> eliminacionCurso(int codigo) {
        cursos.removeIf(curso -> curso.getCodigoCurso() == codigo);
        return cursos;
    }

    @Override
    public Curso buscarCurso(int codigo) {
        return cursos.stream().filter(curso -> curso.getCodigoCurso() == codigo).findFirst().orElse(null);
    }

    @Override
    public void actualizacionDuracionCurso(int codigo, int horas) {
        Curso cursoAACtualizar = cursos.stream().filter(curso -> curso.getCodigoCurso() == codigo).findFirst()
                .orElse(null);

        if (cursoAACtualizar != null) {
            cursoAACtualizar.setHorasDuracion(horas);

        }

    }

}
