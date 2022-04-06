package lista_python_02;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1]- DOMINGO");
        System.out.println("[2]- SEGUNDA");
        System.out.println("[3]- TERÇA");
        System.out.println("[4]- QUARTA");
        System.out.println("[5]- QUINTA");
        System.out.println("[6]- SEXTA");
        System.out.println("[7]- SÁBADO");
        System.out.print("Digite um numero correspondente à um dia da semana: ");
        byte diasDaSemana = scanner.nextByte();
        if (diasDaSemana == 1) {
            System.out.println("Domingo \uD83D\uDE2D");
        }
        else if (diasDaSemana == 2){
            System.out.println("Segunda \uD83D\uDE20");
        }
        else if (diasDaSemana == 3){
            System.out.println("Terça \uD83D\uDE03");
        }
        else if (diasDaSemana == 4){
            System.out.println("Quarta \uD83D\uDE10");
        }
        else if (diasDaSemana == 5){
            System.out.println("Quinta \t\uD83E\uDD14");
        }
        else if (diasDaSemana == 6){
            System.out.println("Sexta \uD83E\uDD73");
        }
        else if (diasDaSemana == 7){
            System.out.println("Sábado \uD83D\uDE0E");
        }
        else if (diasDaSemana != 1 || diasDaSemana != 2 || diasDaSemana!= 3 || diasDaSemana != 4 ||
                 diasDaSemana != 5 || diasDaSemana != 6 || diasDaSemana != 7){
            System.out.println("ERROR VALOR INVÁLIDO \uD83D\uDE16");
        }
        scanner.close();
    }
}
