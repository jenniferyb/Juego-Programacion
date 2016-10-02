package personajeDelJuego;

public class HechizoDeFuerza extends PersonajeHechizado {

	public HechizoDeFuerza(Personaje personajeHechizado) {
		super(personajeHechizado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int obtenerPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return super.obtenerPuntosDeAtaque() * 2;
	}
}
