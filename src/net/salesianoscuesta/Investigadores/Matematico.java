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

    // Sin parametros solo muestra la matriz actual
    @Override
    public String trabajar() {
        return mostrarMatriz();
    }

    // Multiplica todos los valores de la matriz por el numero
    public String trabajar(int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] * numero;
            }
        }
        return mostrarMatriz();
    }

    // Suma la matriz actual con otra matriz 3x3
    public String trabajar(int[][] otra) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] + otra[i][j];
            }
        }
        return mostrarMatriz();
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1800) {
            return "Aviso: el sueldo es bajo, solicita un aumento.";
        }
        return "El sueldo es correcto.";
    }

    private String mostrarMatriz() {
        String texto = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                texto += matriz[i][j] + " ";
            }
            texto += "\n";
        }
        return texto;
    }

}
