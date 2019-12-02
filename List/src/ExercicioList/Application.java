package ExercicioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários seram cadastrados?");
		int qtdFuncionarios = sc.nextInt();
		
		
		for (int i =0; i < qtdFuncionarios; i++) {
			System.out.println("digite o id do "+ (i+1) + "º funcionário");
			Long id = sc.nextLong();
			
			System.out.println("digite o nome do "+ (i+1) + "º funcionário");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("digite o salário do "+ (i+1) + "º funcionário");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
		}
		
		for(Funcionario f : list) {
			System.out.println(f);
		}
		
		System.out.println("-------------------------------");
		System.out.println("digite o id do funcionario que quer dar um almento");
		Long id = sc.nextLong();
		
		Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(f == null) {
			System.out.println("o Funcionario com esse id não existe");
		} else {
			System.out.println("Digite a porcentagem do aumento de salário");
			double porcentagem = sc.nextDouble();
			f.aumentarSalario(porcentagem);
			for(Funcionario fun : list) {
				System.out.println(fun);
			}
		}
		
		sc.close();
	}

}
