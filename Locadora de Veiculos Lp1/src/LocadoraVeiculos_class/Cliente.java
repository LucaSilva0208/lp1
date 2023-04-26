package LocadoraVeiculos_class;

public class Cliente {
	private String nome;
	private String email;
	private String codigo;
	static int contador = 1;

	public Cliente(String nome, String email) {

		this.nome = nome;
		this.email = email;
		this.codigo = "C" + contador;
		contador++;
	}

	public Cliente(Cliente cliente) {
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.codigo = cliente.getCodigo();
	}

	public String toString() {
		return Descricao();
	}

	public String Descricao() {

		return nome + " – " + email + " - " + " Codigo: " + codigo;
	}

	// getters;
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;

	}

	public String getCodigo() {
		return codigo;
	}

	// setters;
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}