package br.com.danielsilva;

public class Carro extends Veiculo { 
	
	private String acelerar;
	
	public Carro (int portas, String modelo, int ano, String cor, String marca){
		super (portas, modelo, ano, cor, marca);
		this.acelerar = acelerar;
	}
	
	public String getAcelerar() {
		return acelerar;
	}

	public void setAcelerar(String acelerar) {
		this.acelerar = acelerar;
	}

	@Override
	public void andar(){
		System.out.println("muito rápido");
	}
}
