package personajeDelJuego;

public class ConEspadaSkofnung extends PersonajeEquipado {

	public ConEspadaSkofnung(Personaje personajeDecorado) {
		// TODO Auto-generated constructor stub
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return super.obtenerPuntosDeAtaque() + 5;
	}
}