package lista_python;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor recebido por horas trabalhadas: ");
        double SalarioHoras = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas no mes: ");
        double HorasTrabalhadasMes = scanner.nextDouble();
        double SalarioBruto = SalarioHoras * HorasTrabalhadasMes;
        double IR = SalarioBruto*11/100;
        double INSS = SalarioBruto*8/100;
        double SINDICATO = SalarioBruto*5/100;
        double SL = SalarioBruto-IR-INSS-SINDICATO;
        System.out.println("Salário Bruto: " + SalarioBruto +"R$ \n");
        System.out.println("IR: "+ IR +"R$ \n");
        System.out.println("INSS: "+ INSS +"R$ \n");
        System.out.println("Sindicato: "+ SINDICATO +"R$ \n");
        System.out.println("Salario Liquido: "+ SL + "R$ \n");

        scanner.close();

    }
}
