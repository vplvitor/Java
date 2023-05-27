import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
public class FraseMapMain {
	public static void main(String[] args) {
		String fraseMap;
		System.out.println("Informe uma frase para saber quantas vezes uma mesma palavra aparece.");
		Scanner input = new Scanner(System.in);
		fraseMap = input.nextLine();
		input.close();
		HashMap<String, Integer> palavras = new HashMap<String, Integer>();
		//System.out.println(fraseMap.hashCode());
		String [] aux = fraseMap.split(" ");
		for(int i = 0; i < aux.length; i++)
		{
			if(palavras.containsKey(aux[i])) {
				palavras.replace(aux[i], palavras.get(aux[i])+1);
			}else {
				palavras.put(aux[i], 1);
			}
		}
		Set<String> chaves = palavras.keySet();
		System.out.println(chaves.size());
		System.out.println("Palavra\tQuantidade de Ocorrencias");
		for(String palavra: chaves) {
			System.out.println(palavra + "\t" + palavras.get(palavra));
		}
		
	}
}
