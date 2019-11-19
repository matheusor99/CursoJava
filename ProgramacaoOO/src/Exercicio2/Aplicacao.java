package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		System.out.println("Digite o nome do funcionario");
		f.nome = sc.nextLine();
		System.out.println("Digite o salário bruto do funcionario");
		f.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto do funcionario");
		f.imposto = sc.nextDouble();
		f.aumentarSalario(10);
		System.out.println(f);
		sc.close();
	}

}
