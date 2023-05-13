
public class Predio implements EmissaoCarbono {
	private int numPessoas;
	private boolean renovavel;
	private int lampadas;
	private int AC;
	
	public Predio() {}
	public Predio(int numPessoas, boolean renovavel, int lampadas, int AC) {
		this.numPessoas = numPessoas;
		this.renovavel = renovavel;
		this.lampadas = lampadas;
		this.AC = AC;
	}
	@Override
	public double quantidadeEmitida() {
		if(renovavel)
		{
			return (14.4 * lampadas) + (10 * numPessoas) + (100 * AC) / 2;
		}else {
			return (14.4 * lampadas) + (10 * numPessoas) + (100 * AC);
		}
		
	}
	public String toString()
	{
		return "\nPredio\nNumero de Residentes: " + numPessoas +
				"\nEnergia Renovavel:" + renovavel +
				"\nNumero de Lampadas: " + lampadas +
				"\nUnidades de AC: " + AC;
	}
	
	
	
	public int getNumPessoas() {
		return numPessoas;
	}
	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}
	public boolean isRenovavel() {
		return renovavel;
	}
	public void setRenovavel(boolean renovavel) {
		this.renovavel = renovavel;
	}
	public int getLampadas() {
		return lampadas;
	}
	public void setLampadas(int lampadas) {
		this.lampadas = lampadas;
	}
	public int getAC() {
		return AC;
	}
	public void setAC(int aC) {
		AC = aC;
	}
	
}
