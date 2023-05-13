
public class Produtos {
	private double preco;
	private int qtdEstoque;
	private double imposto;
	
	public Produtos() {}
	public Produtos(double preco, int qtdEstoque, double imposto) {
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.imposto = imposto;
	}
	
	
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public void add(Produtos pedido) {
		add(pedido);
		
	}
	public int size() {
		return produtos.size();
	}
	
	
	
	
}
