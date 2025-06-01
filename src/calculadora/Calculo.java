package calculadora;

public interface Calculo {
    default double Soma(double num1, double num2) {
        return num1 + num2;
    }

    default double Subtração(double num1, double num2) {
        return num1 - num2;
    }

    default double Multiplicação(double num1, double num2) {
        return num1 * num2;
    }

    default double Divisão(double num1, double num2) {
        return num1 / num2;
    }

}
