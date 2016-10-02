package test;

import org.junit.Assert;
import org.junit.Test;

import personajeDelJuego.ConEspadaSkofnung;
import personajeDelJuego.HechizoDeFuerza;
import personajeDelJuego.Humano;
import personajeDelJuego.Personaje;

public class HechizosTests {

	@Test
	public void quePuedoAgregarItemDeAtaque() {

		Personaje objTest = new Humano();
		Assert.assertEquals(10, objTest.obtenerPuntosDeAtaque());
		
		// agrego item de ataque
		objTest = new ConEspadaSkofnung(objTest);
		Assert.assertEquals(5 + 10, objTest.obtenerPuntosDeAtaque());
		
		// agrego hechizo
		objTest = new HechizoDeFuerza(objTest);		
		Assert.assertEquals(30, objTest.obtenerPuntosDeAtaque());
	}
}
