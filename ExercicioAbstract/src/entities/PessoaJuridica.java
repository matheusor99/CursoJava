package entities;

public class PessoaJuridica extends Contribuintes{

	private int numeroFuncionarios;

	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, double rendaAtual, int numeroFuncionarios) {
		super(nome, rendaAtual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (numeroFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
	
}
