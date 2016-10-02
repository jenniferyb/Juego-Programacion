package personajeDelJuego;

public class ConAnilloDraupnir extends PersonajeEquipado {

	public ConAnilloDraupnir(Personaje personajeDecorado) {
		// TODO Auto-generated constructor stub
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return super.obtenerPuntosDeAtaque() * 2;
	}
}
