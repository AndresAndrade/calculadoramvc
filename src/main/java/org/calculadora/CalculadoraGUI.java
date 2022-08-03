package org.calculadora;

import javax.swing.*;

public class CalculadoraGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel pantalla;
    private JPanel teclas;
    private JButton btnC;
    private JButton btnBorrar;
    private JButton btnModulo;
    private JButton btnMultiplicacion;
    private JButton btnDivision;
    private JButton btnResta;
    private JButton btnSuma;
    private JButton btnIgual;
    private JButton btnPunto;
    private JButton btnCero;
    private JButton btnUno;
    private JButton btnDos;
    private JButton btnTres;
    private JButton btnCuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnSiete;
    private JButton btnOcho;
    private JButton btnNueve;
    private JLabel txtResultado;
    private JLabel txtOperaciones;
    private JButton btnCerrar;
    private JButton btnMinimizar;
    private JButton btnDarkMode;

    public CalculadoraGUI() {
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setTitle("Calculadora");
        setBounds(550,100, 300, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        CalculadoraGUI myCalculadora = new CalculadoraGUI();
    }
}

