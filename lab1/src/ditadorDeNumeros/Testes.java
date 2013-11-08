package ditadorDeNumeros;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class Testes {

	Ditador d;
	
	@Before
	public void init(){
		d = new Ditador();
	}
	
	@Test
	public  void casoMaisSimples(){
		//nome do numero eh apenas uma palavra entre 0 e 19. Sem o 10
		Assert.assertEquals("Palavra errada", "um", d.numeroPorExtenso(1));
		Assert.assertEquals("Palavra errada", "dezessete", d.numeroPorExtenso(17));
		Assert.assertEquals("Palavra errada", "oito", d.numeroPorExtenso(8));
		Assert.assertEquals("Palavra errada", "zero", d.numeroPorExtenso(0));
		
	}

	
}
