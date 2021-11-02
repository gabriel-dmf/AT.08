package conta;

public class ContaEspecial extends Conta {

	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta,saldo);
	}
	
	public ContaEspecial() {
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean valorlimite(double valor) {
		if(valor > 0) {
			setLimite(getLimite() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saquelimite(double valor) {
		if(valor <= getLimite()) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}