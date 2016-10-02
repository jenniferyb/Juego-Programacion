package personajeDelJuego;

public class Humano extends Personaje {
	@Override
	protected int calcularPuntosDeAtaque() {
		return 10;
	}

	@Override
	protected boolean puedeAtacar() {
		return this.energia >= 10;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return 0;
	}
}