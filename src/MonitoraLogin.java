import java.util.Scanner;

public class MonitoraLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso concedido");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta! Você tem " +  (tentativas - 1) + " tentativas");
            } else  {
                System.out.println("Conta bloqueada temporariamente!");
            }
        }

    }
}
