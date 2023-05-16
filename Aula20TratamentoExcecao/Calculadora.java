import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
	private int x;
	private int y;
	Scanner input = new Scanner(System.in);
	public Calculadora() {}
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int soma()
	{
		return x + y;
	}
	public int sub()
	{
		return x - y;
	}
	public int mult()
	{
		return x * y;
	}
	public int div()
	{
		try {
			return x / y;
		}
		catch(ArithmeticException e) {
			while(y == 0)
			{
				System.out.println("\nDivisor digitado 0. Informe o divisor novamente.");
				setY(input.nextInt());
			}
			return x / y;
		}
		
		
//		try {
//			resultado = x/ y;
//			achou = true;
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Divisor 0. Informe divisor novamente.");
//			y = input.nextInt()
//			
//		}
		
	}
	public int div2() {
		try
		{
			System.out.println("\nDigite os dois numeros");
			setX(input.nextInt());
			setY(input.nextInt());
			return x / y;
		}
		catch(ArithmeticException a)
		{
			while(y == 0)
			{
				System.out.println("\nDivisor digitado 0. Informe o divisor novamente.");
				setX(input.nextInt());
				setY(input.nextInt());
			}
			return x / y;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught! ->" + e);
		}
		finally {
			System.out.println("Execução finalizada.");
		}
		return 0;
		
		
	}
//	public int verificador()
//	{
//		getX();
//		getY();
//		try{
//			return x + y;
//		}
//		catch(InputMismatchException i)
//		{
//			while(y == 0)
//			{
//				System.out.println("\nErro de entrada de dados " + i.toString());
//				System.out.println("\nDigite os numeros novamente.");
//				setX(input.nextInt());
//				setY(input.nextInt());
//			}
//			return x / y;
//			
//		}
	public int pesoAltura() {
			return x / (y * y);
	}
	
}
