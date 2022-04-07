package lista_python_02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATA: dd/mm/aaaa");
        System.out.print("- Informe uma data de acordo com formato acima - \n");
        System.out.print("dia: ");
        byte diaDoAno = scanner.nextByte();
        System.out.print("mes: ");
        byte mesDoAno = scanner.nextByte();
        System.out.print("Ano: ");
        short anoInformado = scanner.nextShort();
        System.out.println("DATA: "+diaDoAno+"/"+mesDoAno+"/"+anoInformado);
        boolean aDataEValida = diaDoAno >= 1 & diaDoAno <= 31 & mesDoAno >= 1 & mesDoAno <= 12 & anoInformado > 0 & anoInformado <=2022;
        boolean easterEgg = anoInformado > 2022;
        boolean aDataEInvalida = diaDoAno < 1 || diaDoAno > 31 || mesDoAno < 1 || mesDoAno > 12;
        if (aDataEValida){
            System.out.println("Ano válido");
        }
        else if (easterEgg){
            System.out.println("\uD83D\uDEA8ALERTA FBI! VIAJANTE DO TEMPO A SOLTA!\uD83D\uDEA8");
        }
        else if (aDataEInvalida) {
            System.out.println("ERROR!!! O DIA OU MES ESTÃO INVÁLIDO!");
        }
        scanner.close();
    }
}
