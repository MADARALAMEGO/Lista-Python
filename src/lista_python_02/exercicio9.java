package lista_python_02;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        byte primeiroNumero = scanner.nextByte();
        System.out.print("Digite outro numero: ");
        byte segundoNumero = scanner.nextByte();
        System.out.print("Digite mais um numero: ");
        byte terceiroNumero = scanner.nextByte();
        if (primeiroNumero > segundoNumero & primeiroNumero > terceiroNumero & segundoNumero > terceiroNumero){
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: "+ primeiroNumero + ","+ segundoNumero + " e "+ terceiroNumero);
        }
        else if (primeiroNumero > segundoNumero & primeiroNumero > terceiroNumero & terceiroNumero > segundoNumero){
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: "+ primeiroNumero + ","+ terceiroNumero + " e "+ segundoNumero);
        }
        else if (segundoNumero > primeiroNumero & segundoNumero > terceiroNumero & primeiroNumero > terceiroNumero){
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: "+ segundoNumero + ", "+ primeiroNumero + " e "+ terceiroNumero);
        }
        else if (segundoNumero > primeiroNumero & segundoNumero > terceiroNumero & terceiroNumero > primeiroNumero) {
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: " + segundoNumero + ", " + terceiroNumero + " e " + primeiroNumero);
        }
        else if (terceiroNumero > primeiroNumero & terceiroNumero > segundoNumero & primeiroNumero > segundoNumero) {
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: " + terceiroNumero + ", " + primeiroNumero + " e " + segundoNumero);
        }
        else if (terceiroNumero > primeiroNumero & terceiroNumero > segundoNumero & segundoNumero > primeiroNumero) {
            System.out.println("Os numeros ordenados (DECRESCENTE) fica: " + terceiroNumero + ", " + primeiroNumero + " e " + segundoNumero);
        }
        scanner.close();
    }
}
