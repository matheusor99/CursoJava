package ExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class Programn {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante[] quartosParaAlugar = new Estudante[10];
		
		System.out.println("Quantos quartos seram alugados?");
		int quartosAlugados = sc.nextInt();
		
		int i = 0;
		while(i < quartosAlugados) {
			System.out.println("Digite o nome do estudante");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o email do estudante");
			String email = sc.nextLine();
			System.out.println("Digite o numero do quarto que ele ira alugar");
			int numeroQuarto = sc.nextInt();
			Estudante estudante = new Estudante(nome, email, numeroQuarto);
			quartosParaAlugar[numeroQuarto-1] = estudante;
			i++;
		}
		
		System.out.println("Alugados\n");
		for (i =0; i < quartosParaAlugar.length; i++) {
			if (quartosParaAlugar[i] != null) {
				System.out.println(quartosParaAlugar[i].getNumeroQuarto()+": "+ quartosParaAlugar[i].toString());
			}
		}
		sc.close();
	}

}
