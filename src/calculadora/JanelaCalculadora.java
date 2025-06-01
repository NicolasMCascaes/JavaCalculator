package calculadora;

import javax.swing.*;
import java.awt.*;

public class JanelaCalculadora {
    public static void main(String[] args) {
        // cria a janela, a aba do programa:
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(300, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        ImageIcon icone = new ImageIcon("src/calculatorimage.png/");
        janela.setIconImage(icone.getImage());
        // cria um painel que é onde eu vou organizar os botões, textos e etc:
        JPanel painel = new JPanel();
        JLabel label = new JLabel();
        JTextField tela = new JTextField();
        janela.add(tela, BorderLayout.NORTH);
        tela.setEditable(false);
        painel.setLayout(new GridLayout(4, 3));

        janela.add(painel);

        // cria um botão

        janela.add(painel);
        Matematica nMatematica = new Matematica();
        for (int i = 0; i <= 9; i++) {
            String numero = String.valueOf(i);
            JButton botao = new JButton(numero);
            botao.addActionListener(e -> tela.setText(tela.getText() + numero));
            painel.add(botao);
        }
        JButton botao0 = new JButton("0");
        botao0.addActionListener(e -> tela.setText(tela.getText() + "0"));
        painel.add(botao0);

        JButton botaoSomaButton = new JButton("+");
        botaoSomaButton.addActionListener(e -> tela.setText(tela.getText() + "+"));
        painel.add(botaoSomaButton);

        JButton botaoSubtrair = new JButton("-");
        botaoSubtrair.addActionListener(e -> tela.setText(tela.getText() + "-"));
        painel.add(botaoSubtrair);

        JButton botaoMultiplica = new JButton("x");
        botaoMultiplica.addActionListener(e -> tela.setText(tela.getText() + "x"));
        painel.add(botaoMultiplica);

        JButton botaoDivide = new JButton("÷");
        botaoDivide.addActionListener(e -> tela.setText(tela.getText() + "÷"));
        painel.add(botaoDivide);

        JButton botaoIgualButton = new JButton("=");
        botaoIgualButton.addActionListener(e -> {
            String texto = tela.getText();
            if (texto.contains("+")) {
                String[] partes = texto.split("\\+");
                double resultado = 0;
                for (int i = 0; i < partes.length; i++) {
                    resultado += Double.parseDouble(partes[i]);
                }
                if (resultado == (int) resultado) {
                    tela.setText(String.valueOf((int) resultado));
                } else {
                    tela.setText(String.valueOf(resultado));
                }

            } else if (texto.contains("-")) {
                String[] partes = texto.split("\\-");
                double resultado = Double.parseDouble(partes[0]);
                for (int i = 1; i < partes.length; i++) {
                    resultado -= Double.parseDouble(partes[i]);
                }
                if (resultado == (int) resultado) {
                    tela.setText(String.valueOf((int) resultado));
                } else {
                    tela.setText(String.valueOf(resultado));
                }
            } else if (texto.contains("x")) {
                String[] partes = texto.split("x");
                double resultado = 1;
                for (int i = 0; i < partes.length; i++) {
                    resultado *= Double.parseDouble(partes[i]);
                }
                if (resultado == (int) resultado) {
                    tela.setText(String.valueOf((int) resultado));
                } else {
                    tela.setText(String.valueOf(resultado));
                }
            } else if (texto.contains("÷")) {
                String[] partes = texto.split("÷");
                double resultado = Double.parseDouble(partes[0]);
                for (int i = 1; i < partes.length; i++) {
                    resultado /= Double.parseDouble(partes[i]);
                }
                if (resultado == (int) resultado) {
                    tela.setText(String.valueOf((int) resultado));
                } else {
                    tela.setText(String.valueOf(resultado));
                }
            }

        });

        painel.add(botaoIgualButton);

    }
}
