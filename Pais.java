import java.util.ArrayList;

public class Pais {
	private String codigo;
	private String nome;
	private int pop;
	private double dim;
	private ArrayList<Pais> fronteiras;
	
	public Pais() {}
	
	public Pais(String codigo, String nome, int pop, double dim, ArrayList<Pais> fronteiras)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.pop = pop;
		this.dim = dim;
		this.fronteiras = fronteiras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public double getDim() {
		return dim;
	}

	public void setDim(double dim) {
		this.dim = dim;
	}

	public ArrayList<Pais> getFronteiras() {
		return fronteiras;
	}

	public void setFronteiras(ArrayList<Pais> fronteiras) {
		this.fronteiras = fronteiras;
	}
	public boolean verificaIgualdade(Pais pais)
	{
		return this.codigo.equals(pais.getCodigo());		
	}
	public boolean fazFronteiras(Pais pais)
	{
		return fronteiras.contains(pais);
	}
	public String verificaFronteirasComuns(Pais pais)
	{
		String str = "";
		for(int i = 0; i < fronteiras.size(); i++)
		{
			if(pais.fronteiras.contains(fronteiras.get(i)))
			{
				str += pais.getNome() + " ";
			}
		}
	}
	
}