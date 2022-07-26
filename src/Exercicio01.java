import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int novoNumero;
        System.out.println("Digite um numero inteiro de 3 digitos");
        numeroOriginal = teclado.nextInt();

        c = numeroOriginal / 100;
        resto = numeroOriginal % 100;
        d = resto / 10;
        u = resto % 10;
        novoNumero = u * 100 + d * 10 + c;

        System.out.println("O novo número é :" + novoNumero);

        teclado.close();
    }
}