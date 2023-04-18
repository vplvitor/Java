
public class Person {
	
		private String name;
		private String adress;
		private double grossIncome;
		
		public Person() {}
		public Person(String name, String adress, double grossIncome) {
			this.name = name;
			this.adress = adress;
			this.grossIncome = grossIncome;
		}
		public String getName(){return name;}
		public String getAdress() {return adress;}
		public double getGrossIncome() {return grossIncome;}
		public void setName(String name) {this.name = name;}
		public void setAdress(String adress) {this.adress = adress;}
		public void setGrossIncome(double grossIncome) {this.grossIncome = grossIncome;}
		public double incomeTax(){
			return grossIncome * 0.1;
		}
		public String toString()
		{
			return "Name: " + name + "\nAdress: " + adress + "\nGross Income: "
					+ grossIncome;
		}
}
