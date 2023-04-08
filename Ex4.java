import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args)
	{
		System.out.println("Insira uma data para verificar.");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		input.close();
		dia(data);
		mes(data);
		ano(data);
		System.out.println("Dia: "+ dia(data));
		System.out.println("Mes: "+ mes(data));
		System.out.println("Ano: "+ ano(data));
		if(mes(data) > 0 && mes(data) < 12)
		{
			System.out.println("Este mês existe: "+ mes(data));

		}else {System.out.println("Este mes não existe: "+ mes(data));}
		if(dia(data) >= 1 && dia(data) <= 31)
		{
			System.out.println("O dia "+ dia(data) +" existe no calendário.");
			if(mes(data) == 2)
			{
			
			if(dia(data) >= 1 && dia(data) <= 29)
			{
				if(bissexto(data) == 0 && dia(data) == 29)
				{
					
					System.out.println("Apesar de ser o mês " + mes(data) + " não ter " + dia(data) + " dias, por ser o ano bissexto " + ano(data) + " o dia " + dia(data) + " é um dia válido.");
				}
			}else
			{
			System.out.println("Não existem "+ dia(data) +" dias no mes " + mes(data));
			}	
			}
		}else {
			System.out.println("O dia "+ dia(data) +" não existe no calendário.");
		}
		
		
		
	}
	public static int dia(int data)
	{
		
		int dia = data / 100;
		dia = dia / 100;
		return dia;
	}
	public static int mes(int data)
	{
		int mes = data / 100;
		mes = mes % 100;
		return mes;
	}

	public static int ano(int data)
	{
		int ano = data % 100;
		ano = ano % 100;
		return ano;
	}
	public static int bissexto(int data)
	{
		data = data * 100;
		int bissexto1 = data % 400;
		int bissexto2 = data % 4;
		int bissexto3 = data % 100;
		int bissextoReal = bissexto1 + bissexto2 + bissexto3;
		return bissextoReal;
	}
}
