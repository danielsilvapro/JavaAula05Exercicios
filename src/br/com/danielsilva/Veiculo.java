package br.com.danielsilva;

public class Veiculo {
	
	private int portas;
	private String modelo;
	private int ano;
	private String cor;
	private String marca;
	
	public Veiculo (int portas, String modelo, int ano, String cor, String marca){
	super ();
	this.portas = portas;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;
	this.marca = marca;	
	}
		public void andar(){
		System.out.println("correr");
		}
		
		public void frear(){
		System.out.println("frear");
		}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
