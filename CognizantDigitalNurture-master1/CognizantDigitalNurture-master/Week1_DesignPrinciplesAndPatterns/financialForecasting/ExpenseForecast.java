<<<<<<< HEAD
package financialforecasting;

import java.util.*;

public class ExpenseForecast {

    public static void main(String[] args) {
        // Last 3 months' expenses by category (in ₹)
        Map<String, double[]> pastExpenses = new HashMap<>();
        pastExpenses.put("Food", new double[]{3000, 3200, 3500});
        pastExpenses.put("Transport", new double[]{1200, 1400, 1500});
        pastExpenses.put("Entertainment", new double[]{800, 1000, 950});
        pastExpenses.put("Utilities", new double[]{2000, 2100, 2200});

        // Weights: Month-3, Month-2, Month-1
        double[] weights = {0.2, 0.3, 0.5};

        System.out.println("📊 Forecasted Expenses for Next Month (₹):\n");

        for (String category : pastExpenses.keySet()) {
            double[] values = pastExpenses.get(category);
            double forecast = 0.0;

            for (int i = 0; i < weights.length; i++) {
                forecast += values[i] * weights[i];
            }

            System.out.printf(" - %-15s : ₹%.2f\n", category, forecast);
        }
    }
}
=======
package financialforecasting;

import java.util.*;

public class ExpenseForecast {

    public static void main(String[] args) {
        // Last 3 months' expenses by category (in ₹)
        Map<String, double[]> pastExpenses = new HashMap<>();
        pastExpenses.put("Food", new double[]{3000, 3200, 3500});
        pastExpenses.put("Transport", new double[]{1200, 1400, 1500});
        pastExpenses.put("Entertainment", new double[]{800, 1000, 950});
        pastExpenses.put("Utilities", new double[]{2000, 2100, 2200});

        // Weights: Month-3, Month-2, Month-1
        double[] weights = {0.2, 0.3, 0.5};

        System.out.println("📊 Forecasted Expenses for Next Month (₹):\n");

        for (String category : pastExpenses.keySet()) {
            double[] values = pastExpenses.get(category);
            double forecast = 0.0;

            for (int i = 0; i < weights.length; i++) {
                forecast += values[i] * weights[i];
            }

            System.out.printf(" - %-15s : ₹%.2f\n", category, forecast);
        }
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
