public class Main {
    public static void main(String[] args) {

        Human hm1 = new Human("Александр");
        Human hm2 = new Human("Иван");
        Human hm3 = new Human("Сергей");

        Market market = new Market();
        market.acceptToMarket(hm1);
        market.acceptToMarket(hm2);
        market.acceptToMarket(hm3);

        market.takeInQueue(hm1);
        market.takeInQueue(hm2);
        market.takeInQueue(hm3);

        market.update();
        market.update();
        market.update();

        market.releaseFromMarket(hm1);
        market.releaseFromMarket(hm2);
        market.releaseFromMarket(hm3);
    }
}
