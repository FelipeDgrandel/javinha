import javax.swing.JOptionPane;

public class PimSimples {
   public static void main(String[] args) {
   int numero = Integer.parseInt(JOptionPane.showImputDialog("Digite um numero."));
    if (numero % 4 == 0 || numero %10 == 0){
        JOptionPane.showMessageDialog(" PIMM ");
    } else{ 
        JOptionPane.showMessageDialog(" O numero é " + numero);
    }
    
   } 
}
