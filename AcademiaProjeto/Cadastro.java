import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cadastro {
	private String nome;
	private String email;
	private double altura;
	private double peso;
	
	public Cadastro() {}
	public Cadastro(String nome, String email, double altura, double peso) {
		this.nome = nome;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
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
	public double imcCalculo() {
		try {
				double imc = getPeso() / (getAltura() * getAltura());
				imc = imc*100;
				imc = Math.round(imc);
				imc = imc /100;
				return imc;
			}
		catch(ArithmeticException Ar) {
			System.out.println("A altura não pode ser 0. Refaça seu cadastro.");
			System.out.println(Ar.toString());
			return -1;
			}
	}
	public double atribuiTreino() {
		try {
		if(imcCalculo() > 10)
		{
			System.out.println("Houve um erro no input. Refaca seu cadastro.");
			System.out.println(imcCalculo());
			return -1;
		
		}else if(imcCalculo() < 18.5 && imcCalculo() > 10) {
			System.out.println("Seu IMC está abaixo de 18.5, classificando como 'Magreza'."
					+ "			Recomendamos um treino de fortalecimento muscular.");
			return 1;
		}else if(imcCalculo() >= 18.5 && imcCalculo() <= 24.9) {
			System.out.println("Seu IMC está entre de 18.5 e 24.9, classificando como 'Peso Normal'."
					+ "			Recomendamos um treino de geral.");
			return 2;
		}else {
			System.out.println("Seu IMC está acima de 25, classificando como 'Sobrepeso'."
					+ "			Recomendamos um treino de emagrecimento.");
			return 3;
			}
		
		}catch(ArithmeticException Ar) {
			System.out.println(Ar.toString());
			return -1;
		}
		
	}
	
	
	public String toString() {
		return "Cadastro [nome=" + nome + ", email=" + email + ", altura=" + altura + ", peso=" + peso + "]";
	}

}
