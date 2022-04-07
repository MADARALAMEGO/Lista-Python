package lista_python_02;


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[F] para FEMININO ou [M] para Masculino\n");
        System.out.print("Digite seu sexo: ");
        char sexoInformado= scanner.next().charAt(0);
        boolean sexoFeminino = sexoInformado == 'F' || sexoInformado == 'f';
        boolean sexoMasculino = sexoInformado == 'M' || sexoInformado == 'm';
        if (sexoMasculino) {
            System.out.print("Sexo Masculino");
        } else if (sexoFeminino) {
            System.out.print("Sexo Feminino");
        } else {
            System.out.print("Sexo inválido");//
        }
        scanner.close();
    }
}