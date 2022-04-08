public class Pro1_64010972 {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Coperation");
        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;
        System.out.println("Symbol: " + oracle.symbol);
        System.out.println("Name: " + oracle.name);
        System.out.println("Previous Closing Price: " + oracle.previousClosingPrice);
        System.out.println("Current Price: " + oracle.currentPrice);
        System.out.println("Price Change: " + oracle.getChangePercent() + "%");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}