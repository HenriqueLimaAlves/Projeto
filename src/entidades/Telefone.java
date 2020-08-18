package entidades;

public abstract class Telefone {
	private String ligarTelefone;
	private String discar;
	private String checarAgenda;
	
	public Telefone() {
		
	}
	
	public Telefone(String ligarTelefone, String discar, String checarAgenda)
	{
		this.ligarTelefone = ligarTelefone;
		this.discar = discar;
		this.checarAgenda = checarAgenda;
	}
	//metodos abstratos
	public abstract String ligarTelefone(String ligarTelefone);
	public abstract String discar(String discar);
	public abstract String checarAgenda(String checarAgenda);
	
	public String getDiscar() {
		return discar;
	}

	public void setDiscar(String discar) {
		this.discar = discar;
	}

	public String getChecarAgenda() {
		return checarAgenda;
	}

	public void setChecarAgenda(String checarAgenda) {
		this.checarAgenda = checarAgenda;
	}

	public String getLigarTelefone() {
		return ligarTelefone;
	}
}
