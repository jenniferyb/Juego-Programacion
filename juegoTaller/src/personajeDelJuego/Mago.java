package personajeDelJuego;

import java.util.HashMap;
import java.util.Map;

public class Mago extends Personaje2 {

	private Map<String, Hechizo> hechizos = new HashMap<String, Hechizo>();
	
	public void agregarHechizo(String conjuro, Hechizo hechizo) {
		this.hechizos.put(conjuro, hechizo);
	}
	
	public int getCantidadDeHechizos() {
		return this.hechizos.size();
	}

	public void hechizar(String conjuro, Personaje2 personaje) {
		this.hechizos.get(conjuro).afectar(personaje);
		
	}
}
