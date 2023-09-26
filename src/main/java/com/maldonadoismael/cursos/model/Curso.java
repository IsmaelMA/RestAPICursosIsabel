package com.maldonadoismael.cursos.model;

/**
 * La clase Curso representa un curso con atributos como código, nombre,
 * duración en horas y precio.
 */
public class Curso {

    private int codigoCurso;
    private String nombreCurso;
    private int horasDuracion;
    private int precioCurso;

    /**
     * Constructor para crear un nuevo curso con valores iniciales.
     *
     * @param codigoCurso   El código único del curso.
     * @param nombreCurso   El nombre del curso.
     * @param horasDuracion La duración en horas del curso.
     * @param precioCurso   El precio del curso.
     */
    public Curso(int codigoCurso, String nombreCurso, int horasDuracion, int precioCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.horasDuracion = horasDuracion;
        this.precioCurso = precioCurso;
    }

    /**
     * Constructor por defecto.
     */
    public Curso() {
    }

    /**
     * Obtiene el código único del curso.
     *
     * @return El código del curso.
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * Establece el código único del curso.
     *
     * @param codigoCurso El nuevo código del curso.
     */
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombreCurso El nuevo nombre del curso.
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * Obtiene la duración en horas del curso.
     *
     * @return La duración en horas del curso.
     */
    public int getHorasDuracion() {
        return horasDuracion;
    }

    /**
     * Establece la duración en horas del curso.
     *
     * @param horasDuracion La nueva duración en horas del curso.
     */
    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    /**
     * Obtiene el precio del curso.
     *
     * @return El precio del curso.
     */
    public int getPrecioCurso() {
        return precioCurso;
    }

    /**
     * Establece el precio del curso.
     *
     * @param precioCurso El nuevo precio del curso.
     */
    public void setPrecioCurso(int precioCurso) {
        this.precioCurso = precioCurso;
    }

    /**
     * Calcula el valor hash del curso basado en su código.
     *
     * @return El valor hash del curso.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoCurso;
        return result;
    }

    /**
     * Compara este curso con otro objeto para verificar si son iguales.
     *
     * @param obj El objeto con el que se compara este curso.
     * @return true si los cursos son iguales, false en caso contrario.
     */
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

    /**
     * Convierte el curso en una representación de cadena JSON.
     *
     * @return Una cadena JSON que representa el curso.
     */
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
