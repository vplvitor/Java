
public class Produtos {
	private int id;
	private String nome;
	private double preco;
	private int qtd;
	public Produtos() {}
	public Produtos(int id, String nome, double preco, int qtd)
	{
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double valorTotal()
	{
		return qtd * preco;
	}
	public void venda(int altera)
	{
		int alteraFinal = qtd - altera;
		setQtd(alteraFinal);
	}
	public void compra(int altera)
	{
		int alteraFinal = qtd + altera;
		setQtd(alteraFinal);
	}
}
