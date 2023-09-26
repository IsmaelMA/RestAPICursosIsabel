package com.maldonadoismael.cursos.model;

public class Curso {

    private int codigoCurso;
    private String nombreCurso;
    private int horasDuracion;
    private int precioCurso;

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public int getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(int precioCurso) {
        this.precioCurso = precioCurso;
    }

    public Curso(int codigoCurso, String nombreCurso, int horasDuracion, int precioCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.horasDuracion = horasDuracion;
        this.precioCurso = precioCurso;
    }

    public Curso() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoCurso;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codigoCurso != other.codigoCurso)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "\"codigoCurso\": " + codigoCurso + ", " +
                "\"nombreCurso\": \"" + nombreCurso + "\", " +
                "\"horasDuracion\": " + horasDuracion + ", " +
                "\"precioCurso\": " + precioCurso +
                "}";
    }

}
