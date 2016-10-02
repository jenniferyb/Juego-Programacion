package personajeDelJuego;

public class PersonajeHechizado extends Personaje {
	Personaje personajeHechizado;

	public PersonajeHechizado(Personaje personajeHechizado) {
		// TODO Auto-generated constructor stub
		this.personajeHechizado = personajeHechizado;  
	}
	
	@Override
	protected boolean puedeAtacar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int calcularPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return this.personajeHechizado.obtenerPuntosDeAtaque();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
