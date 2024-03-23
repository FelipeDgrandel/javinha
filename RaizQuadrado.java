import java.util.Scanner;

public class RaizQuadrado {
   public static void main(String[] args) {
    // Objeto Scanner para ler entrada no teclado

      try (Scanner sc = new Scanner(System.in)) {
        //perguntando para usuario e obtendo entrada
        System.out.println(" Digite um numero e veja o resultado ao quadrado");
        int numero = sc.nextInt(); //le uma linha do texto
        int quadrado = numero * numero;

        //Imprimindo a resposta
        System.out.println(" O numero ao quadrado será de : " + quadrado);
      }

        //Fechando o Scanner
        sc.close();


   } 
}
