package robo;

public class RoboComMemoria   extends RoboAbstrato {
	private int x;
	private int y;
	
	

	public RoboComMemoria(String n, int px, int py, short d) {
		super(n, px, py, d);
		this.x=0;
		this.y=0;
	}
	
	
	public void move(int passos) {
		switch (direcaoAtual()) {
		case 0://leste
			moveX(+passos);
			x=x+passos;
			break;
		case 90://norte
			moveY(+passos);	 
			y=y+passos;
			break;
		case 180://Oeste
			moveX(-passos);
			x=x-passos;
			break;
		case 270://sul
			moveY(-passos);
			y=y-passos;
			break;
		}
	}
	
	public void retornaAOrigem(int px, int py) {
		py=(y-py)*-1;
		px=(x-px)*-1;
		System.out.println("Origem do robo: "+"("+ px +","+ py +")");
		
	}
	
	public static void main(String[]args) {
		RoboComMemoria rm1=new RoboComMemoria("Rm1", -1,2,(short)270);
		System.out.println(rm1);
		rm1.move(5);
		System.out.println(rm1);
		rm1.retornaAOrigem(((RoboAbstrato)rm1).posicaoXAtual, ((RoboAbstrato)rm1).posicaoYAtual);
		
		RoboComMemoria rm2=new RoboComMemoria("Rm2", 4,7,(short)0);
		System.out.println("\n"+rm2);
		rm2.move(9);
		System.out.println(rm2);
		rm2.retornaAOrigem(((RoboAbstrato)rm2).posicaoXAtual, ((RoboAbstrato)rm2).posicaoYAtual);
		
	}


	

}
