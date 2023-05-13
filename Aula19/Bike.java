
public class Bike implements EmissaoCarbono {
	private double kmRodados;
	
	public Bike() {}
	public Bike(double kmRodados)
	{
		this.kmRodados = kmRodados;
	}
	public double quantidadeEmitida() {
		return 0;
	}
	public String toString()
	{
		return "\nVeiculo: Bicicleta\nKilometros Rodados: " + kmRodados;
	}
	
	public double getKmRodados() {
		return kmRodados;
	}
	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}
	
	
	
}
