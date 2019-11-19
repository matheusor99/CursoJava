package Exercicio2;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double percentual) {
		salarioBruto += (salarioBruto * percentual) / 100;
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", salario liquido = " + salarioLiquido();
	}
	
	
}
