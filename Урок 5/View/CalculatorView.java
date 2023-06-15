package View;

import java.util.Scanner;

public class CalculatorView implements ICalculatorView {

    Scanner scan = new Scanner(System.in);

    @Override
    public String getExpression() {
        System.out.print("Введите выражение: ");
        String expression = scan.nextLine();
        return expression;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }

}
