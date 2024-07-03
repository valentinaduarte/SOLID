package ejercicio6;

public class TaxCalculator {
    public TaxCalculator() {
    }

    public double calculateTax(TaxStrategy strategy) {
        return strategy.calculateTax();
    }
}
