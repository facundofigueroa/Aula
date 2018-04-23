package aula.Modelos;

import java.util.Arrays;

public class Curso {
    
    private Asignatura asignatura;
    private Alumno[] alumnos;
    private int cantidadDeAlumnos;

    public Curso() {
    }

    public Curso(Asignatura asignatura, int cantidadDeAlumnos) {
        this.asignatura = asignatura;
        this.alumnos = new Alumno[cantidadDeAlumnos];
        this.cantidadDeAlumnos = cantidadDeAlumnos;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getCantidadDeAlumnos() {
        return cantidadDeAlumnos;
    }

    public void setCantidadDeAlumnos(int cantidadDeAlumnos) {
        this.cantidadDeAlumnos = cantidadDeAlumnos;
    }

    @Override
    public String toString() {
        return "Curso { " + "asignatura = " + asignatura + ", alumnos=" + Arrays.toString(alumnos) + ", cantidadDeAlumnos=" + cantidadDeAlumnos + '}';
    }
    
}