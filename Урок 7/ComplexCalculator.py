import logging


class ComplexCalculator:
    def __init__(self):
        self.operation = None
        logging.basicConfig(
            filename="complex_calculator.log", level=logging.INFO)

    def set_operation(self, operation):
        self.operation = operation

    def execute_operation(self, a, b):
        if self.operation is None:
            raise ValueError("Operation is not set")

        result = self.operation.execute(a, b)
        logging.info(
            f"Operation: {type(self.operation).__name__}, A: {a}, B: {b}, Result: {result}")
        return result
