import java.util.ArrayList;

public abstract class Treino {
    private String nome;
    
    public Treino() {}
    
    public Treino(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Treino criarTreino() {
		return null;
    	}
    public void removerTreino(ArrayList<Treino> listaTreinos) {}
    public void editaTreinos(ArrayList<Treino> listaTreinos) {}
    
	public void setRepeticoes(int repeticoes) {}
	public void setSeries(int series) {}
	public void setDuracao(int duracao) {}
	public void setNumPorSemana(int numPorSemana) {}
	
	public String toString() {
        return "\nNome: " + nome;
    }
}
