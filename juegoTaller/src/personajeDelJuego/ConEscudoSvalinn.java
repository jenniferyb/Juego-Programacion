package personajeDelJuego;

import personajeDelJuego.Personaje;
import personajeDelJuego.PersonajeEquipado;

public class ConEscudoSvalinn extends PersonajeEquipado {

	public ConEscudoSvalinn(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return super.obtenerPuntosDeDefensa() + 10;
	}
}
