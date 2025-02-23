package MegaSenaSimulador;
import java.util.*;

public class MegaSenaSimulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Tela de Boas-Vindas
        System.out.println("Bem vindo simulador da Mega-Sena");
        int quantidadeAposta;
        //Solicita a quantidade de numeros para aposta
        while (true){
            System.out.print("Quantos números deseja apostar? (Entre 6 e 20) ");
            try{
                quantidadeAposta = scanner.nextInt();
                if (quantidadeAposta >= 6 && quantidadeAposta <= 20) {
                    break;
                } else {
                    System.out.println("Por favor, escolha um número: (Entre 6 e 20) ");
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida. Digite um numero válido. ");
                scanner.next();
            }
        }
        //Gerar os números apostados pelo usuário
        Set<Integer> numerosApostados = new TreeSet<>();
        while(numerosApostados.size() < quantidadeAposta){
            numerosApostados.add(random.nextInt(60) + 1);
        }
        System.out.println("Seus números: " + numerosApostados);
        //Realiza o sorteio
        Set<Integer> numerosSorteados = new TreeSet<>();
        while (numerosSorteados.size() < 6){
            numerosSorteados.add(random.nextInt(60) + 1);
        }
        System.out.println("Números sorteados: " + numerosSorteados);
        //Verificar acertos
        Set<Integer> acertos = new TreeSet<>(numerosApostados);
        acertos.retainAll(numerosSorteados);
        int quantidadeAcertos = acertos.size();
        //Exibir os resultados
        System.out.println("Você acertou " + quantidadeAcertos + " números: " +acertos);
        if(quantidadeAcertos == 6){
            System.out.println("Parabéns! Você acertou a MEGA-SENA!");
        } else if (quantidadeAcertos == 5){
            System.out.println("Parabéns! Você acertou a QUINA!");
        } else if (quantidadeAcertos == 4){
            System.out.println("Parabéns! Você acertou a QUADRA!");
        } else {
            System.out.println("Infelizmente, você não ganhou desta vez. Tente novamente.");
        }
        scanner.close();
    }
}
