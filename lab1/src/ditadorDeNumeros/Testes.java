package ditadorDeNumeros;

import junit.framework.Assert;
import org.junit.Test;

public class Testes {

	@Test
	public  void casoMaisSimples(){
		//nome do numero eh apenas uma palavra entre 0 e 19. Sem o 10
		Assert.assertEquals("Palavra errada", "um", Ditador.numeroPorExtenso(1));
		Assert.assertEquals("Palavra errada", "dezessete", Ditador.numeroPorExtenso(17));
		Assert.assertEquals("Palavra errada", "oito", Ditador.numeroPorExtenso(8));
		Assert.assertEquals("Palavra errada", "zero", Ditador.numeroPorExtenso(0));
		
	}

	
}
