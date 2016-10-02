package personajeDelJuego;

import java.util.ArrayList;

public class LibroDeHechizos extends PersonajeHechizado {
	ArrayList<PersonajeHechizado> listaDeHechizos;
	
	public LibroDeHechizos() {
		this.listaDeHechizos = new ArrayList<PersonajeHechizado>();
	}
	
	public void aplicarHechizo(Personaje hechizar, int hechizo) {
		PersonajeHechizado decorador = new listaDeHechizos.indexOf(hechizo);
	}
}
