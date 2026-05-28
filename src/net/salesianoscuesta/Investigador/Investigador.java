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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Muestra los datos del cientifico
    public String identificacion() {
        return "Nombre: " + nombre
                + "\nEspecialidad: " + especialidad
                + "\nSueldo: " + sueldo + "€";
    }

    // Suma y resta de 2 valores recibidos por parametro
    public String calculoBasico(int a, int b) {
        int suma = a + b;
        int resta = a - b;
        return "Suma: " + suma + " | Resta: " + resta;
    }

}
