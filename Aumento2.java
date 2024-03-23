/*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário. */

import javax.swing.JOptionPane;

public class Aumento2 {
    public static void main(String[] args) {
        double salInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário atual do funcionário?"));
        double porcentagemAumento = 1.5; // Corrigido o nome da variável para "porcentagemAumento"
        int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada do funcionário?"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Ano atual."));

        // Corrigido o uso inadequado do loop "for", trocado para "while"
        while (anoInicial <= anoAtual) {
            double aumento = salInicial * (porcentagemAumento / 100);
            salInicial += aumento; // Corrigido para adicionar o aumento ao salário inicial
            JOptionPane.showMessageDialog(null, "Ano Inicial: " + anoInicial + " Aumento: " + aumento); // Corrigido para mostrar o aumento corretamente
            porcentagemAumento *= 2;
            anoInicial++; // Incremento do ano
        }
    }
}
//public class Aumento2 {
  //  public static void main(String[] args) {
    // double salInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual o salario atual do funcionario?"));
    // double porcetagemAumento = 1.5;
    // int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada do funcionario?"));
    // int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Ano atual."));
      
      //  for( anoInicial >= anoAtual; anoInicial++ ){
      //      double aumento;
      //      aumento = salInicial*(porcetagemAumento/100);
      //      salInicial = aumento;
      //      JOptionPane.showMessageDialog(null ,"Ano Inicial: " + anoInicial+ "Aumento: " + salInicial);
      //      porcetagemAumento *= 2;
      //  }
  //  }
// }