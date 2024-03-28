/*
 * Você foi contratado por um cinema para realizar um programa que calcula o valor do ingresso, a partir da idade:
 * se menor de 2 anos, grátis
 * até 18 anos, paga meia
 * com 65 anos ou maior, paga meia
 * O programa deve perguntar além da idade, o preço do ingresso integral para realizar seus cálculos
 */

 import java.util.Scanner;

 public class Cinema2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Qual sua idade?");
         int idade = sc.nextInt(); // Corrigido o nome do Scanner para 'sc'
 
         if (idade < 2) {
             System.out.println("Ingresso grátis.");
         } else if (idade < 18 || idade > 65) {
             System.out.println("Meia entrada.");
         } else {
             System.out.println("Ingresso Inteiro.");
         }
         
         sc.close();
     }
 }
 //import java.util.Scanner;

//public class Cinema2 {
//    public static void main(String[] args) {
 //       Scanner sc = new Scanner(System.in);
//        System.out.println("Qual sua idade?");
//        int idade = leitor.nextInt();
//
//        if (idade < 2){
//            System.out.println("Ingresso gratis.");
//        else if (idade < 18 || idade > 65){
//           System.out.println("Meia entrada");
//       else{
//           System.out.println("Ingresso Inteiro");
//      }
//      }
//      }
//       sc.close();//
//  }
//}
