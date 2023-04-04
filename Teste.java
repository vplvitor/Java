public class Teste {
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria dos Santos");
		p1.setCpf("000.000.000-00");
		p1.setSexo('f');
		
		System.out.println("Pessoa: " + p1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Vitor");
		a1.setCpf("111.111.111-11");
		a1.setSexo('m');
		a1.setCurso("ADS");
		a1.setAnoIngresso(2022);
		
		System.out.println("Aluno: \n" + a1.toString());
		
		p1 = a1;
		
		System.out.println(p1.toString());
		
		Professor pr1 = new Professor();
		pr1.setNome("Jailson");
		pr1.setCpf("777.777.777-77");
		pr1.setSexo('m');
		pr1.setDepartamento("Biologia");
		pr1.setAnoAdmissao(1987);
		System.out.println("Professor: \n" + pr1.toString());
	}
}
