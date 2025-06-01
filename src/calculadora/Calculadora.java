package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Matematica nMatemática = new Matematica();
        Scanner leitura = new Scanner(System.in);
        String op_matematica;
        System.out.println("Qual operação matemática você deseja realizar?(Multiplicação, Divisão, Soma ou Subtração)");
        op_matematica = leitura.nextLine();
        System.out.println(op_matematica);
        if (op_matematica.equalsIgnoreCase("Multiplicacao")) {
            System.out.println("Quantos números você quer multiplicar?");
            int qtdNumeros = leitura.nextInt();
            double resultado = 1;
            double num;

            for (int i = 1; i <= qtdNumeros; i++) {
                System.out.println("Digite o número " + i);
                num = leitura.nextDouble();
                resultado = nMatemática.Multiplicação(resultado, num);

            }
            System.out.println("O resultado dessa multiplicação é " + resultado);
        } else if (op_matematica.equalsIgnoreCase("Divisao")) {
            System.out.println("Quantos números você quer dividir?");
            int qtdNumeros = leitura.nextInt();
            System.out.println("Digite o número 1");
            double resultado = leitura.nextDouble();
            double num;

            for (int i = 2; i <= qtdNumeros; i++) {
                System.out.println("Digite o número " + i);
                num = leitura.nextDouble();
                resultado = nMatemática.Divisão(resultado, num);
            }
            System.out.println("O resultado dessa divisão é " + resultado);

        } else if (op_matematica.equalsIgnoreCase("Soma")) {
            System.out.println("Quantos números você quer somar?");
            int qtdNumeros = leitura.nextInt();
            System.out.println("Digite o número 1: ");
            double resultado = leitura.nextDouble();
            double num;

            for (int i = 2; i <= qtdNumeros; i++) {
                System.out.println("Digite o número " + i);
                num = leitura.nextDouble();
                resultado = nMatemática.Soma(resultado, num);
            }
            System.out.println("O resultado da soma é: " + resultado);
        } else if (op_matematica.equalsIgnoreCase("Subtracao")) {
            System.out.println("Quantos números você quer subtrair?");
            int qtdNumeros = leitura.nextInt();
            System.out.println("Digite o número 1: ");
            double resultado = leitura.nextDouble();
            for (int i = 2; i <= qtdNumeros; i++) {
                System.out.println("Digite o número " + i);
                double num = leitura.nextDouble();
                resultado = nMatemática.Subtração(resultado, num);
            }
            System.out.println("O resultado da subtração é: " + resultado);
        } else {
            System.out.println("Escolha uma operação válida!");
        }
        leitura.close();
    }
}
