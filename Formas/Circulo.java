
public class Circulo extends Formas {
	private double raio;
	public Circulo(){}
	public Circulo(double raio){
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double calcularPerimetroCir()
	{
		return 2 * 3.14 * raio;
	}
	public double calcularAreaCir()
	{
		return raio * 3.14;
	}

}
