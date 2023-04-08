import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
		int ano = 0;
		System.out.println("Informe um ano para saber se é bisexo ou não.");
		Scanner input = new Scanner(System.in);
		ano = input.nextInt();
		input.close();
			if(anoBix400(ano) == 0)
			{
				System.out.println("O numero " + ano + " e divisivel por 400, portanto, e bichesco.");
			}else {
				System.out.println("O numero " + ano + " nao e divisivel por 400, portanto, nao e bichesco.");
			}
			if(anoBix4(ano) == 0 && anoBix100(ano) != 0)
			{
				System.out.println("O numero " + ano + " e divisivel por 4 ou nao e por 100, portanto, e bichesco.");
			}else {
				System.out.println("O numero " + ano + " nao eh divisivel por 4 ou eh divisivel por 100, portanto, nao e bichesco.");
			}
			
		}
		
	
		public static  int anoBix400(int ano)
			{
				int anoResto400 = ano % 400;
				return anoResto400;
			}
		public static int anoBix4(int ano)
			{
				int anoResto4 = ano % 4;
				return anoResto4;
			}
		public static int anoBix100(int ano)
			{
				int anoResto100 = ano % 100;
				return anoResto100;
			}

}
