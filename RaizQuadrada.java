import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber a Raiz Quadrada: ");
        double numero = sc.nextDouble();
        System.out.println(Math.sqrt(numero));
        sc.close();
    }
}
