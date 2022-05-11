package heranca;

public class Ramo extends Mortal {
	private Ramo galhoD;
	private Ramo galhoE;


	
	public Ramo() {
		super();
		this.galhoD = null;
		this.galhoE = null;
	}

	
	
	public Ramo(Ramo galhoD) {
		super();
		this.galhoD = galhoD;
		this.galhoE = null;
	}


	

	public Ramo(Ramo galhoE, Ramo galhoD) {
		super();
		this.galhoE = galhoE;
		this.galhoD = galhoD;
	}


	@Override
	public void mata() {
		if(this.galhoD!=null) {
			this.galhoE.mata();
		}
		
		if(this.galhoE!=null) {
			this.galhoE.mata();
		}
		
		this.setVivo(false);
	}


	public static void main(String[]args) {
		Ramo r1=new Ramo();
		Ramo r2=new Ramo();
		Ramo r3 = new Ramo(r1,r2);
		
		
		System.out.println(r1.isVivo());//checa se r1 ta vivo
		System.out.println(r2.isVivo());//checa se r2 ta vivo
		
		System.out.println(r3.galhoD.isVivo());//checa se r3 direito ta vivo
		r2.mata();
		System.out.println(r3.galhoD.isVivo());//checa se r3 direito ta vivo
		r3.mata();
		System.out.println(r3.galhoE.isVivo());//checa se r3 esquerdo tbm morreu ao eliminar r3 por completo
	}
	
}
