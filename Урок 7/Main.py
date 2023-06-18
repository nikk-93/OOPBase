from ComplexCalculator import ComplexCalculator
from ComplexNumber import ComplexNumber
from Operation import Addition, Division, Multiplication


def main():
    calculator = ComplexCalculator()

    a = ComplexNumber(3, 2)
    b = ComplexNumber(1, 7)

    calculator.set_operation(Addition())
    result = calculator.execute_operation(a, b)
    print(f"Addition: {result}")

    calculator.set_operation(Multiplication())
    result = calculator.execute_operation(a, b)
    print(f"Multiplication: {result}")

    calculator.set_operation(Division())
    result = calculator.execute_operation(a, b)
    print(f"Division: {result}")


if __name__ == "__main__":
    main()
