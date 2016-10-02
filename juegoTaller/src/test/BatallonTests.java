package test;

import org.junit.Assert;
import org.junit.Test;

import personajeDelJuego.BatallonDeHumanos;
import personajeDelJuego.BatallonDeOrcos;
import personajeDelJuego.Humano;
import personajeDelJuego.Orco;

public class BatallonTests {
	@Test
	public void queOrcosSeTurnanParaRecibirPaliza() {
		
		// Se genera un batallon de humanos vacio
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		
		// Se agrega un humano al batallon de humanos
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		
		// Se genera un batallon de orcos vacio
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		
		// Se agrega un orco al batallon de orcos
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		
		// Se agrega otro orco al batallon de orcos
		Orco segundoOrco = new Orco();
		orcos.agregar(segundoOrco);
		
		// Se chequea el estado de salud del batallon de orcos
		Assert.assertEquals(100, primerOrco.getSalud());
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		// Batallon de humanos ataca al batallon de orcos
		humanos.atacar(orcos);
		
		// El primer orco del batallon es atacado
		Assert.assertEquals(90, primerOrco.getSalud());
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		// Batallon de humanos ataca al batallon de orcos
		humanos.atacar(orcos);
		
		// Los orcos son atacados uno a uno por turnos
		Assert.assertEquals(90, primerOrco.getSalud());
		Assert.assertEquals(90, segundoOrco.getSalud());
	}
	
	@Test
	public void queHumanosRecibenPalizaDeAUno() {
		
		// Se genera un batallon de orcos vacio
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		
		// Se agrega un orco al batallon
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		
		// Se genera un batallon de humanos vacio
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		
		// Se agrega un humano
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		
		// Se agrega otro humano
		Humano segundoHumano = new Humano();
		humanos.agregar(segundoHumano);
		
		// Se verifica el estado de salud de los humanos
		Assert.assertEquals(100, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		// Batallon de orcos ataca al batallon de humanos
		orcos.atacar(humanos);
		
		// El primer humano es atacado
		Assert.assertEquals(90, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		// Batallon de orcos ataca al batallon de humanos
		orcos.atacar(humanos);
		
		// El mismo humano es atacado nuevamente
		Assert.assertEquals(79, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
	}
}
