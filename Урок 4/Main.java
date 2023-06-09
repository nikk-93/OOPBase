public class Main {
    public static void main(String[] args) {
        Integer i = 1;
        printElement(i);
        String str = "1";
        printElement(str);
        Double d = 1d;
        printElement(d);

        Integer[] iArr = new Integer[] { 1, 2, 3, 4, 5 };
        printArray(iArr);
        String[] strArr = new String[] { "1", "2", "3", "4", "5" };
        printArray(strArr);
        Double[] dArr = new Double[] { 1d, 2d, 3d, 4d, 5d };
        printArray(dArr);

    }

    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            printElement(t);
        }
    }
}
