import java.util.Scanner;

public class CurrencyConverter{
    private static final double EXCHANGE_RATE = 1.20;//1 euro = 1.20 US Dollar

    public static double convertEuroToUSD(double euros){
        return euros * EXCHANGE_RATE;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter amount of Euros to convert: ");
            double euros = scanner.nextDouble();

            double usd = convertEuroToUSD(euros);

            System.out.println(euros + " Euros = " + usd + " US dollars");
        }
    }
}