package Tema4;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestRPN extends TestCase{
	
	private RPN suma = new RPN("5 5 + 7 +");
	private RPN resta = new RPN("15 3 - 6 -");
	private RPN multi = new RPN("5 5 * 10 *");
	private RPN divi = new RPN("250 10 / 5 /");
	private RPN mod = new RPN("25 2 %");
		
	
	public void test() {
		//validos para cada tipo de funcion
		assertEquals(17.0,suma.resultado( ));
		assertEquals(6.0,resta.resultado( ));
		assertEquals(250.0, multi.resultado( ));
		assertEquals(5.0, divi.resultado( ));
		assertEquals(1.0, mod.resultado( ));
		
		Assert.assertNotSame(17.0, 20);
	}
		
}
