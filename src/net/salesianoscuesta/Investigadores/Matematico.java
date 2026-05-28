package net.salesianoscuesta.Investigadores;

import net.salesianoscuesta.Investigador.Investigador;

public class Matematico extends Investigador {

    private int[][] matriz;

    public Matematico(String nombre, String especialidad, double sueldo, int[][] matriz) {
        super(nombre, especialidad, sueldo);
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

}
