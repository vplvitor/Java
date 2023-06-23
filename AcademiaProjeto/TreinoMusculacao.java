import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TreinoMusculacao extends Treino {
	Scanner input = new Scanner(System.in);
	int repeticoes;
	int series;
	ArrayList<Treino> listaTreinos = new ArrayList<Treino>();
	public TreinoMusculacao() {
	}

	public TreinoMusculacao(String nome, int repeticoes, int series) {
		super(nome);
		this.repeticoes = repeticoes;
		this.series = series;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public Treino criarTreino() {
		TreinoMusculacao treinoMusc = new TreinoMusculacao();
		boolean cadastroNovo = false;
		while (!cadastroNovo) {
			try {
				System.out.println("Nome do Exercicio: ");
				treinoMusc.setNome(input.nextLine());
				System.out.println("Numero de Repeticoes: ");
				treinoMusc.setRepeticoes(input.nextInt());
				System.out.println("Numero de Series: ");
				treinoMusc.setSeries(input.nextInt());
				cadastroNovo = true;
			} catch (InputMismatchException ime) {
				System.out.println("Digito inválido. Tente novamente. Erro: " + ime);
				input.nextLine();
			}
		}

		System.out.println("Exercicio criado! Acesse nossa aba de listagem para ve-lo.");
		return treinoMusc;

	}
    public void removeTreinos(ArrayList<Treino> listaTreinos) {
    	{
    	    
    	    String treinoNome = input.nextLine();
    	    System.out.println("Buscando " + treinoNome + " na lista...");
    	    boolean treinoEncontrado = false;
    	    for (int i = 0; i < listaTreinos.size(); i++)
    	    {
    	        Treino treino = listaTreinos.get(i);
    	        if (treino.getNome().equalsIgnoreCase(treinoNome))
    	        {
    	        	treinoEncontrado = true;
    	            listaTreinos.remove(i);
    	            System.out.println("Treino removido! Para verificar os treinos restantes, veja nossa aba de listagem.");
    	            break;
    	        }
    	    }

    	    if (!treinoEncontrado)
    	    {
    	        System.out.println("Treino não encontrado. Certifique-se que: \n-Usou digitos apropriados\n-Digitou corretamente o nome\n-Que o treino realmente está cadastrado\n\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
    	    }
    	}
    }
    public void editaTreino(ArrayList<Treino> listaTreinos) {
	    System.out.println("Digite o nome do cadastrado que deseja alterar: ");
	    String treinoNome = input.nextLine();
	    System.out.println("Buscando " + treinoNome + " na lista...");
	    boolean treinoEncontrado = false;
	    for (int i = 0; i < listaTreinos.size(); i++) {
	        Treino treino = listaTreinos.get(i);
	        if (treino.getNome().equalsIgnoreCase(treinoNome)) {
	        	treinoEncontrado = true;
	            System.out.println(treinoNome + " encontrado! Digite os novos dados do cadastro.");
	            boolean cadastroNovo = false;
	            while (!cadastroNovo) {
	                try {
	                    System.out.println("Novo Nome: ");
	                    treino.setNome(input.nextLine());
	                    System.out.println("Novo Numero de Repeticoes: ");
	                    treino.setRepeticoes(input.nextInt());
	                    System.out.println("Novo Numero de Series: ");
	                    treino.setSeries(input.nextInt());
	                    cadastroNovo = true;
	                } catch (InputMismatchException ime) {
	                    System.out.println("Digito inválido, comece novamente.");
	                    System.out.println("Erro " + ime.getMessage());
	                    input.nextLine();
	                }
	            }

	            System.out.println("Treino alterado! Para ver o treino novo, veja nossa aba de listagem.");
	            break;
	        }
	    }

	    if (!treinoEncontrado) {
	        System.out.println("Nome não encontrado. Certifique-se que: \\n-Usou digitos apropriados\\n-Digitou corretamente o nome\\n-Que o treino realmente está cadastrado\\n\\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
	    }
    }

	public String toString() {
		String str = super.toString() + "\nRepeticoes: " + repeticoes + "\nSeries: " + series;
		return str;
	}
}
