package heranca;

public class Mortal {
	private boolean vivo=true;

	
	
	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	

	public void mata() {
		vivo=false;
	}

	public static void main(String[]args) {
		Mortal obj1=new Mortal();
		Mortal obj2=new Mortal();
		
		System.out.println(obj1.vivo);//checa se obj1 esta vivo
		System.out.println(obj2.vivo);//checa se obj2 esta vivo
		
		obj2.mata();//mata obj2
		
		System.out.println(obj1.vivo);//checa se obj1 esta vivo
		System.out.println(obj2.vivo);//checa se obj2 esta vivo
		
		obj1.mata();//mata obj1
		
		System.out.println(obj1.vivo);//checa se obj1 esta vivo
		System.out.println(obj2.vivo);//checa se obj2 esta vivo
		
	}
	
}
