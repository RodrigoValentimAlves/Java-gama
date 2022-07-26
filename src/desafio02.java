import java.util.Scanner;

public class desafio02 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código do usuario: ");
        int userCode = teclado.nextInt();

        if (userCode == 1234) {
            System.out.print("Digite a senha do usuario: ");
            int userPassoword = teclado.nextInt();

            System.out.println((userPassoword == 9999) ? "Acesso permitido!" : "Senha incorreta!");
        } else {
            System.out.println("Usuário inválido!");
        }

        teclado.close();
    }
}
