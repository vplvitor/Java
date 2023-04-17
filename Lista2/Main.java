import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite numero para receber o fatorial.");
		numero = input.nextInt();
		System.out.println("O fatorial de " + numero + " e " + ConjuntoOperacoes.fatorial(numero));
		
		System.out.println("Digite numero para ser multiplicado e outro para ser o exponencial.");
		int exponencial;
		numero = input.nextInt();
		exponencial = input.nextInt();
		System.out.println(numero + " ao exponencial de " + exponencial + " resulta em " + ConjuntoOperacoes.exponencial(numero, exponencial));
		
		System.out.println("Digite o tamanho do vetor que deseja criar");
		int index = input.nextInt();
		int vetor[] = new int[index];
		System.out.println("Insira valores para preencher um vetor e buscar o maior na lista.");
		for(int i = 0; i < index; i++)
		{
			vetor[i] = input.nextInt();
		}
		System.out.println("O maior numero do vetor e " + ConjuntoOperacoes.maior(vetor));
		
		
		System.out.println("Digite nome, nota 1, nota 2, nota trabalho.");
		Aluno aluno = new Aluno();
		aluno.setNome(input.nextLine());
		input.nextLine();
		aluno.setNota1(input.nextInt());
		aluno.setNota2(input.nextInt());
		aluno.setNotaT(input.nextInt());
		
		System.out.println("O aluno de nome " + aluno.getNome() + "teve as notas: " + aluno.getNota1() + " / " + aluno.getNota2() + " / " + aluno.getNotaT());
		System.out.println("Com essas notas, ele ficou com a media " + aluno.calculaMediaPonderada() + ", obtendo o status de ");
		if(aluno.verificaSituacao(aluno.calculaMediaPonderada()) == 1)
		{
			System.out.println("Aprovado.");
		}else if(aluno.verificaSituacao(aluno.calculaMediaPonderada()) == 2)
		{
			System.out.println("Recuperacao.");
		}else {
			System.out.println("Reprovado.");
		}
		
		input.close();
	}
}
