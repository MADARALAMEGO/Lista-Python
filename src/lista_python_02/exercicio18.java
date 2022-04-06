package lista_python_02;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATA: dd/mm/aaaa");
        System.out.print("Informe uma data de acordo com formato acima: \n");
        System.out.print("dia: ");
        byte diaDoAno = scanner.nextByte();
        System.out.print("mes: ");
        byte mesDoAno = scanner.nextByte();
        System.out.print("Ano: ");
        double anoInformado = scanner.nextDouble();
        if (diaDoAno >= 1 & diaDoAno <= 31 & mesDoAno >= 1 & mesDoAno <= 12 & anoInformado > 0 & anoInformado <=2022){
            System.out.println("Ano válido");
        }
        else if (anoInformado > 2022){
            System.out.println("ALERTA FBI! VIAJANTE DO TEMPO A SOLTA!");
        }
        else if (diaDoAno < 1 || diaDoAno > 31 || mesDoAno < 1 || mesDoAno > 12){
            System.out.println("ERROR!!! O DIA OU MES ESTÃO INVÁLIDO!");
        }
        scanner.close();
    }
}
