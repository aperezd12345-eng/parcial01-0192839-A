public class parcial01-2 { 

    public static void main(String[] args) throws Exception {

        int matriz [][] = {
            {10, 20, 30, 3, 4},
            {3, 6, 7, 8, 9},
            {8, 5, 7, 9, 10},
            {6, 7, 3, 9, 8}
    };
        int longitudArreglo = matriz.length;
    for (int i=0 ; i < longitudArreglo; i++) {
        for (int j=0 ; j <longitudArreglo; j++) {
            System.out.println;("la cantidad producida por cada maquina en los 5 dias son: " + matriz[i][j]);
        }
    System.out.println();

    }
}
