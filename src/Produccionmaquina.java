import java.util.Scanner;

public class Produccionmaquina {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaración de variables requeridas al inicio
        int longitudfilas = 4;
        int longitudcolumnas = 5;
        int suma = 0;
        int sumadias = 0;
        int sumatotal = 0;

        // Matriz de 4 máquinas por 5 días
        int[][] matriz = new int[longitudfilas][longitudcolumnas];

        // Lectura de la matriz usando 'j' y 'k'
        for (int j = 0; j < longitudfilas; j++) {
            for (int k = 0; k < longitudcolumnas; k++) {

                do {
                    System.out.print("Ingrese producción de Máquina "
                            + (j + 1) + " en Día " + (k + 1) + ": ");

                    matriz[j][k] = leer.nextInt();

                    if (matriz[j][k] < 0) {
                        System.out.println("El valor no puede ser negativo.");
                    }

                } while (matriz[j][k] < 0);
            }
        }

        // Total producido por cada máquina
        int mayorMaquina = 0;
        int posicionMayor = 1;

        for (int j = 0; j < longitudfilas; j++) {

            suma = 0;

            for (int k = 0; k < longitudcolumnas; k++) {
                suma += matriz[j][k];
            }

            System.out.println("Máquina " + (j + 1)
                    + " = " + suma);

            if (suma > mayorMaquina) {
                mayorMaquina = suma;
                posicionMayor = j + 1;
            }
        }

        // Total producido por cada día
        int menorDia = 0;
        int posicionMenor = 1;

        for (int k = 0; k < longitudcolumnas; k++) {

            sumadias = 0;

            for (int j = 0; j < longitudfilas; j++) {
                sumadias += matriz[j][k];
            }

            System.out.println("Día " + (k + 1)
                    + " = " + sumadias);

            if (k == 0 || sumadias < menorDia) {
                menorDia = sumadias;
                posicionMenor = k + 1;
            }
        }

        // para 

        int menores20 = 0;

        for (int j = 0; j < longitudfilas; j++) {
            for (int k = 0; k < longitudcolumnas; k++) {

                if (matriz[j][k] < 20) {
                    menores20++;
                }
            }
        }

        // Mostrar matriz completa
        System.out.print("la matriz completa es: ");

        for (int j = 0; j < longitudfilas; j++) {
            for (int k = 0; k < longitudcolumnas; k++) {

                System.out.print(matriz[j][k] + " ");
            }
            System.out.println();
        }
         //Resultados que me estan pidiendo
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("La máquina con mayor produccion es la maquina N" + posicionMayor + " con una producción de " + mayorMaquina );
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("El día con menor producción es el dia: " + posicionMenor + " con una producción de " + menorDia );
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("La cantidad de registros por maquinas inferiores a 20 piezas fue de: " + menores20);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
            
        leer.close(); 
        } 
        }