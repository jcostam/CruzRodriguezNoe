package Tema4;
import junit.framework.TestCase;
import junit.framework.Assert;
public class TestRPN extends TestCase{
	
	private CRN suma = new CRN("5 5 + 7 +");
	private CRN resta = new CRN("3 15 -");
	private CRN multi = new CRN("5 5 * 10 *");
	private CRN divi = new CRN("10 250 /");
	private CRN mod = new CRN("2 25 %");
	private CRN pow = new CRN("5 5 ^");
 		
	
	public void test() {
		//validos para cada tipo de funcion
		assertEquals(17.0,suma.resultado( ));
		assertEquals(12.0,resta.resultado( ));
		assertEquals(250.0, multi.resultado( ));
		assertEquals(25.0, divi.resultado( ));
		assertEquals(1.0, mod.resultado( ));
		assertEquals(3125.0, pow.resultado( ));
		
		Assert.assertNotSame(suma.resultado( ), 99);
		Assert.assertNotSame(resta.resultado( ), 99);
		Assert.assertNotSame(multi.resultado( ), 99);
		Assert.assertNotSame(divi.resultado( ), 99);
		Assert.assertNotSame(mod.resultado( ), 99);
		Assert.assertNotSame(pow.resultado( ), 99);
	}
		
}
