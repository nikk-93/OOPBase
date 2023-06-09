public interface i_QueueBehaviour {
    void takeInQueue(a_Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
