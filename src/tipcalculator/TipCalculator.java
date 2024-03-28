//Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
package tipcalculator;
import java.text.DecimalFormat;

public class TipCalculator {
    // Campos
    public double tax = 5; // Alterado para 5% conforme o exemplo
    public double tip = 15; // Alterado para 15% conforme o exemplo
    public double[] total_before = {10, 12, 9, 8, 7, 15, 11, 30};

    // Método para calcular o total após impostos e gorjeta para cada pessoa
    public void find_total() {
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < total_before.length; i++) {
            double total_tax = total_before[i] * tax / 100;
            double total_tip = total_before[i] * tip / 100;
            double total_after = total_before[i] + total_tax + total_tip;
            System.out.println("Person " + (i + 1) + ": $" + df.format(total_after));
        }
    }

    public static void main(String[] args) {
        // Cria uma instância de TipCalculator
        TipCalculator calculator = new TipCalculator();
        
        // Chama o método para encontrar o total
        calculator.find_total();
    }
}