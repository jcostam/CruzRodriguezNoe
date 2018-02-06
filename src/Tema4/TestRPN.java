package Tema4;
import java.util.Scanner;
import junit.framework.TestCase;

public class TestRPN extends TestCase{
	/* 
metodo
main
	 */
	public static void main(String args[]) {
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("Introduce expresion Postfija o teclea\"fin\".");
			String linea= in.nextLine( );
			if(linea.equals("fin")) {
				System.out.println("Fin de programa");
				break;
			} 
			else{
				RPN calc=new RPN(linea);				
				System.out.printf("El resultado es %f\n",calc.resultado( ));
				//RPN calc1 = new RPN (linea);
				//assertEquals(25,000000,calc.resultado( )); 
			
			}				
		} 
	}
}
