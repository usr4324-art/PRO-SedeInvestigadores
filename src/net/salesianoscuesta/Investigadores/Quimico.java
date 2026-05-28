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

    // Añade un elemento a la formula
    public void anadirElemento(String elemento) {
        elementos.add(elemento);
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1200) {
            return "Aviso: el sueldo es bajo, solicita un aumento.";
        }
        return "El sueldo es correcto.";
    }

    // Voltea las posiciones: el primero con el ultimo, el segundo con el penultimo...
    @Override
    public String trabajar() {
        if (elementos.isEmpty()) {
            return "No hay elementos.";
        }
        for (int i = 0; i < elementos.size() / 2; i++) {
            String aux = elementos.get(i);
            elementos.set(i, elementos.get(elementos.size() - 1 - i));
            elementos.set(elementos.size() - 1 - i, aux);
        }
        return elementos.toString();
    }

}
