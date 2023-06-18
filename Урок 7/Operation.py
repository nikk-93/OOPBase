from ComplexNumber import ComplexNumber
from abc import ABC, abstractmethod


class Operation(ABC):
    @abstractmethod
    def execute(self, a, b):
        pass


class Addition(Operation):
    def execute(self, a, b):
        return ComplexNumber(a.real + b.real, a.imaginary + b.imaginary)


class Multiplication(Operation):
    def execute(self, a, b):
        real = a.real * b.real - a.imaginary * b.imaginary
        imaginary = a.real * b.imaginary + a.imaginary * b.real
        return ComplexNumber(real, imaginary)


class Division(Operation):
    def execute(self, a, b):
        denominator = b.real ** 2 + b.imaginary ** 2
        if denominator == 0:
            raise ZeroDivisionError("Division by zero")
        real = (a.real * b.real + a.imaginary * b.imaginary) / denominator
        imaginary = (a.imaginary * b.real - a.real * b.imaginary) / denominator
        return ComplexNumber(real, imaginary)
