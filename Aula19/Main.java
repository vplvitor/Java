import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		Cidade cidade = new Cidade();
		Predio p1 = new Predio(25, true, 15, 5);
		Predio p2 = new Predio(30, false, 25, 10);
		Carro c1 = new Carro("eletrico", 1000);
		Carro c2 = new Carro("diesel", 5000);
		Bike b1 = new Bike(120);
		
		System.out.println("Emissao do Carro C1: " + c1.quantidadeEmitida());
		System.out.println("Emissao do Carro C2: " + c2.quantidadeEmitida());
		System.out.println("Emissao do Predio P1: " + p1.quantidadeEmitida());
		System.out.println("Emissao do Predio P2: " + p2.quantidadeEmitida());
		System.out.println("Emissao da Bike B1: " + b1.quantidadeEmitida());
		
		cidade.add(c1);
		cidade.add(p1);
		cidade.add(c2);
		cidade.add(p2);
		cidade.add(b1);
		double emissaoCidade = 0;
		emissaoCidade = cidade.calculaEmissaoMensal();
		System.out.println("\nEmissao Total da Cidade: " + emissaoCidade);
	}
}
