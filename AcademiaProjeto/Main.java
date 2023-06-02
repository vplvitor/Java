import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite seus dados para cadastro na academia e receba um treino recomendado pela equipe.");
		Scanner input = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		Cadastro c1 = new Cadastro();
		System.out.println("Nome: ");
		c1.setNome(input.nextLine());
		System.out.println("Email: ");
		c1.setEmail(input.nextLine());
		System.out.println("Altura (Metros): ");
		c1.setAltura(input.nextDouble());
		System.out.println("Peso (Kilos): ");
		c1.setPeso(input.nextDouble());
		try {
			System.out.println("Seu IMC: " + c1.imcCalculo());
			}
		catch(ArithmeticException Ar) {
			System.out.println("A altura não pode ser 0. Refaça seu cadastro.");
			System.out.println(Ar.toString());
			}
		cadastro.atribuiTreino();
		
		
		System.out.println(c1.toString());
	}
}
