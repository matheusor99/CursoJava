package Exercicio4Static;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto está a cotação do dolar?");
		double dolar = sc.nextDouble();
		System.out.println("Quantos dolares você pretende comprar?");
		double valor = sc.nextDouble();
		System.out.printf("O valor que você terá que pagar sera de R$ %.2f",ConversorDolar.conversão(dolar, valor));
		sc.close();
	}
}
