public class Professor extends Pessoa {
	private String departamento;
	private int anoAdmissao;
	
	public Professor() {}
	public Professor(String departamento, int anoAdmissao, String nome, String cpf, char sexo)
	{
		super(nome, cpf, sexo);
		this.departamento = departamento;
		this.anoAdmissao = anoAdmissao;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getAnoAdmissao() {
		return anoAdmissao;
	}
	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	public String toString()
	{
		String str = super.toString() + "\n Departamento: " + departamento +
										"\n Ano de Admissão: " + anoAdmissao;
		return str;
	}
}
