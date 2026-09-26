import java.util.Scanner;

public class Parcial01 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] consumo = new int[10];
        int total = 0;
        int longitud = consumo.length;

        // Ingresar y validar
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese el consumo Consumo del sector " + (i + 1) + ": ");
            consumo[i] = leer.nextInt();

            while (consumo[i] < 0) {
                System.out.print("No puede ser negativo. Ingrese de nuevo: ");
                consumo[i] = leer.nextInt();
            }

            total += consumo[i];
        }

        double promedio = (double) total / longitud;

        // Mayor consumo
        int mayor = consumo[0];
        int sectorMayor = 1;

        for (int i = 0; i < longitud; i++) {
            if (consumo[i] > mayor) {
                mayor = consumo[i];
                sectorMayor = i + 1;
            }
        }

        // Sectores sobre promedio y racha del consumidor 
        int cantidad = 0, racha = 0, mayorRacha = 0;

        for (int i = 0; i < longitud; i++) {
            if (consumo[i] > promedio) {
                cantidad++;
                racha++;
                if (racha > mayorRacha)
                    mayorRacha = racha;
            } else {
                racha = 0;
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Consumo total: " + total );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Promedio: " + promedio );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Mayor consumo: Sector " + sectorMayor + " con un consumo de: " +  mayor );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Sectores sobre el promedio: " + cantidad);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Racha más larga: " + mayorRacha);
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("SECTORES ");
        for (int i = 0; i < longitud; i++)
            System.out.println("Sector " + (i + 1) + ": " + consumo[i] );

        leer.close();
       
    }
}
