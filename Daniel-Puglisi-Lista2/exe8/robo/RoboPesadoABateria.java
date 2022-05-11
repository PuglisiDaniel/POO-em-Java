package robo;

public class RoboPesadoABateria extends RoboABateria {
	private long kg;

	public RoboPesadoABateria(String n, int px, int py, short d, long e, long kg) {
		super(n, px, py, d, e);
		this.kg = kg;
	}

	@Override
	public void move(int passos) {
		double energiaASerGasta = passos * kg;

		if (energiaASerGasta <= energia) {
			switch (direcaoAtual()) {
			case 0:
				moveX(+passos);
				break;
			case 45:
				energiaASerGasta = passos * kg * (double) 1.4;
				moveX(+passos);
				moveY(+passos);
				break;
			case 90:
				moveY(+passos);
				break;
			case 135:
				energiaASerGasta = passos * kg * (double) 1.4;
				moveY(+passos);
				moveX(-passos);
				break;
			case 180:
				moveX(-passos);
				break;
			case 225:
				energiaASerGasta = passos * kg * (double) 1.4;
				moveX(-passos);
				moveY(-passos);
				break;
			case 270:
				moveY(-passos);
				break;
			case 315:
				energiaASerGasta = passos * kg * (double) 1.4;
				moveY(-passos);
				moveX(+passos);
				break;
			}
			energia -= energiaASerGasta;
		}
	}

	public static void main(String[] args) {
		RoboPesadoABateria rpb1 = new RoboPesadoABateria("RPB1", 3, 6, (short) 90, 120, 20);
		System.out.println(rpb1);
		rpb1.move(5);
		System.out.println("\n" + rpb1 + "\n");// gasto de energia em robo vertical/horizontal

		RoboPesadoABateria rpb2 = new RoboPesadoABateria("RPB2", 3, 6, (short) 135, 120, 20);
		System.out.println(rpb2);
		rpb2.move(5);
		System.out.println("\n" + rpb2);// gasto de energia em robo diagonal

	}

}
