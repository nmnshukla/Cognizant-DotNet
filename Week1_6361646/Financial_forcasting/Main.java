public class Main {
    public static void main(String[] args) {
        double currentValue = 10000;     
        double growthRate = 0.08;        
        int years = 5;                   

        // Using recursive method
        double recursiveForecast = FinancialForecast.predictFutureValue(currentValue, growthRate, years);
        System.out.printf("Recursive: Predicted value after %d years: ₹%.2f%n", years, recursiveForecast);
    }
}