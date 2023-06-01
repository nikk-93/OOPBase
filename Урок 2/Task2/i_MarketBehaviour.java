import java.util.List;

public interface i_MarketBehaviour {
    void acceptToMarket(a_Actor actor);

    void releaseFromMarket(a_Actor actor);

    void update();
}
