package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		System.out.println("Digite a altura do retângulo");
		r.altura = sc.nextDouble();
		System.out.println("Digite a largura do retângulo");
		r.largura = sc.nextDouble();
		System.out.println(r);
		sc.close();
	}

}
