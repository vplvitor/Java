import java.util.ArrayList;

public class Treino {
    private ArrayList<Exercicio> treino = new ArrayList<Exercicio>();
    
    public Treino() {}
    public Treino(ArrayList<Exercicio> treino, int duracao) 
    {
        this.treino = treino;
    }
    

	public ArrayList<Exercicio> getTreino() 
	{
		return treino;
	}
	public void setTreino(ArrayList<Exercicio> treino) 
	{
		this.treino = treino;
	}
	public void adicionaExercicio(Exercicio exercicio) {
		treino.add(exercicio);
	}
	

	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Treino:\n");
	        for (Exercicio exercicio : treino) {
	            sb.append(exercicio.toString()).append("\n");
	        }
	        return sb.toString();
	    }
}