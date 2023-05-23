import java.util.ArrayList;

public class TestaPessoa {
	public static void main(String[] args)
	{
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("Vitor", "123123123", "31/12/1901");
		Pessoa p2 = new Pessoa("Joao", "789789789", "20/07/1994");
		pessoas.add(p1);
		pessoas.add(p2);
		System.out.println(pessoas);
		
	}
}
