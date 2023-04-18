
public class NaturalPerson extends Person {
	private String ssn;
	
	public NaturalPerson() {}
	public NaturalPerson(String name, String adress, double grossIncome, String ssn) {
		super(name, adress, grossIncome);
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn)
	{
		this.ssn = ssn;
	}
	public double taxationTheft()
	{
		if(this.getGrossIncome() <= 1400){return this.getGrossIncome();}
		else if(this.getGrossIncome() > 1400 && this.getGrossIncome() <= 2100){return this.getGrossIncome() - (this.getGrossIncome() * 0.1);}
		else if(this.getGrossIncome() > 2100 && this.getGrossIncome() <= 2800) {return this.getGrossIncome() * 0.15;}
		else if(this.getGrossIncome() > 2800 && this.getGrossIncome() <= 3600) {return this.getGrossIncome() * 0.25;}
		else if(this.getGrossIncome() > 3600) {return this.getGrossIncome() * 0.30;}
	return 0;
	}
	public String toString()
	{
		return super.toString() + "\nSNN: " + ssn;
	}
}
