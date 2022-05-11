package robo;


public class RoboSimples extends RoboAbstrato {
	RoboSimples(String n, int px, int py, short d) {
		super(n, px, py, d);
	}

	public void move(int passos) {
		switch (direcaoAtual()) {
		case 0:
			moveX(+passos);
			break;
		case 90:

			moveY(+passos);	 
			break;
		case 180:
			moveX(-passos);
			break;
		case 270:
			moveY(-passos);
			break;
		}
	}

	@Override
	public void mudaDirecao(short novaDir) {
		if(novaDir<45 || novaDir>315) {
			super.mudaDirecao((short)0);
		}
		if(novaDir>=45 && novaDir<135) {
			super.mudaDirecao((short)90);
		}
		if(novaDir>=135 && novaDir<225) {
			super.mudaDirecao((short)180);
		}
		if(novaDir>=225 && novaDir<=315) {
			super.mudaDirecao((short)270);
		}
	}
	
	public static void main(String[]args) {
		RoboSimples rs1=new RoboSimples("rs1",4,5,(short) 6);
		
		System.out.println(rs1.toString());//inicia
		
		rs1.mudaDirecao((short)30);
		System.out.println(rs1.toString());//teste <45 || >135
		
		rs1.mudaDirecao((short)45);
		System.out.println(rs1.toString());//testa >=45 && <135
		
		rs1.mudaDirecao((short)170);
		System.out.println(rs1.toString());//testa >=135 && <225
		
		rs1.mudaDirecao((short)315);
		System.out.println(rs1.toString());//testa >=225 && <=315
		
	}
	
	
}
