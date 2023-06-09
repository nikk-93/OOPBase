import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements i_QueueBehaviour, i_MarketBehaviour {

    private List<a_Actor> listActor = new ArrayList<>();
    private Queue<a_Actor> queueActor = new ArrayDeque<>();

    @Override
    public void giveOrders() {
        System.out.println(queueActor.peek().getName() + " сделал заказ.");
        queueActor.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(String.format("Покупатель %s покинул очередь", queueActor.peek().getName()));
        queueActor.poll();
    }

    @Override
    public void takeInQueue(a_Actor actor) {
        System.out.println(String.format("Покупатель %s встал в очередь", actor.getName()));
        queueActor.add(actor);
    }

    @Override
    public void takeOrders() {
        System.out.println(queueActor.peek().getName() + " забрал заказ.");
        queueActor.peek().isTakeOrder();
    }

    @Override
    public void acceptToMarket(a_Actor actor) {
        System.out.println(String.format("Покупатель %s зашел в магазин", actor.getName()));
        listActor.add(actor);
    }

    @Override
    public void releaseFromMarket(a_Actor actor) {
        System.out.println(String.format("Покупатель %s вышел из магазин", actor.getName()));
        listActor.add(actor);
    }

    @Override
    public void update() {
        giveOrders();
        takeOrders();
        releaseFromQueue();
    }

}
