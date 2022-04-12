package lista_python_02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("PERGUNTAS INTERROGATÓRIO:");
        System.out.println("RESPONDA AS PERGUNTAS COM SIM OU NÃO:");
        System.out.println("[1] Sim [2] Não");
        System.out.println("Telefonou para a vítima?");
        byte primeiraPergunta = scanner.nextByte();
        System.out.println("Esteve no local do crime?");
        byte segundaPergunta = scanner.nextByte();
        System.out.println("Mora perto da vítima?");
        byte terceiraPergunta = scanner.nextByte();
        System.out.println("Devia para a vítima?");
        byte quartaPergunta = scanner.nextByte();
        System.out.println("Já trabalhou com a vítima?");
        byte quintaPergunta = scanner.nextByte();
        boolean suspeita01 = primeiraPergunta == 1;
        boolean suspeita02 = segundaPergunta == 1;
        boolean suspeita03 = terceiraPergunta == 1;
        boolean suspeita04 = quartaPergunta == 1;
        boolean suspeita05 = quintaPergunta == 1;
        if (suspeita01 && suspeita02 && suspeita03 && suspeita04 && suspeita05 ) {
            System.out.println("Você está condenado, ASSASSINO");
        } if else (suspeita01 == 2 & suspeita02 & suspeita03 & suspeita04 & suspeita05 ||
                suspeita01 & suspeita02 == 2 & suspeita03 & suspeita04 & suspeita05 ||
                suspeita01 & suspeita02 & suspeita03 == 2 & suspeita04 & suspeita05 ||
                suspeita01 & suspeita02 & suspeita03 & suspeita04 == 2 & suspeita05 ||
                suspeita01 & suspeita02 & suspeita03 & suspeita04 & suspeita05 == 2) {
            System.out.println("Você está condenado por ser cumplice do assassino.");
        } if else (suspeita01 == 2 & suspeita02 == 2 & suspeita03 & suspeita04 & suspeita05 ||
                suspeita01 == 2 & suspeita02 & suspeita03 == 2 & suspeita04 & suspeita05 ||
                suspeita01 == 2 & suspeita02 & suspeita03 & suspeita04 == 2 & suspeita05 ||
                suspeita01 == 2 & suspeita02 & suspeita03 & suspeita04  & suspeita05 == 2 ) {
            System.out.println("Você está condenado por ser cumplice do assassino.");
        } if else (suspeita01 & suspeita02 == 2 & suspeita03 == 2 & suspeita04 & suspeita05 ||
                suspeita01 & suspeita02 == 2 & suspeita03 & suspeita04 == 2 & suspeita05 ||
                suspeita01 & suspeita02 & == 2 suspeita03 & suspeita04 & suspeita05 == 2){
            System.out.println("Você está condenado por ser cumplice do assassino.");
        } if else (suspeita01 & suspeita02 & suspeita03 == 2 & suspeita04 == 2 & suspeita05 ||
                suspeita01 & suspeita02 & suspeita03 == 2 & suspeita04 & suspeita05 == 2) {
            System.out.println("Você está condenado por ser cumplice do assassino.");
        } if else (suspeita01 & suspeita02 & suspeita03 & suspeita04 == 2 & suspeita05 == 2) {
            System.out.println("Você está condenado por ser cumplice do assassino.");
    }
}
