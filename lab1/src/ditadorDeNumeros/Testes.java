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
	
	@Test
	public  void casoDezenas(){
		//nome de dezenas 
		Assert.assertEquals("Palavra errada", "dez", d.numeroPorExtenso(10));
		Assert.assertEquals("Palavra errada", "trinta", d.numeroPorExtenso(30));
		Assert.assertEquals("Palavra errada", "noventa", d.numeroPorExtenso(90));
		Assert.assertEquals("Palavra errada", "vinte", d.numeroPorExtenso(20));
	}
	@Test
	public  void casoCentenas(){
		//nome de dezenas 
		Assert.assertEquals("Palavra errada", "cem", d.numeroPorExtenso(100));
		Assert.assertEquals("Palavra errada", "quatrocentos", d.numeroPorExtenso(400));
		Assert.assertEquals("Palavra errada", "novecentos", d.numeroPorExtenso(900));
		Assert.assertEquals("Palavra errada", "duzentos", d.numeroPorExtenso(200));	
	}

	@Test
	public void caso2NumerosMenoresQue100(){
		Assert.assertEquals("Palavra errada", "vinte e um", d.numeroPorExtenso(21));
		Assert.assertEquals("Palavra errada", "quarenta e cinco", d.numeroPorExtenso(45));
		Assert.assertEquals("Palavra errada", "noventa e três", d.numeroPorExtenso(93));
		Assert.assertEquals("Palavra errada", "setenta e seis", d.numeroPorExtenso(76));
	}
	
}
