import java.util.Scanner;

public class Testelf {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, media;
        System.out.print("Digite a nota 1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a nota  2: ");
        n2 = teclado.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("Sua media final vale " + media);

        if (media >= 9) {
            System.out.println("Parabén você ficou com a nota A");
        } else if (media >= 8 && media < 9) {
            System.out.println("Parabens você ficou com a nota B");
        } else if (media >= 7 && media < 8) {
            System.out.println("Parabens você ficou com a nota C");
        } else if (media >= 6 && media < 7) {
            System.out.println("Você ficou com a nota D");
        } else {
            System.out.println("Você está de recuperação");
        }

        teclado.close();
    }
}
