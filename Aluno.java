

public class Aluno extends Pessoa {
	private String curso;
	private int anoIngresso;
	public Aluno() {}
	public Aluno(String curso, int anoIngresso, String nome, String cpf, char sexo)
	{
		super(nome, cpf, sexo);
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public String toString()
	{
		String str = super.toString() + "\n Curso: " + curso +
										"\n Ano de Ingresso: " + anoIngresso;
		return str;
	}
	
}
