
public class Carro implements EmissaoCarbono {
	private String combustivel;
	private double kmRodados;
	
	public Carro() {}
	public Carro(String combustivel, double kmRodados) {
		this.combustivel = combustivel;
		this.kmRodados = kmRodados;
	}
	@Override
	public double quantidadeEmitida() {
		
		if(combustivel == "alcool" || combustivel == "gasolina") {
			return (96 * kmRodados);
		}else if(combustivel == "eletrico")
		{
			return (53 * kmRodados);
		}else{
			return (171 * kmRodados);
		}
	}
	public String toString()
	{
		return "\nVeiculo: Carro\nCombustivel: " + combustivel +
				"\nKilometros Rodados: " + kmRodados;
	}
	
	
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getKmRodados() {
		return kmRodados;
	}
	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}
	
}
