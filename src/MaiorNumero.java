import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String[] listaNum = input.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for(String stringNum : listaNum) {
            int num = Integer.parseInt(stringNum);
            if(maior < num) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        input.close();
    }
}
