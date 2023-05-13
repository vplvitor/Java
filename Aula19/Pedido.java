public class Pedido {

	private Produtos pedido = new Produtos();
	private int qtdItens;
	private String pagamento;
	
	public Pedido() {}
	public Pedido(Produtos pedido, int qtdItens, String pagamento)
	{
		this.pedido = pedido;
		this.qtdItens = qtdItens;
		this.pagamento = pagamento;
	}
	
	
	public Produtos getPedido() {
		return pedido;
	}
	public void setPedido(Produtos pedido) {
		this.pedido.add(pedido);
	}
	public int getQtdItens() {
		return qtdItens;
	}
	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public double valorTotal()
	{
		precoTotal = 0;
		for(int i = 0; i < pedido.size();)
		pedido.getPreco();
		return 0;
	}
	public String toString()
	{
		
		return "\nPreco dos Itens "
	}
}
