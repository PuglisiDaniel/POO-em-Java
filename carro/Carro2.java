package geometrico;

public class Carro2 {
	private String marca;
	private String modelo;
	private String placa;
	private int aceleração;
	private Contador vezesAcelerou;
	private Contador vezesFreou;
	private Contador vezesLigou;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAceleração() {
		return aceleração;
	}
	public void setAceleração(int aceleração) {
		this.aceleração = aceleração;
	}
	public Contador getVezesAcelerou() {
		return vezesAcelerou;
	}
	public void setVezesAcelerou(Contador vezesAcelerou) {
		this.vezesAcelerou = vezesAcelerou;
	}
	public Contador getVezesFreou() {
		return vezesFreou;
	}
	public void setVezesFreou(Contador vezesFreou) {
		this.vezesFreou = vezesFreou;
	}
	public Contador getVezesLigou() {
		
		return vezesLigou;
	}
	public void setVezesLigou(Contador vezesLigou) {
		this.vezesLigou = vezesLigou;
	}
	
	public void acelerar() {
		if(getVezesLigou().getCont() > 0) {
			vezesAcelerou.add1();
		}else {
			System.out.println("Carro desligado\nComando invalido");
			//carro nao pode acelerar se nao estiver ligado
		}
	}
	
	public void frear() {
		if(getVezesLigou().getCont() > 0) {
			vezesFreou.add1();
		}else {
			System.out.println("Carro desligado\nComando invalido");
			//carro nao pode frear se nao estiver ligado
		}
	}
	
	public void ligar() {
		vezesLigou.add1();
	}
	
 public static void main(String[] args) {
		Carro2 c1 = new Carro2();
		Contador aceC1= new Contador(0);
		Contador freaC1=new Contador(0);
		Contador ligaC1=new Contador(0);
		
		c1.setAceleração(10);
		c1.setMarca("Porsche");
		c1.setModelo("Panamera");
		c1.setPlaca("DHJ-0202");
		c1.setVezesAcelerou(aceC1);
		c1.setVezesFreou(freaC1);
		c1.setVezesLigou(ligaC1);
		
	
		System.out.println(c1.getVezesAcelerou().getCont());//qts vezes o carro acelerou;
		
		c1.frear();
		c1.acelerar();
		
		c1.ligar();
		c1.acelerar();
		c1.frear();
		c1.acelerar();
		c1.acelerar();
		c1.frear();  
		c1.ligar();
		
		
		System.out.println("O carro "+c1.marca+" "+c1.modelo+" de placa: "+c1.placa
						+"\nacelerou: "+c1.vezesAcelerou.cont+" vez(es)"
						+"\nFreou: "+c1.vezesFreou.cont+" vez(es)"
						+"\nFoi ligado: "+c1.vezesLigou.cont+" vez(es)");
	}
}
