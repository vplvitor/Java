import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args)
	{
		int numero = 0;
		int numeroRaiz = 0;
		

		Scanner input = new Scanner(System.in);
		numero = input.nextInt();
		input.close();
		numeroRaiz = numeroRaiz1(numero) + numeroRaiz2(numero);
		if(numeroRaiz3(numeroRaiz) == numero)
		{
			System.out.println("O numero " + numero + " e igual a soma de suas dezenas elevadas ao quadrado.");
			System.out.println(numeroRaiz +"="+ numeroRaiz1(numero) + "+" + numeroRaiz2(numero));
			System.out.println(numeroRaiz3(numeroRaiz) +"="+numeroRaiz +"*"+numeroRaiz);
		}else {
			System.out.println("O numero " + numero + " não é igual a soma de suas dezenas elevadas ao quadrado.");
			System.out.println(numeroRaiz +"="+ numeroRaiz1(numero) + "+" + numeroRaiz2(numero));
			System.out.println(numeroRaiz3(numeroRaiz) +"!="+numeroRaiz +"*"+numeroRaiz);
		}
		
	}
	public static int numeroRaiz1(int numero)
	{
		System.out.println(numero);
		int numeroDiv = numero / 100;
		return numeroDiv;
	}
	public static int numeroRaiz2(int numero)
	{
		int numeroRes = numero % 100;
		return numeroRes;
	}
	public static int numeroRaiz3(int numeroRaiz)
	{
		int raizFinal = numeroRaiz * numeroRaiz;
		return raizFinal;
	}
}
