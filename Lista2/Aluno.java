
public class Aluno {
	private int matricula;
	private String nome;
	private double nota1,nota2,notaT;
	
	public Aluno() {}
	public Aluno(int matricula, String nome, double nota1, double nota2, double notaT) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 =nota2;
		this.notaT = notaT;
	}
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	public int getMatricula()
	{
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaT() {
		return notaT;
	}
	public void setNotaT(double notaT) {
		this.notaT = notaT;
	}
	public double calculaMediaPonderada()
	{
		double media = 0;
		media = ((getNota1() * 2.5) + (getNota2() * 2.5) + (getNotaT()) * 2) / 7;
		return media;
	}
	public double verificaSituacao(double media)
	{
		if(media >= 6)
		{
			return 1;
		}else if(media >= 4 || media <= 5.9)
		{
			return 2;
		}else {
			return 3;
		}
	}
}
