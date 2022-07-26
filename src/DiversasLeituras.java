import java.util.Scanner;

public class DiversasLeituras {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        int preco;
        String nome, texto;

        System.out.println("Digite o código: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);

        System.out.println("Digite o nome : ");
        nome = teclado.nextLine();

        System.out.println("Digite o preco : ");
        texto = teclado.nextLine();
        preco = (int) Double.parseDouble(texto);

        System.out.println("voce digitou " + codigo + " - " + nome + " R$ " + preco);
        System.out.printf("Voce Digitou %d - %s R$ %.2f\n,", codigo, nome, preco);

        teclado.close();

    }

}
