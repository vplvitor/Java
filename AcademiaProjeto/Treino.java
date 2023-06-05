public class Treino {
	private int abdominal = 15;
	private int esteira = 10;
	private int prancha = 60;
	private int peso;
	
	public Treino() {}
	public Treino(int abdominal, int esteira, int prancha) {
		this.abdominal = abdominal;
		this.esteira = esteira;
		this.prancha = prancha;
	}
	
	public int getAbdominal() {
		return abdominal;
	}
	public void setAbdominal(int abdominal) {
		this.abdominal = abdominal;
	}
	public int getEsteira() {
		return esteira;
	}
	public void setEsteira(int esteira) {
		this.esteira = esteira;
	}
	public int getPrancha() {
		return prancha;
	}
	public void setPrancha(int prancha) {
		this.prancha = prancha;
	}
	
	public String toString() {
		return "Treino [abdominal=" + abdominal + ", esteira=" + esteira + ", prancha=" + prancha + "]";
	}
	
	
}
