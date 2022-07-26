import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double raio, altura, V;

        System.out.print("Digite o raio do cilindro:");
        raio = teclado.nextDouble();
        System.out.print("Digite a altura do cilindro:");
        altura = teclado.nextDouble();

        V = 3.14 * raio * raio * altura;

        System.out.printf("O volume do cilindro vale %.3f\n", V);

        teclado.close();
    }
}