import java.util.HashMap;

public class TestaMapa {
	public static void main(String[] args) {
		HashMap<String, Conta> contas = new HashMap<String, Conta>();
		Conta c1 = new Conta(3000);
		Conta c2 = new Conta(1500);
		
		contas.put("Maria das Neves", c1);
		contas.put("Paulo da Silva", c2);
		
		System.out.println(contas.get("Maria das Neves").getSaldo());
	}
}
