package oo.heranca;

public class Jogador {

	int lifeBar = 100;
	int danoBase = 10;
	int x;
	int y;

	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.lifeBar -= danoBase;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.lifeBar -= danoBase;
			return true;
		} else {
			return false;
		}
	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;
	}
}
