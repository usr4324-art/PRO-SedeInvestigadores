package net.salesianoscuesta.Investigador;

public abstract class Investigador {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

}
