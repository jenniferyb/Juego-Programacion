package personajeDelJuego;

import personajeDelJuego.Personaje;
import personajeDelJuego.PersonajeEquipado;

public class ConAnilloDraupnir extends PersonajeEquipado {

	public ConAnilloDraupnir(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() * 2;
	}
	
}
