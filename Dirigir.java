
import javax.swing.JOptionPane;

public class Dirigir {
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade."));
        if (idade >= 18 ) {
            JOptionPane.showMessageDialog(null,"maior idade");
        } else{
            JOptionPane.showMessageDialog(null,"menor idade");
        }
    }
}