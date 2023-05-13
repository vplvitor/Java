
public class MainMercado {
	public static void main(String[] args){
		
		Produtos p1 = new Produtos(25, 4, 0.1);
		Pedido pedido1 = new Pedido();
		pedido1.setPedido(p1);
		pedido1.setQtdItens(2);
		pedido1.setPagamento("Dinhero");
	}
}
