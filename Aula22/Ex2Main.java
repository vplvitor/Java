

public class Ex2Main {
	public static void main(String[] args) {
		Estoque estoque = new Estoque(0);
		Produtos p1 = new Produtos("leite", 5, 20);
		Produtos p2 = new Produtos("bife", 20, 5);
		estoque.adicionarProduto(0, p1);
		estoque.adicionarProduto(1, p2);
		System.out.println(estoque.toString());
		System.out.println("\nValor dos Itens em estoque: R$ " + estoque.calcularEstoque());
	}
}
