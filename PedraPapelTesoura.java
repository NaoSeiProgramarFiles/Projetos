package PedraPapelTesoura;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao jogo Pedra, Papel ou Tesoura!");
        System.out.println("Escolha: 0 para Pedra, 1 para Papel, 2 para Tesoura.");

        System.out.print("Sua escolha: ");
        int escolhaUsuario = scanner.nextInt();

        if(escolhaUsuario < 0 || escolhaUsuario >2){
            System.out.println("Escolha inválida. Reinicie o jogo e tente novamente.");
        } else {
            int escolhaComputador = random.nextInt(3);

            System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

            if (escolhaUsuario == escolhaComputador){
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                        (escolhaUsuario == 1 && escolhaComputador == 0) ||
                        (escolhaUsuario == 2 && escolhaComputador == 1)){
                System.out.println("Você venceu!");
            } else {
                System.out.println("O computador venceu!");
            }
        }
        scanner.close();
    }
}
