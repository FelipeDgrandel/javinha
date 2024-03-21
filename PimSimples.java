import javax.swing.JOptionPane;

public class PimSimples {
   public static void main(String[] args) {
   int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero."));
    if (numero % 4 == 0 || numero %10 == 0){
        JOptionPane.showMessageDialog(null, " PIMM "5);
    } else{
        JOptionPane.showMessageDialog(null, " O numero é " + numero);
    }
    
   } 
}
