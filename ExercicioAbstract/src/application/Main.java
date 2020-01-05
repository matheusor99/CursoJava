package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> listaContribuintes = new ArrayList<>();
		double totalImpostos = 0;
		System.out.println("Digite o numero de contribuintes");
		int contribuintes = sc.nextInt();
		
		for(int i = 0; i < contribuintes; i++) {
			System.out.println("Pessoa Fisica ou Juridica (f/j)");
			String tipoPessoa = sc.next();
			System.out.println("Digite o nome");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("digite a renda anual");
			double rendaAnual = sc.nextDouble();
		
			if(tipoPessoa.equals("f")) {
				System.out.println("Digite os gastos com saude");
				double gastosComSaude = sc.nextDouble();
				PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastosComSaude);
				listaContribuintes.add(pf);
			} else {
				System.out.println("digite o numero de funcionarios");
				int numeroFuncionarios = sc.nextInt();
				PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				listaContribuintes.add(pj);
			}
		}
		for (Contribuintes c : listaContribuintes) {
			System.out.println(c.getNome() + ", imposto pago = "+ String.format("%.2f", c.impostoPago()));
			totalImpostos += c.impostoPago();
		}
		System.out.print("total de Impostos = "+ totalImpostos);
	}
}
