import java.util.Scanner;

public class Exercicio03 {
    public static void main(String Args[]) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valor1kw, qtdkw, valorTotal, valorComDesconto;

        System.out.print("Digite o valor do Salario Minimo");
        salarioMinimo = teclado.nextDouble();
        System.out.print("Digite a quantidade de Kw gastos:");
        qtdkw = teclado.nextDouble();

        valor1kw = salarioMinimo / 7.0 / 100.0;

        valorTotal = qtdkw * valor1kw;

        valorComDesconto = valorTotal * 0.9;

        System.out.printf("O valor de 1 Kw R$ %.2\n", valor1kw);
        System.out.printf("O valor total da conta  R$ %.2\n", valorTotal);
        System.out.printf("O valor com desconto  R$ %.2\f", valorComDesconto);

        teclado.close();
    }
}
