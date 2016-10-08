package personajeDelJuego;

public class Engorgio extends Hechizo {

	@Override
	public void afectar(Personaje2 personaje) {
		personaje.altura *= 2;
	}

}
