package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(String posicion) {
		if (posicion.equalsIgnoreCase("ARRIBA")) {
			this.y++;
		}
		if (posicion.equalsIgnoreCase("ABAJO")) {
			this.y--;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(String posicion) {
		if (posicion.equalsIgnoreCase("DERECHA")) {
			this.x++;
		}
		if (posicion.equalsIgnoreCase("IZQUIERDA")) {
			this.x--;
		}
	}

}
