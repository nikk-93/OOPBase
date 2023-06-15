package Presenter;

import Model.ICalculatorModel;
import View.ICalculatorView;

public class CalculatorPresenter implements ICalculatorPresenter {

    private ICalculatorModel model;
    private ICalculatorView view;

    public CalculatorPresenter(ICalculatorModel model, ICalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void buttonClickCompute() {
        var result = model.compute(view.getExpression());
        view.print(String.format("Результат: %.2f\n", result));
    }

}
