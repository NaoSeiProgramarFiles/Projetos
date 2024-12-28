package Outros;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        double saldo = 0;
        String tipoConta = "Corrente";
        String nome = "Dionisio Rohling";

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*****************************");
        System.out.println(" ");

        while(opcao != 4){

            System.out.println("Operações ");
            System.out.println(" ");
            System.out.println("1 - Contultar saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if(opcao == 1){
                System.out.println("Saldo em conta: R$ " + saldo);
                System.out.println(" ");

            } else if (opcao == 2){
                System.out.print("Digite o valor: ");
               double saldoEntrada = entrada.nextDouble();
               saldo = saldo + saldoEntrada;
                System.out.println(" ");

            } else if(opcao == 3){

                System.out.print("Digite o valor a transferir: ");
                double valorTransf = entrada.nextDouble();

                while(valorTransf > saldo){

                        System.out.println("Não é possivel transferir o saldo não é suficiente!");
                        System.out.print("Digite novamente o valor: ");
                        valorTransf = entrada.nextDouble();
                        System.out.println(" ");
                }
                saldo = saldo - valorTransf;

            } else if (opcao == 4){
                System.out.println("Finalizando o programa!");

            } else {
                System.out.println("Opção inválida!");
                System.out.println(" ");
            }
        }
    }
}