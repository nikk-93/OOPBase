import Model.CalculatorModel;
import Presenter.CalculatorPresenter;
import Presenter.ICalculatorPresenter;
import View.CalculatorView;

public class Main {

    public static void main(String[] args) {
        try {
            ICalculatorPresenter presenter = new CalculatorPresenter(new CalculatorModel(), new CalculatorView());
            presenter.buttonClickCompute();
            presenter.buttonClickCompute();
            presenter.buttonClickCompute();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
