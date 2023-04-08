import java.util.ArrayList;
import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args)
	{
		int cont = 1, digit = 1;
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Valor "+ cont);
		digit = input.nextInt();
		while(digit != 0)
		{
			cont++;
			numList.add(digit);
			System.out.println("Valor "+ cont);
			digit = input.nextInt();
		}
		input.close();
		media(numList);
		
		
		
		
	}
	public static double media(ArrayList<Integer> numList)
	{ 
		int soma = 0;
		for(int i = 0; i < numList.size(); i++)
		{
			soma = soma + numList.get(i);
		}
		int div = numList.size();
		double media = soma / div;
		System.out.println("Nº valores: " + numList.size());
		System.out.println("Soma da lista: "+ soma);
		System.out.println("Media: " + media);
		return media;
	}
}
