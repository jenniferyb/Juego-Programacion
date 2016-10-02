package personajeDelJuego;

public class Orco extends Personaje {
	int cantidadDeAtaques;
	
	@Override
	protected void despuesDeAtacar() {
		this.cantidadDeAtaques++;
	}
	
	@Override
	protected int calcularPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return 10 + this.cantidadDeAtaques;
	}

	@Override
	protected boolean puedeAtacar() {
		// TODO Auto-generated method stub
		return this.energia >= calcularPuntosDeAtaque();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
