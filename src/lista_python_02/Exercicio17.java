package lista_python_02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um ano: ");
        double anoInformado = scanner.nextDouble();
        boolean anoBissexto = anoInformado %4 == 0;
        if (anoBissexto){
            System.out.println(anoInformado +" é um ano bissexto");
        }
        else{
            System.out.println(anoInformado+" não é um ano bissexto");
        }
        scanner.close();
    }
}
