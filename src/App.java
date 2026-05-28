import java.util.InputMismatchException;
import java.util.Scanner;

import net.salesianoscuesta.Investigadores.Matematico;
import net.salesianoscuesta.Investigadores.Biologo;
import net.salesianoscuesta.Investigadores.Quimico;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Datos de ejemplo
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matematico matematico = new Matematico("Ada", "Algebra", 1700, matriz);

        Biologo biologo = new Biologo("Charles", "Zoologia", 1400);
        biologo.anadirEspecimen("rana");
        biologo.anadirEspecimen("escarabajo");
        biologo.anadirEspecimen("oso");

        Quimico quimico = new Quimico("Marie", "Radioactividad", 1100);
        quimico.anadirElemento("Hidrogeno");
        quimico.anadirElemento("Oxigeno");
        quimico.anadirElemento("Carbono");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- SEDE DE INVESTIGADORES ---");
            System.out.println("1. Matematico");
            System.out.println("2. Biologo");
            System.out.println("3. Quimico");
            System.out.println("0. Salir");
            System.out.print("Elige un investigador: ");

            try {
                opcion = sc.nextInt();
                if (opcion == 1) {
                    menuMatematico(sc, matematico);
                } else if (opcion == 2) {
                    menuBiologo(sc, biologo);
                } else if (opcion == 3) {
                    menuQuimico(sc, quimico);
                } else if (opcion != 0) {
                    System.out.println("Opcion no valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes escribir un numero.");
            } finally {
                sc.nextLine();
            }
        }

        System.out.println("Hasta luego.");
        sc.close();
    }

    public static void menuMatematico(Scanner sc, Matematico matematico) {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MENU MATEMATICO ---");
            System.out.println("1. Identificacion");
            System.out.println("2. Calculo basico");
            System.out.println("3. Estado del sueldo");
            System.out.println("4. Trabajar: multiplicar matriz por un numero");
            System.out.println("5. Trabajar: sumar otra matriz 3x3");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println(matematico.identificacion());
            } else if (opcion == 2) {
                System.out.print("Primer numero: ");
                int a = sc.nextInt();
                System.out.print("Segundo numero: ");
                int b = sc.nextInt();
                System.out.println(matematico.calculoBasico(a, b));
            } else if (opcion == 3) {
                System.out.println(matematico.estadoSueldo());
            } else if (opcion == 4) {
                System.out.print("Numero para multiplicar: ");
                int numero = sc.nextInt();
                System.out.println(matematico.trabajar(numero));
            } else if (opcion == 5) {
                System.out.println("Escribe los 9 numeros de la matriz:");
                int[][] otra = new int[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        otra[i][j] = sc.nextInt();
                    }
                }
                System.out.println(matematico.trabajar(otra));
            }
        }
    }

    public static void menuBiologo(Scanner sc, Biologo biologo) {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MENU BIOLOGO ---");
            System.out.println("1. Identificacion");
            System.out.println("2. Calculo basico");
            System.out.println("3. Estado del sueldo");
            System.out.println("4. Añadir especimen");
            System.out.println("5. Trabajar (ordenar y eliminar el mayor)");
            System.out.println("6. Trabajo dual (voltear la lista)");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println(biologo.identificacion());
            } else if (opcion == 2) {
                System.out.print("Primer numero: ");
                int a = sc.nextInt();
                System.out.print("Segundo numero: ");
                int b = sc.nextInt();
                System.out.println(biologo.calculoBasico(a, b));
            } else if (opcion == 3) {
                System.out.println(biologo.estadoSueldo());
            } else if (opcion == 4) {
                System.out.print("Especimen: ");
                String especimen = sc.next();
                biologo.anadirEspecimen(especimen);
                System.out.println("Especimenes: " + biologo.getEspecimenes());
            } else if (opcion == 5) {
                System.out.println(biologo.trabajar());
            } else if (opcion == 6) {
                System.out.println(biologo.trabajoDual());
            }
        }
    }

    public static void menuQuimico(Scanner sc, Quimico quimico) {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MENU QUIMICO ---");
            System.out.println("1. Identificacion");
            System.out.println("2. Calculo basico");
            System.out.println("3. Estado del sueldo");
            System.out.println("4. Añadir elemento");
            System.out.println("5. Trabajar (voltear la lista)");
            System.out.println("6. Trabajo dual (ordenar y eliminar el mayor)");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println(quimico.identificacion());
            } else if (opcion == 2) {
                System.out.print("Primer numero: ");
                int a = sc.nextInt();
                System.out.print("Segundo numero: ");
                int b = sc.nextInt();
                System.out.println(quimico.calculoBasico(a, b));
            } else if (opcion == 3) {
                System.out.println(quimico.estadoSueldo());
            } else if (opcion == 4) {
                System.out.print("Elemento: ");
                String elemento = sc.next();
                quimico.anadirElemento(elemento);
                System.out.println("Elementos: " + quimico.getElementos());
            } else if (opcion == 5) {
                System.out.println(quimico.trabajar());
            } else if (opcion == 6) {
                System.out.println(quimico.trabajoDual());
            }
        }
    }
}
