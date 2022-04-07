package lista_python_02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[M] Matutino \n");
        System.out.println("[V] Vespertino \n");
        System.out.println("[N] Noturno \n");
        System.out.print("Digite a período do dia desejada: ");
        char periodoDoDia = scanner.next().charAt(0);
        if (periodoDoDia == 'M' || periodoDoDia == 'm'){
            System.out.println("Bom dia! B)");
        }
        else if (periodoDoDia == 'V' || periodoDoDia == 'v'){
            System.out.println("Boa tarde! :p");
        }
        else if (periodoDoDia == 'N' || periodoDoDia == 'n'){
            System.out.println("Boa noite! :)");
        }
        else if (periodoDoDia != 'M' || periodoDoDia != 'm' || periodoDoDia != 'V' || periodoDoDia != 'v'
                || periodoDoDia != 'N' || periodoDoDia != 'n'){
            System.out.println("VALOR INVALIDO! ;-;");
        }
        scanner.close();
    }
}

