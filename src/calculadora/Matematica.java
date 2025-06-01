package calculadora;

public class Matematica implements Calculo {

    @Override
    public double Divisão(double num1, double num2) {
        return Calculo.super.Divisão(num1, num2);
    }

    @Override
    public double Multiplicação(double num1, double num2) {

        return Calculo.super.Multiplicação(num1, num2);
    }

    @Override
    public double Soma(double num1, double num2) {

        return Calculo.super.Soma(num1, num2);
    }

    @Override
    public double Subtração(double num1, double num2) {

        return Calculo.super.Subtração(num1, num2);
    }

}
