package net.salesianoscuesta.Investigadores;

import java.util.ArrayList;

import net.salesianoscuesta.Investigador.Investigador;

public class Biologo extends Investigador {

    private ArrayList<String> especimenes;

    public Biologo(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.especimenes = new ArrayList<>();
    }

    public ArrayList<String> getEspecimenes() {
        return especimenes;
    }

}
