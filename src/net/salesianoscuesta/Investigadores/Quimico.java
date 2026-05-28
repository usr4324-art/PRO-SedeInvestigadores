package net.salesianoscuesta.Investigadores;

import java.util.ArrayList;

import net.salesianoscuesta.Investigador.Investigador;
import net.salesianoscuesta.Interfaz.TrabajoDual;

public class Quimico extends Investigador implements TrabajoDual {

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

    // En trabajo dual hace lo del biologo: ordenar por longitud y eliminar el mayor
    @Override
    public String trabajoDual() {
        if (elementos.isEmpty()) {
            return "No hay elementos.";
        }
        for (int i = 0; i < elementos.size() - 1; i++) {
            for (int j = 0; j < elementos.size() - 1 - i; j++) {
                if (elementos.get(j).length() > elementos.get(j + 1).length()) {
                    String aux = elementos.get(j);
                    elementos.set(j, elementos.get(j + 1));
                    elementos.set(j + 1, aux);
                }
            }
        }
        elementos.remove(elementos.size() - 1);
        return elementos.toString();
    }

}
