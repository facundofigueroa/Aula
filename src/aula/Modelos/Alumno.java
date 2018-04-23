package aula.Modelos;

import java.util.Arrays;

public class Alumno extends Persona{
    
    private boolean[] asistencias;
    private int[] notas;
    private Asignatura asignatura;

    public Alumno(Asignatura asignatura) {
        this.asignatura = asignatura;
        this.asistencias = new boolean[this.asignatura.getCantidadDeClases()];
        this.notas = new int[this.asignatura.getCantidadDeExamenes()];
    }

    public Alumno(String nombres, String apellidos, int dni, int edad) {
        super(nombres, apellidos, dni, edad);
    }

    public Alumno(boolean[] asistencias, int[] notas, Asignatura asignatura) {
        this.asistencias = asistencias;
        this.notas = notas;
        this.asignatura = asignatura;
    }

    public Alumno(boolean[] asistencias, int[] notas, Asignatura asignatura, String nombres, String apellidos, int dni, int edad) {
        super(nombres, apellidos, dni, edad);
        this.asistencias = asistencias;
        this.notas = notas;
        this.asignatura = asignatura;
    }

    public boolean[] asistencias() {
        return asistencias;
    }

    public void setAsistencias(boolean[] asistencias) {
        this.asistencias = asistencias;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + '}';
    }
    
}