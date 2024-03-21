import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a cotação do Dolar atual? ");
        double contacao = scanner.nextDouble();
        System.out.println("Digite a quantidade de Dolares: ");
        double dolares = scanner.nextDouble();
        double real = contacao * dolares;
        System.out.println("Aquantidade de Dolares é: " + dolares + " E em Reais seŕa: " + real);
        scanner.close();

    }
}
