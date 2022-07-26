import java.util.Scanner;

public class interropendoLoop {
    private static Scanner teclado;

    public static void main(String args[]) {

        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                continue;
            }
            System.out.println("contador =" + contador);
        }

        /*
         * int contador = 1;
         * while(contador <= 10){
         * if (contador == 5){
         * continue;
         * }
         * System.out.println("Contador ="+contador);
         * contador++;
         * }
         */
        System.out.println("Fim do programa");
        teclado.close();
    }

}
