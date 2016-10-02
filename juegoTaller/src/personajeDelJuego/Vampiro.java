package personajeDelJuego;

public class Vampiro extends Personaje{
	int ataquesRecibidos;
	
	@Override
	protected void despuesDeAtacar() {
		// TODO Auto-generated method stub
		this.salud++;
	}
	
	@Override
	protected int calcularPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return 10 + this.ataquesRecibidos;
	}

	@Override
	protected boolean puedeAtacar() {
		// TODO Auto-generated method stub
		return this.energia >= calcularPuntosDeAtaque();
	}

	@Override
	public void serAtacado(int damage) {
		// TODO Auto-generated method stub
		super.serAtacado(damage);
		this.ataquesRecibidos++;
	}
	
	@Override
	public int obtenerPuntosDeDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
