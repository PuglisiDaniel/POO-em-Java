package robo;

public class RoboABateria extends RoboAbstrato {
	private long energia;

	RoboABateria(String n, int px, int py, short d, long e) {
		super(n, px, py, d);
		energia = e;
	}

	public void move(int passos) {
		long energiaASerGasta = passos * 10;
		if (energiaASerGasta <= energia) {
			switch (direcaoAtual()) {
			case 0:
				moveX(+passos);
				break;
			case 45:
				moveX(+passos);
				moveY(+passos);
				break;
			case 90:
				moveY(+passos);
				break;
			case 135:
				moveY(+passos);
				moveX(-passos);
				break;
			case 180:
				moveX(-passos);
				break;
			case 225:
				moveX(-passos);
				moveY(-passos);
				break;
			case 270:
				moveY(-passos);
				break;
			case 315:
				moveY(-passos);
				moveX(+passos);
				break;
			}
			energia -= energiaASerGasta;
		}
	}

	public String toString() {
		String resultado = super.toString() + "\n";
		resultado = resultado + "Energia do robô:" + energia;
		return resultado;
	}
	
	public void recarrega(long x) {
		energia=energia+x;
	}
	
	
	public static void main(String []args) {
		RoboABateria r1=new RoboABateria("r1", 3,5,(short) 6,2);
		System.out.println(r1.toString());
		r1.recarrega(4);
		System.out.println(r1.toString());
		
	}
}