
public class Conta {
	double saldo;
	public Conta() {}
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double deposito) {
		setSaldo(saldo + deposito);
	}
	public void sacar(double sacar) {
		setSaldo(saldo - sacar);
	}
}
