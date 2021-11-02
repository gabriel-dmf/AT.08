package conta;

public class Contasimples extends Conta {
	
	private double saldopoupanca;
	
	public Contasimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta,saldo);
	}
	
	public Contasimples() {
		
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}
	
	public boolean depositopoupanca(double valor) {
		if(valor > 0) {
			setSaldopoupanca(getSaldopoupanca()+valor);
			return true;
		}
		return false;
	}
	
	public boolean saquepoupanca(double valor) {
		if(valor <= getSaldopoupanca()) {
			setSaldopoupanca(getSaldopoupanca()-valor);
			return true;
		}
		return false;
	}
	
	public double total() {
		return getSaldo() + getSaldopoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contasimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", total()=");
		builder.append(total());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}