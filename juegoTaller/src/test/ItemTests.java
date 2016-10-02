package test;

import org.junit.Assert;
import org.junit.Test;

import personajeDelJuego.ConAnilloDraupnir;
import personajeDelJuego.ConEscudoSvalinn;
import personajeDelJuego.ConEspadaSkofnung;
import personajeDelJuego.Humano;
import personajeDelJuego.Personaje;

public class ItemTests {
	/*
	 * Especificación de Items
	 * ~~~~~~~~~~~~~~~~~~~~~~~
	 * ConEspadaSkofnung: Esta espada aumenta en 5 pts el ataque
	 * ConEscudoSvalinn: Este escudo otorga 10 pts de defensa
	 * ConAnilloDraupnir: Este anillo multiplica el ataque x2
	 */
	
	@Test
	public void quePuedoAgregarItemDeAtaque() {

		Personaje objTest = new Humano();
		Assert.assertEquals(10, objTest.obtenerPuntosDeAtaque());
		
		// agrego item de ataque
		objTest = new ConEspadaSkofnung(objTest);
		Assert.assertEquals(5 + 10, objTest.obtenerPuntosDeAtaque());
	}
	
	@Test
	public void quePuedoAgregarAmbosItems() {

		Personaje objTest = new Humano();
		Assert.assertEquals(10, objTest.obtenerPuntosDeAtaque());
		Assert.assertEquals(0, objTest.obtenerPuntosDeDefensa());
		
		// agrego item de ataque
		objTest = new ConEspadaSkofnung(objTest);
		Assert.assertEquals(5 + 10, objTest.obtenerPuntosDeAtaque());
		
		// agrego defensa
		objTest = new ConEscudoSvalinn(objTest);
		Assert.assertEquals(10 + 0, objTest.obtenerPuntosDeDefensa());
		
		// y no pierdo ataque
		Assert.assertEquals(5 + 10, objTest.obtenerPuntosDeAtaque());
	}

	@Test
	public void quePuedoAgregarDosTiposDeItem() {
		Personaje objTest = new Humano();
		Assert.assertEquals(10, objTest.obtenerPuntosDeAtaque());

		// agrego item de ataque
		objTest = new ConEspadaSkofnung(objTest);
		Assert.assertEquals(5 + 10, objTest.obtenerPuntosDeAtaque());

		// agrego anillo multiplicador (x2)
		objTest = new ConAnilloDraupnir(objTest);
		Assert.assertEquals((5 + 10) * 2, objTest.obtenerPuntosDeAtaque());
	}
}
