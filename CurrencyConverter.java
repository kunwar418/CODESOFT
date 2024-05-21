import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        double usd = scanner.nextDouble();
        double exchangeRate = 0.85;
        double eur = usd * exchangeRate;
        System.out.println("euro in " + usd+  " dollars is " + eur);
    }
}
