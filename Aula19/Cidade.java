import java.util.ArrayList;
public class Cidade {
	private ArrayList<EmissaoCarbono> cidade = new ArrayList<EmissaoCarbono>();
	
	public void add(EmissaoCarbono e) {
		cidade.add(e);
	}
	
	public double calculaEmissaoMensal()
	{
		double emissaoMensal = 0;
		for(int i = 0; i < cidade.size(); i++)
		{
			emissaoMensal = emissaoMensal + cidade.get(i).quantidadeEmitida();
		}
		return emissaoMensal;
	}
}
