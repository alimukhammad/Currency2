public class CurrencyConverter{
    private static final double EXCHANGE_RATE = 1.20;//1 euro = 1.20 US Dollar

    public static double convertEuroToUSD(double euros){
        return euros * EXCHANGE_RATE;
    }

    
}