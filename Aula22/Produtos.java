
public class Produtos {
	
	private String nome;
	private double valorUni;
	private int qtd;
	public Produtos(){}
	public Produtos(String nome, double valorUni, int qtd) {
		
		this.nome = nome;
		this.valorUni = valorUni;
		this.qtd = qtd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorUni() {
		return valorUni;
	}
	public void setValorUni(double valorUni) {
		this.valorUni = valorUni;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String toString()
	{
		return "\nNome do Produto: " + nome +
				"\nPreco da Unidade: " + valorUni +
				"\nQuantidade em Estoque: " + qtd + "\n";
	}
}
