package lista_python_02;


import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[F] para FEMININO ou [M] para Masculino\n");
        System.out.print("Digite seu sexo: ");
        char sexoInformado= scanner.next().charAt(0);
        if ('M' == sexoInformado || 'm' == sexoInformado) {
            System.out.print("Sexo Masculino");
        } else if (sexoInformado == 'F' || sexoInformado == 'f') {
            System.out.print("Sexo Feminino");
        } else {
            System.out.print("Sexo inválido");//
        }
        scanner.close();
    }
}
