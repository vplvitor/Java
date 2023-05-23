import java.util.HashSet;
import java.util.Iterator;

public class ExemploConjunto {
	public static void main(String[] args) {
		HashSet<String> cargos = new HashSet<String>();
		cargos.add("Diretor");
		cargos.add("President");
		cargos.add("Secretaria");
		cargos.add("Analista de TI");
		cargos.add("Diretor");
		cargos.add("Analista de TI");
		System.out.println(cargos);
		for(String cargo: cargos)
		{
			System.out.println("Cargo: " + cargo);
		}
		Iterator<String> elemento = cargos.iterator();
		while(elemento.hasNext()){
			System.out.println("Elemento Atual: " + elemento.next());
		}
	}
}
