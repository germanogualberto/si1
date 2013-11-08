package Ditador;

import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void casoMaisSimples(){
		//nome do numero eh apenas uma palavra
		Assert.assertEquals("Palavra errada", "dez", numeroPorExtenso(10));
		Assert.assertEquals("Palavra errada", "cem", numeroPorExtenso(100));
		Assert.assertEquals("Palavra errada", "mil", numeroPorExtenso(1000));
		Assert.assertEquals("Palavra errada", "noventa", numeroPorExtenso(90));
		
	}

	
}
