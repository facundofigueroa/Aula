package aula;

import aula.Modelos.Alumno;
import aula.Modelos.Asignatura;
import aula.Modelos.Curso;

public class Facu {

    public static void main(String[] args) {
        
        Asignatura info = new Asignatura("Informática", 111, 15, 6);
        
        Alumno [] alumnos = new Alumno[2];
        
        alumnos[0] = new Alumno("Pepe", "Rodriguez", 40941159, 20);
        alumnos[1] = new Alumno("Juan", "Peralta", 20243544, 46);
       
        Curso curso1 = new Curso(info, 2);
        curso1.setAlumnos(alumnos);
        
        System.out.println(curso1);
    }
    
}