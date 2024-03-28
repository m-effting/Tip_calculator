// usando metodos
package tipcalculator;
import java.text.DecimalFormat; // Importa a classe DecimalFormat para formatação de saída

public class TipCalculator {

    public static void main(String[] args) {
        
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
        
        
        // Declaração dos nomes e totais antes de impostos e gorjeta
        String[] names = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7", "Person 8"};
        double[] total_before = {10, 12, 9, 8, 7, 15, 11, 30};
        
        // Calcula os totais após impostos e gorjeta
        double[] total_after = calcularTotalAposTaxaGorjeta(total_before);

        // Imprime os resultados
        imprimirResultados(names, total_after);
    }

    // Método para calcular o total após impostos e gorjeta para cada pessoa
    public static double[] calcularTotalAposTaxaGorjeta(double[] total_before) {
        double tax_rate = 5; // Taxa de imposto
        double tip_rate = 15; // Taxa de gorjeta
        double[] total_after = new double[total_before.length]; // Array para armazenar os totais após os cálculos

        // Loop para calcular o total após impostos e gorjeta para cada pessoa
        for (int i = 0; i < total_before.length; i++) {
            double total_tax = total_before[i] * tax_rate / 100; // Calcula o valor do imposto
            double total_tip = total_before[i] * tip_rate / 100; // Calcula o valor da gorjeta
            total_after[i] = total_before[i] + total_tax + total_tip; // Calcula o total após impostos e gorjeta
        }

        return total_after; // Retorna o array com os totais após os cálculos
    }

    // Método para imprimir os resultados
    public static void imprimirResultados(String[] names, double[] total_after) {
        DecimalFormat df = new DecimalFormat("#.##"); // Cria um objeto DecimalFormat para formatar a saída com duas casas decimais

        // Loop para imprimir o nome de cada pessoa e seu total após impostos e gorjeta
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": $" + df.format(total_after[i])); // Imprime o nome e o total formatado
        }
    }
}
