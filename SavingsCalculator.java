// SHAURYA CHAWLA //
// 09/24/19 //
// CSC-15 PROJECT 1 //

public class SavingsCalculator {
    public static final double RATE_DECREMENT = 0.25;
    public static final double INITIAL_SAVINGS_RATE = 0.4525;
    public static double initialDeposit = 3000;

    public static void displayTitle() {
        System.out.println("----------------SAVINGS CALCULATOR---------------");
        System.out.println("Initial Deposit: " + initialDeposit + " Initial Rate: 45.25%");
        System.out.println("-------------------------------------------------");    
    }

    public static void calculateSavings() {
        double amount;
        double value;

        for (int i = 0; i < 3; i++) {
            displayTitle();
            amount = initialDeposit + (1000 * i);

            for (int k = 0; k <= 4; k++) {
                int years = 5 * (1 + k);
                value = amount + (500 * k);

                for (int j = 1; j < years; j++) {
                    value = value + (value * INITIAL_SAVINGS_RATE / (1 + k * RATE_DECREMENT));
                }

                System.out.printf("%2d years: %10.2f", years, value);
                double stars = value / 10000.0;

                System.out.print(" ");
                for (; stars >= 1; stars--) {
                    System.out.print("*");
                }

                System.out.println();
            }

            initialDeposit = initialDeposit + 1000;
        }
    }

    public static void main(String[] args) {
        calculateSavings();
    }
}
