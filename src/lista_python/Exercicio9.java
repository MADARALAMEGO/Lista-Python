package lista_python;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a temperatura em Fahrenheit(°F): ");
        double F = scanner.nextDouble();
        double Fahrenheit = 5 * ((F -32) / 9);
        double Celsius = Fahrenheit;
        System.out.println("A temperatura em Celsius(°C) é "+ Celsius + "°C");

        scanner.close();
    }
}
