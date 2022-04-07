package lista_python_02;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letraDigitada = scanner.next().charAt(0);
        boolean vogalInformada =  letraDigitada == 'a'|| letraDigitada == 'e' || letraDigitada == 'i' || letraDigitada == 'o' || letraDigitada =='u'
                ||  letraDigitada == 'A'|| letraDigitada == 'E' || letraDigitada == 'I' || letraDigitada == 'O' || letraDigitada =='U';
        if (vogalInformada){
            System.out.println("A letra informada é uma vogal");
        }
        else {
            System.out.println("A letra informada é uma consoante");
        }
        scanner.close();
    }
}
