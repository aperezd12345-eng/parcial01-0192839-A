import java.util.Scanner;

public class Parcial01{
    public static void main(String[] args) throws Exception {
        int[] consumo = new int[10];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < consumo.length; i++) {
            System.out.print("ingrese el valor de consumo numero " + (i + 1) + ":");
            consumo[i] = leer.nextInt();

            int consumototal = 0;
        consumototal += consumo[i];
        System.out.println("el consumo total es de " + consumototal);
        System.err.println("el promedio es: " + (consumototal / consumo.length));
            
            }
        

    }
}
