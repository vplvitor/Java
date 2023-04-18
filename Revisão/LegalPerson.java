
public class LegalPerson extends Person {
	private String ein;
	
	public LegalPerson() {}
	public LegalPerson(String name, String adress, double grossIncome, String ein)
	{
		super(name, adress, grossIncome);
		this.ein = ein;
	}

	
}
