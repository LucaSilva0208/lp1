package LocadoraVeiculos_class;

public class Veiculo {
	private String modelo;
	private String marca;
	private String placa;
	private double diaria;
	private boolean disponivel;

	public Veiculo(String modelo, String marca, String placa, double diaria, boolean disponivel) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.diaria = diaria;
		this.disponivel = disponivel;
	}

	public Veiculo(Veiculo veiculo) {
		this.modelo = veiculo.getModelo();
		this.marca = veiculo.getMarca();
		this.placa = veiculo.getPlaca();
		this.diaria = veiculo.getDiaria();
		this.disponivel = veiculo.isDisponivel();
	}

	public String toString() {
		return Descricao();
	}

	public String Descricao() {

		return modelo + " - " + marca + " - " + placa + " - " + " \nR$ " + diaria + " - " + disponivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
