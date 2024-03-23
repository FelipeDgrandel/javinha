public class Aumento {
    public static void main(String[] args) {
        double salario = 1000;
        double porcetagemAumento = 1.5; 
        double aumento ;
        for (int ano = 2006; ano <= 2024; ano++){
            aumento = salario * (porcetagemAumento / 100);
            salario += aumento;
            System.out.println("Ano: "+ ano + " % aumento: "+ porcetagemAumento + " aumento: " + aumento + " salario: " + salario);
            porcetagemAumento *= 2;
        }
    }
}
