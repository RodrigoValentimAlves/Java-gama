import java.util.Scanner;

public class BC1017 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int tempoH;
        int velocM;

        int distancia;
        double consumo;

        tempoH = teclado.nextInt();
        velocM = teclado.nextInt();

        distancia = tempoH * velocM;

        consumo = distancia / 12.0;

        System.out.printf("%.3f\n", consumo);
        teclado.close();
    }

}
