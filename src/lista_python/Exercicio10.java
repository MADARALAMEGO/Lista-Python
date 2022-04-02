package lista_python;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a temperatura em Celsius(°C): ");
        double temperaturaEmCelsius = scanner.nextDouble();
        double temperaturaEmFahrenheit = (( temperaturaEmCelsius * 9/5) + 32);
        System.out.print("A temperatura em Fahrenheit(°F) é "+ temperaturaEmFahrenheit + "°F");
        scanner.close();
    }
}
