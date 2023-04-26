package LocadoraVeiculos_class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Locacao {

	private Cliente cliente;
	private Veiculo veiculo;
	private double odometroInicial;
	private double odometroFinal;
	private LocalDateTime datahoraRetirada;
	private LocalDateTime datahoraDevolucao;
	private String identificador;
	static int contador = 1;
	static int ano = 0;

	public Locacao(Cliente cliente, Veiculo veiculo, double odometroInicial, double odometroFinal,
			LocalDateTime datahoraRetirada, LocalDateTime datahoraDevolucao) {
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.odometroFinal = odometroFinal;
		this.odometroInicial = odometroInicial;
		this.datahoraRetirada = datahoraDevolucao;
		this.datahoraDevolucao = datahoraDevolucao;

		if (ano != datahoraRetirada.getYear()) {
			ano = datahoraRetirada.getYear();
			contador = 1;
		}
		this.identificador = ano + "-" + contador;
		contador++;

	}

	public int diariasUtilizadas() {
		return (int) ChronoUnit.DAYS.between(datahoraRetirada, datahoraDevolucao);
	}

	public double kilometragemUtilizados() {
		return odometroFinal - odometroInicial;
	}

	public double totalLocacao() {
		return diariasUtilizadas() * veiculo.getDiaria();

	}

	public Cliente getCliente() {
		return new Cliente(cliente);
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return new Veiculo(veiculo);
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public double getOdometroInicial() {
		return odometroInicial;
	}

	public void setOdometroInicial(double odometroInicial) {
		this.odometroInicial = odometroInicial;
	}

	public double getOdometroFinal() {
		return odometroFinal;
	}

	public void setOdometroFinal(double odometroFinal) {
		this.odometroFinal = odometroFinal;
	}

	public LocalDateTime getDatahoraRetirada() {
		return datahoraRetirada;
	}

	public void setDatahoraRetirada(LocalDateTime datahoraRetirada) {
		this.datahoraRetirada = datahoraRetirada;
	}

	public LocalDateTime getDatahoraDevolucao() {
		return datahoraDevolucao;
	}

	public void setDatahoraDevolucao(LocalDateTime datahoraDevolucao) {
		this.datahoraDevolucao = datahoraDevolucao;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
