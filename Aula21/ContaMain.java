import java.util.Scanner;

public class ContaMain {
	public static void main(String[] args) throws ContaExcecao
	{
		ContaExcecao conEx = new ContaExcecao();
		Conta conta = new Conta();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o saldo total");
		conta.setSaldo(input.nextDouble());
		System.out.println("Insira quanto deseja depositar");
		conta.depositar(input.nextDouble());
		System.out.println("Insira quanto deseja sacar");
		conta.sacar(input.nextDouble());
	}
}
