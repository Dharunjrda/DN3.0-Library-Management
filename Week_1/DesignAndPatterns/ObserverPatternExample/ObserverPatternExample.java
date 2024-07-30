package ObserverPatternExample;

public class ObserverPatternExample {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket("AAPL", 150.00);

        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(155.00);

        stockMarket.setStockPrice(160.00);
    }
}
