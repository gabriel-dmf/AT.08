package Pessoa;

public class Pessoafisica extends Pessoa {

	private String cpf;
	private String estadocivil;
	
	public Pessoafisica(String nome, String endereco, String cpf, String estadocivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadocivil(estadocivil);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() > 0)
			this.cpf = cpf;
	}
	
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		if(estadocivil.length() > 0)
			this.estadocivil = estadocivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoafisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}