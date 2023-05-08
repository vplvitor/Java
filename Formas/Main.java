import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Formas> formas = new ArrayList<Formas>();
		Retangulo r1 = new Retangulo(5, 10);
		Circulo c1 = new Circulo(20);
		Retangulo r2 = new Retangulo(50, 30);
		Circulo c2 = new Circulo(10);
		formas.add(r1);
		formas.add(c1);
		formas.add(r2);
		formas.add(c2);
		
		for(int i = 0; i < formas.size(); i++)
		{
			System.out.println("\n[-- Index no Array " + i + " --]");
			if(formas.get(i).calcularAreaCir() != 0)
			{
				System.out.println("\nCalculo da Area de Circulo " + formas.get(i).calcularAreaCir()); 
			}
			if(formas.get(i).calcularPerimetroCir() != 0)
			{
				System.out.println("\nCalculo da Perimetro de Circulo " + formas.get(i).calcularPerimetroCir()); 
			}
			if(formas.get(i).calcularAreaRet() != 0)
			{
				System.out.println("\nCalculo da Area de Retangulo " + formas.get(i).calcularAreaRet());
			}
			if(formas.get(i).calcularPerimetroRet() != 0)
			{
				System.out.println("\nCalculo da Area de Retangulo " + formas.get(i).calcularPerimetroRet());
			}
		}
	}
}
