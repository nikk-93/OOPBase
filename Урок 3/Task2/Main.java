import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            list.add(i, i);
        }

        IteratorClass<Integer> ic = new IteratorClass<Integer>(list);

        while (ic.hasNext()) {
            System.out.println(ic.next());
        }
    }
}
