package aula.Modelos;

public class Asignatura {
    
    private String nombre;
    private int codigo;
    private int cantidadDeClases;
    private int cantidadDeExamenes;

    public Asignatura() {
    }

    public Asignatura(String nombre, int codigo, int cantidadDeClases, int cantidadDeExamenes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDeClases = cantidadDeClases;
        this.cantidadDeExamenes = cantidadDeExamenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeClases() {
        return cantidadDeClases;
    }

    public void setCantidadDeClases(int cantidadDeClases) {
        this.cantidadDeClases = cantidadDeClases;
    }

    public int getCantidadDeExamenes() {
        return cantidadDeExamenes;
    }

    public void setCantidadDeExamenes(int cantidadDeExamenes) {
        this.cantidadDeExamenes = cantidadDeExamenes;
    }

    @Override
    public String toString() {
        return "Asignatura { " + "nombre = " + nombre + ", codigo = " + codigo + ", cantidadDeClases = " + cantidadDeClases + ", cantidadDeExamenes = " + cantidadDeExamenes + '}';
    }
    
}