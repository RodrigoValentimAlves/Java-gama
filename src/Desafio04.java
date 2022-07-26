import java.util.Scanner;

public class Desafio04 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        float altura;

        System.out.print("Digite o seu nome:");
        nome = teclado.next();
        System.out.print("Digite a sua idade:");
        idade = teclado.nextInt();
        System.out.print("Digite a sua altura:");
        altura = teclado.nextFloat();

        teclado.close();
    }
}
/*
 * Desafio 4 :
 * Regra: implementar uma das estruturas de repetição na proposta
 * Fazer um programa em Java que armazene o nome,
 * a idade e a altura dos usuários e
 * no final mostre como saída quantas pessoas acima de 25 anos
 * e maiores de 1.75 participaram da pesquisa.
 */