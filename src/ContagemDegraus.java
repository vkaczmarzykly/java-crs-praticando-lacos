import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int qtdeDegraus = scanner.nextInt();

        for (int i = 1; i <= qtdeDegraus; i++) {
            System.out.println("Subindo degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
        scanner.close();
    }
}
