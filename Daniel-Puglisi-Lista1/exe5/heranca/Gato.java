package heranca;

public class Gato extends Mortal{
	protected int vidas=7;
	


	@Override
	public void mata() {
		vidas--;
		if(vidas==0) {
			super.mata();
		}
	}


	public static void main(String[]args) {
		Gato g1=new Gato();
		System.out.println(g1.isVivo());//inicia gato vivo
		g1.mata();
		System.out.println(g1.isVivo());//checa se esta vivo apos primeira "morte"
		g1.mata();
		g1.mata();
		g1.mata();
		g1.mata();
		g1.mata();
		System.out.println(g1.isVivo());//checa se esta vivo apos sexta "morte"
		g1.mata();		
		System.out.println(g1.isVivo());//checa se esta vivo apos setima "morte"
	}
}
