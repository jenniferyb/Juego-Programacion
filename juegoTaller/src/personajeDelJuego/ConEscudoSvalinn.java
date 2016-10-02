package personajeDelJuego;

public class ConEscudoSvalinn extends PersonajeEquipado {

	public ConEscudoSvalinn(Personaje personajeDecorado) {
		// TODO Auto-generated constructor stub
		super(personajeDecorado);
	}
	
	@Override
	public int obtenerPuntosDeDefensa() {
		// TODO Auto-generated method stub
		return super.obtenerPuntosDeDefensa() + 10;
	}
}
