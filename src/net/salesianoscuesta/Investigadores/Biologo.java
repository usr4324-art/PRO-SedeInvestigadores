package net.salesianoscuesta.Investigadores;

import java.util.ArrayList;

import net.salesianoscuesta.Investigador.Investigador;
import net.salesianoscuesta.Interfaz.TrabajoDual;

public class Biologo extends Investigador implements TrabajoDual {

    private ArrayList<String> especimenes;

    public Biologo(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.especimenes = new ArrayList<>();
    }

    public ArrayList<String> getEspecimenes() {
        return especimenes;
    }

    // Añade un especimen a la investigacion
    public void anadirEspecimen(String especimen) {
        especimenes.add(especimen);
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1500) {
            return "Aviso: el sueldo es bajo, solicita un aumento.";
        }
        return "El sueldo es correcto.";
    }

    // Ordena la lista por numero de caracteres y elimina el mayor
    @Override
    public String trabajar() {
        if (especimenes.isEmpty()) {
            return "No hay especimenes.";
        }
        for (int i = 0; i < especimenes.size() - 1; i++) {
            for (int j = 0; j < especimenes.size() - 1 - i; j++) {
                if (especimenes.get(j).length() > especimenes.get(j + 1).length()) {
                    String aux = especimenes.get(j);
                    especimenes.set(j, especimenes.get(j + 1));
                    especimenes.set(j + 1, aux);
                }
            }
        }
        especimenes.remove(especimenes.size() - 1);
        return especimenes.toString();
    }

    // En trabajo dual hace lo del quimico: voltear la lista
    @Override
    public String trabajoDual() {
        for (int i = 0; i < especimenes.size() / 2; i++) {
            String aux = especimenes.get(i);
            especimenes.set(i, especimenes.get(especimenes.size() - 1 - i));
            especimenes.set(especimenes.size() - 1 - i, aux);
        }
        return especimenes.toString();
    }

}
