package br.java.android.lojademotos;

public class Moto {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getClindradas() {
		return clindradas;
	}
	public void setClindradas(int clindradas) {
		this.clindradas = clindradas;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
	public float getCapacidadetanque() {
		return capacidadetanque;
	}
	public void setCapacidadetanque(float capacidadetanque) {
		this.capacidadetanque = capacidadetanque;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	private String modelo;
	private int clindradas;
	private int quilometragem;
	private int anoFabricacao;
	private float autonomia;
	private float capacidadetanque;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
}
