import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadeHorasJogadas;
		
		System.out.println("digite a hora que começou o jogo");
		int horaInincio = sc.nextInt();
		System.out.println("digite a hora que acabou o jogo");
		int horaTermino = sc.nextInt();
		
		
		if(horaInincio > horaTermino) {
			quantidadeHorasJogadas = 24 - horaInincio;
			quantidadeHorasJogadas += horaTermino;
		} else {
			quantidadeHorasJogadas = horaTermino - horaInincio;
		}
		
		System.out.println("O jogo durou "+ quantidadeHorasJogadas +" Hora(s)");
	}
}
