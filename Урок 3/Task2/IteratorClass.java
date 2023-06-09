import java.util.Iterator;
import java.util.List;

public class IteratorClass<E> implements Iterator<E> {

    private List<E> list;
    private int current;

    public IteratorClass(List<E> list) {
        this.list = list;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }

    @Override
    public E next() {
        return list.get(current++);
    }

}
