
public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private String dataNas;
	public Pessoa() {}
	public Pessoa(String nome, String cpf, String dataNas) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNas = dataNas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNas() {
		return dataNas;
	}
	public void setDataNas(String dataNas) {
		this.dataNas = dataNas;
	}
	
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.nome);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNas=" + dataNas + "]";
	}
	
}
