import java.util.HashMap;
public class Estoque {
		private int identificador;
		private HashMap<Integer, Produtos> estoque;

	public Estoque(int identificador){
		this.identificador = identificador;
		estoque = new HashMap<Integer, Produtos>();
	}
	public void adicionarProduto(int id, Produtos produto) {
		estoque.put(id, produto);
	}
	public void removerProduto(int id, Produtos produto) {
		estoque.remove(id, produto);
	}
	public double calcularEstoque() {
		double valorEstoque = 0;
		for(int i = 0; i < estoque.size(); i++) {
			valorEstoque += (estoque.get(i).getValorUni() * estoque.get(i).getQtd());
		}
		return valorEstoque;
	}
	public String toString()
	{
		
		return estoque.toString();
	}
}
