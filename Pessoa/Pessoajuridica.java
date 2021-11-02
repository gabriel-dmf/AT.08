package Pessoa;

public class Pessoajuridica extends Pessoa {

	private String cnpj;
	private String tipoempresa;
	
	public Pessoajuridica(String nome, String endereco, String cnpj, String tipoempresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoempresa(tipoempresa);
	}
	
	public Pessoajuridica() {
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length() > 0)
			this.cnpj = cnpj;
	}
	public String getTipoempresa() {
		return tipoempresa;
	}
	public void setTipoempresa(String tipoempresa) {
		if(tipoempresa.length() > 0)
			this.tipoempresa = tipoempresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoajuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoempresa=");
		builder.append(tipoempresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}