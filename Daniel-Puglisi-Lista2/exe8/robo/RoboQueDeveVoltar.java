package robo;

public class RoboQueDeveVoltar extends RoboABateria {
	private int vh;// vertical/horizontal
	private int d;// diagonal

	public RoboQueDeveVoltar(String n, int px, int py, short d, long e) {
		super(n, px, py, d, e);
		vh = 0;
		d = 0;
	}

	public void move(int passos) {
		long energiaASerGasta;
		if (direcaoAtual() == 45 || direcaoAtual() == 135 || direcaoAtual() == 225 || direcaoAtual() == 315) {
			long aux = passos + d;
			energiaASerGasta = aux * 14;
		}

		else {
			long aux = passos + vh;
			energiaASerGasta = aux * 10;
		}

		if ((energiaASerGasta * 2) <= energia) {
			switch (direcaoAtual()) {
			case 0:
				energiaASerGasta = passos * 10;
				moveX(+passos);
				vh++;
				break;
			case 45:
				energiaASerGasta = passos * 14;
				moveX(+passos);
				moveY(+passos);
				d++;
				break;
			case 90:
				energiaASerGasta = passos * 10;
				moveY(+passos);
				vh++;
				break;
			case 135:
				energiaASerGasta = passos * 14;
				moveY(+passos);
				moveX(-passos);
				d++;
				break;
			case 180:
				energiaASerGasta = passos * 10;
				moveX(-passos);
				vh++;
				break;
			case 225:
				energiaASerGasta = passos * 14;
				moveX(-passos);
				moveY(-passos);
				d++;
				break;
			case 270:
				energiaASerGasta = passos * 10;
				moveY(-passos);
				vh++;
				break;
			case 315:
				energiaASerGasta = passos * 14;
				moveY(-passos);
				moveX(+passos);
				d++;
				break;
			}
			energia -= energiaASerGasta;
		} else {
			System.err.println("\nMovimento Invalido\nEnergia insuficiente para retornar a origem");
		}
	}

	public static void main(String[] args) {
		RoboQueDeveVoltar rqdv1 = new RoboQueDeveVoltar("RQDV1", 0, 0, (short) 135, 50);
		System.out.println(rqdv1);
		// movendo na diagonal
		rqdv1.move(1);
		System.out.println("\n" + rqdv1);
		rqdv1.move(1);// movimento invalido
		System.out.println("\n" + rqdv1);// mantem-se na mesma posicao
		rqdv1.move(1);// movimento invalido
		System.out.println("\n" + rqdv1);// mantem-se na mesma posicao

		RoboQueDeveVoltar rqdv2 = new RoboQueDeveVoltar("RQDV2", 0, 0, (short) 270, 50);
		System.out.println("\n||Robo 2||");
		System.out.println("\n\n" + rqdv2);
		// movendo na vertical/horizontal
		rqdv2.move(1);
		System.out.println("\n" + rqdv2);
		rqdv2.move(2);// movimento invalido
		System.out.println("\n" + rqdv2);// mantem-se na mesma posicao
		rqdv2.move(1);
		System.out.println("\n" + rqdv2);

	}

}
