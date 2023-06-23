import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
	private String nome;
	private String email;
	private double altura;
	private double peso;
	private int idade;
	private ArrayList<TreinoMusculacao> treinoMusc = new ArrayList<TreinoMusculacao>();
	private ArrayList<TreinoAerobico> treinoAero = new ArrayList<TreinoAerobico>();
	
	
	
	
	
	public ArrayList<TreinoMusculacao> getTreinoMusc() {
		return treinoMusc;
	}
	public void setTreinoMusc(ArrayList<TreinoMusculacao> treinoMusc) {
		this.treinoMusc = treinoMusc;
	}
	public ArrayList<TreinoAerobico> getTreinoAero() {
		return treinoAero;
	}
	public void setTreinoAero(ArrayList<TreinoAerobico> treinoAero) {
		this.treinoAero = treinoAero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cadastro() {}
	public Cadastro(String nome, String email, double altura, double peso, ArrayList<TreinoMusculacao> treinoMusc, ArrayList<TreinoAerobico> treinoAero) {
		this.nome = nome;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
		this.treinoMusc = treinoMusc;
		this.treinoAero = treinoAero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Cadastro criarCadastro() {
		
		Cadastro cadastro = new Cadastro();
	    Scanner input = new Scanner(System.in);

	    boolean cadastroNovo = false;
	    while (!cadastroNovo) {
	        try {
	            System.out.println("Nome: ");
	            cadastro.setNome(input.nextLine());
	            System.out.println("Email: ");
	            cadastro.setEmail(input.nextLine());
	            System.out.println("Altura: (em Metros)");
	            cadastro.setAltura(input.nextDouble());
	            System.out.println("Peso: (Em Kilogramas)");
	            cadastro.setPeso(input.nextDouble());
	            System.out.println("Idade: ");
	            cadastro.setIdade(input.nextInt());
	            
	            cadastroNovo = true;
	        } catch (InputMismatchException ime) {
	            System.out.println("Digito inválido. Tente novamente. Erro: " + ime);
	            input.nextLine();
	        }
	    }
	    
	    System.out.println("Cadastro concluído! Acesse nossa aba de listagem para ve-lo.");
		return cadastro;
	}
	public void editaCadastro(ArrayList<Cadastro> listaCadastro) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Digite o nome do cadastrado que deseja alterar: ");
	    String buscaNome = input.nextLine();
	    System.out.println("Buscando " + buscaNome + " na lista...");
	    boolean cadastroEncontrado = false;
	    for (int i = 0; i < listaCadastro.size(); i++) {
	        Cadastro cadastro = listaCadastro.get(i);
	        if (cadastro.getNome().equalsIgnoreCase(buscaNome)) {
	            cadastroEncontrado = true;
	            System.out.println(buscaNome + " encontrado! Digite os novos dados do cadastro.");
	            boolean cadastroNovo = false;
	            while (!cadastroNovo) {
	                try {
	                    System.out.println("Novo Nome: ");
	                    cadastro.setNome(input.nextLine());
	                    System.out.println("Novo Email: ");
	                    cadastro.setEmail(input.nextLine());
	                    System.out.println("Nova Altura: (em Metros)");
	                    cadastro.setAltura(input.nextDouble());
	                    System.out.println("Novo Peso: (Em Kilogramas)");
	                    cadastro.setPeso(input.nextDouble());
	                    System.out.println("Nova Idade: ");
	                    cadastro.setIdade(input.nextInt());

	                    cadastroNovo = true;
	                } catch (InputMismatchException ime) {
	                    System.out.println("Digito inválido, comece novamente.");
	                    System.out.println("Erro " + ime.getMessage());
	                    input.nextLine();
	                }
	            }

	            System.out.println("Cadastro alterado! Para ver o cadastro, veja nossa aba de listagem.");
	            break;
	        }
	    }

	    if (!cadastroEncontrado) {
	        System.out.println("Nome não encontrado. Certifique-se que: \\n-Usou digitos apropriados\\n-Digitou corretamente o nome\\n-Que a pessoa realmente está cadastrada\\n\\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
	    }
	}
	public void deletaCadastro(ArrayList<Cadastro> listaCadastro)
	{
	    Scanner input = new Scanner(System.in);
	    String buscaNome = input.nextLine();
	    System.out.println("Buscando " + buscaNome + " na lista...");
	    boolean cadastroEncontrado = false;
	    for (int i = 0; i < listaCadastro.size(); i++)
	    {
	        Cadastro cadastro = listaCadastro.get(i);
	        if (cadastro.getNome().equalsIgnoreCase(buscaNome))
	        {
	            cadastroEncontrado = true;
	            listaCadastro.remove(i);
	            System.out.println("Cadastro removido! Para verificar os cadastros restantes, veja nossa aba de listagem.");
	            break;
	        }
	    }

	    if (!cadastroEncontrado)
	    {
	        System.out.println("Nome não encontrado. Certifique-se que: \n-Usou digitos apropriados\n-Digitou corretamente o nome\n-Que a pessoa realmente está cadastrada\n\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
	    }
	}


	public String toString() {
		return "Membro\nNome: " + nome + "\nEmail: " + email + "\nAltura: " + altura + "M\nPeso= " + peso + "Kg\n";
	}
	public void montaTreinoMusculacao() {}
}
