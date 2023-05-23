
public class ContaExcecao extends Exception {
	private double sacar;
	
	public ContaExcecao() {}
	public ContaExcecao(double sacar) {
		this.sacar = sacar;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	public String toString()
	{
		return "Saque de R$" + sacar + " maior que saldo atual.";
	}
	public String getMessage() {
		return "Saque cancelado por falta de fundos.";
	}
}
