package lista_python_02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numeroInformado = scanner.nextFloat();
         boolean divisaoDoNumero = numeroInformado % 1 == 0;
        if (divisaoDoNumero){
            System.out.print("Numero Inteiro");
        } else{
            System.out.print("Numero Decimal");
        }
    }
}
