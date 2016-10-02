package personajeDelJuego;

public abstract class Personaje implements Atacable{
	// La clase personaje impplemeta la interfaaz Atacable
		// por lo tanto un personaje es un atacable
	
	protected int energia = 100;
	protected int salud = 100;
	
	public final void atacar(Atacable atacado) {
		if (this.puedeAtacar()) {
			atacado.serAtacado(this.calcularPuntosDeAtaque());
			energia -= this.calcularPuntosDeAtaque();
			this.despuesDeAtacar();
		}
	}

	protected void despuesDeAtacar() { }
	
	protected abstract boolean puedeAtacar();
	protected abstract int calcularPuntosDeAtaque();
	
	public boolean estaVivo() {
		return this.salud > 0;
	}
	
	public void serAtacado(int damage) {
		this.salud -= damage;
	}

	public void serCurado() {
		this.salud = 100;
	}

	public void serEnergizado() {
		this.energia = 100;
	}
	
	public int getSalud() {
		return this.salud;
	}

	public int obtenerPuntosDeAtaque() {
		return this.calcularPuntosDeAtaque();
	}

	public abstract int obtenerPuntosDeDefensa();
}