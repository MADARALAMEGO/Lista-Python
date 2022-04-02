package lista_python;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a área (m²) que deverá ser pintada: ");
        double area = scanner.nextDouble();

        double lata = area/108;
        double precoLata = lata*80;

        double Galao = area/21.6;
        double precoGalao = Galao*25;

        double latasArredondadas = Math.floor(lata);
        double GaloesArredondados = Math.floor(Galao);
        double precoArredondado = Math.floor(precoLata);
        double precogArredondado = Math.floor(precoGalao);


        System.out.println("Você precisará de "+ latasArredondadas + " latas");
        System.out.println("O preço sairá em torno de "+ precoArredondado +"R$ por lata \n");
        System.out.println("Você precisará de "+ GaloesArredondados + " galões ");
        System.out.println("O preço sairá em torno de "+ precogArredondado +"R$ por galão \n");



        scanner.close();
    }
}
