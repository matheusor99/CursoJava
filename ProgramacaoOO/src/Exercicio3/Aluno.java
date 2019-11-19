package Exercicio3;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double calculoNotas() {
		return nota1 + nota2 + nota3;
	}
	
	@Override
	public String toString() {
		if (calculoNotas() >= 60) {
			return "Nota final = " + calculoNotas()  + "\n Aprovado"; 
		} else {
			return "Nota final = " + calculoNotas()  + "\n Reprovado \n Faltou "+ (60 - calculoNotas()) + " pontos";
		}
	}
}
