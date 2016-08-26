package br.com.danielsilva;

public class Moto extends Veiculo {

	private String frear;
	
	public Moto (int portas, String modelo, int ano, String cor, String marca){
		super (portas, modelo, ano, cor, marca);
		this.frear = frear;
	}

	@Override
	public void andar(){
		System.out.println("muito rápido");
	}	
	
	public String getFrear() {
		return frear;
	}

	public void setFrear(String frear) {
		this.frear = frear;
	}	
	
}
