import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TreinoAerobico extends Treino {
	Scanner input = new Scanner(System.in);
	int duracao;
	int numPorSemana;
	ArrayList<Treino> listaTreinos = new ArrayList<Treino>();
	public TreinoAerobico() {}
	public TreinoAerobico(String nome, int duracao, int numPorSemana) {
		super(nome);
		this.duracao = duracao;
		this.numPorSemana = numPorSemana;
	}
	public int getDuracao() {
		return duracao;
	}
	public int getNumPorSemana() {
		return numPorSemana;
	}
	public void setNumPorSemana(int numPorSemana) {
		this.numPorSemana = numPorSemana;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Treino criarTreino() {
		TreinoAerobico treinoAero = new TreinoAerobico();
		boolean cadastroNovo = false;
		while (!cadastroNovo) {
			try {
				System.out.println("Nome da Aula: ");
				treinoAero.setNome(input.nextLine());
				System.out.println("Duracao da Aula: ");
				treinoAero.setDuracao(input.nextInt());
				System.out.println("Aulas por Semana: ");
				treinoAero.setNumPorSemana(input.nextInt());
				cadastroNovo = true;
			} catch (InputMismatchException ime) {
				System.out.println("Digito inválido. Tente novamente. Erro: " + ime);
				input.nextLine();
			}
		}

		System.out.println("Aula criado concluído! Acesse nossa aba de listagem para ve-la.");
		return treinoAero;

	}
	public void removeTreinos(ArrayList<Treino> listaTreinos) {
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
    	        System.out.println("Treino não encontrado. Certifique-se que: \n-Usou digitos apropriados\n-Digitou corretamente o nome\n-Que o treino está cadastrado\n\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
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
	                    treino.setDuracao(input.nextInt());
	                    System.out.println("Novo Numero de Series: ");
	                    treino.setNumPorSemana(input.nextInt());
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

	    if (!treinoEncontrado) {
	        System.out.println("Nome não encontrado. Certifique-se que: \\n-Usou digitos apropriados\\n-Digitou corretamente o nome\\n-Que a pessoa realmente está cadastrada\\n\\nSe estiver em dúvida, consulte o Menu 4 para listagem.");
	    }
    }
	public String toString(){
		String str = super.toString() + "\nDuracao: " + duracao + "m\nAulas por Semana: " + numPorSemana;
		return str;
	}
}
