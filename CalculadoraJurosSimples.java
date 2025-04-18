package CalculadoraDeJurosSimples;

import java.util.Scanner;

public class CalculadoraJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Java de Juros Simples!");
        System.out.println("Fórmula: Juros = Principal x Taxa x Tempo");

        System.out.print("Digite o valor principal (capital): ");
        double principal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (em porcentagem. ex.: 5 para 5%): ");
        double taxaAnual = scanner.nextDouble();

        System.out.print("Digite o tempo (em anos): ");
        double tempo = scanner.nextDouble();

        double tavaDecimal = taxaAnual / 100;
        double juros = principal * tavaDecimal * tempo;

        System.out.println("\nResultados: ");
        System.out.println("Capital inicial: R$ " + principal);
        System.out.println("Tava de juros anual: " + taxaAnual + "%");
        System.out.println("Tempo: " + tempo + " anos");
        System.out.println("Juros acumulados: R$ " + juros);
        System.out.println("Montante final (capital + juros): R$ " + (principal + juros));

        scanner.close();
    }
}
