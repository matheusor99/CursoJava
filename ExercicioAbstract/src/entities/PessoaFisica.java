package entities;

public class PessoaFisica extends Contribuintes{
	private double gastosComSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, double rendaAtual, double gastosComSaude) {
		super(nome, rendaAtual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double impostoPago() {
		if(getRendaAnual() < 20_000.00) {
			return getRendaAnual() * 0.15 - this.gastosComSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - this.gastosComSaude * 0.5;
		}
	}
	
}
