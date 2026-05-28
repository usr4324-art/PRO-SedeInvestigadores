package net.salesianoscuesta.Investigadores;

import java.util.ArrayList;

import net.salesianoscuesta.Investigador.Investigador;

public class Quimico extends Investigador {

    private ArrayList<String> elementos;

    public Quimico(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.elementos = new ArrayList<>();
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }

}
