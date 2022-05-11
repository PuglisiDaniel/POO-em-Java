package application;

public class Carro {

	private String marca;
	private String modelo;
	private String placa;
	private int aceleracao;

	
	public Carro(String marca, String modelo, String placa, int aceleracao) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.aceleracao = aceleracao;
	}

	public String acelerar(int x) {
		return "Acelerando o carro " 
		+ marca 
		+ " " 
		+ modelo 
		+" de placa:"
		+placa
		+ " para " 
		+ x 
		+ " km/h";
				
	}

	public String frear() {
		return "O carro "
				+ marca 
				+ " " 
				+ modelo 
				+" de placa:"
				+placa
				+" foi freado";
	}

	public static void main(String[] args) {
		Carro car1 = new Carro("Porsche", "Panamera", "DHJ-0202", 10);
		System.out.println(car1.acelerar(70));
		System.out.println(car1.frear());
		
		Carro car2 =   new Carro("Lamborghini", "Aventador", "KOA-1234", 12);
		System.out.println(car2.acelerar(150));
		
	}

}
