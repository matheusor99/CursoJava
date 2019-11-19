package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		System.out.println("Insira o nome do Aluno");
		a.nome = sc.nextLine();
		System.out.println("Insira a primeira nota do Aluno");
		a.nota1 = sc.nextDouble();
		System.out.println("Insira a segunda nota do Aluno");
		a.nota2 = sc.nextDouble();
		System.out.println("Insira a terceira nota do Aluno");
		a.nota3 = sc.nextDouble();
		System.out.println(a);
		sc.close();
	}
}
