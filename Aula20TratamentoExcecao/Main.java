import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
	try {
		Calculadora cal = new Calculadora();
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe os numeros para Peso e Altura.");
		num1 = input.nextInt();
		num2 = input.nextInt();
		cal.setX(num1);
		cal.setY(num2);
		
		System.out.println("\nPeso: " + cal.getX());
		System.out.println("\nAltura: " + cal.getY());
		System.out.println("\nIMC: " + cal.pesoAltura());

			
		
		}
		catch(ArithmeticException a)
		{
			System.out.println("Altura digitada 0. Erro-> " + a.toString());
		}
		catch(InputMismatchException i)
		{
			System.out.println("Valores de tipo errado. Erro-> " + i.toString());
		}
		
//		System.out.println("\nDivisão 2: " + cal.div2());
//		System.out.println("\nSoma: " + cal.soma());
//		System.out.println("\nSubstração: " + cal.sub());
//		System.out.println("\nMultiplicação: " + cal.mult());
		
		
	}
}
