package Tema4;
public	class	RPN {
	private	String	commando;
	private	NodoPila arriba;

	public RPN(String commando) {
		arriba	=	null;
		this.commando=	commando;
	}
	public	double	popPila( ) {
		double	dato_arriba	=	arriba.dato;
		arriba	=	arriba.abajo;
		return	dato_arriba;
	}
	public	double	resultado() {
		double	a, b;		
		for(int	i= 0;i<	commando.length( );	i++) {
			//si	es	un	digito
			if(Character.isDigit(commando.charAt(i))) {				
				// obtener	un string a	partir	del		numero
				String temp	="";
				for(int j= 0; j< 100 && (Character.isDigit(commando.charAt(i)) || commando.charAt(i) =='.');j++,i++) {
					temp = 	temp + commando.charAt(i);
				}
				// 	convertir	a double y	añadir a	la	pila	
				arriba = new NodoPila(Double.parseDouble(temp),arriba);				
			}else if	(commando.charAt(i) ==	'+'	) {				
				arriba = new NodoPila(popPila( )+popPila( ),arriba);
			}else if(commando.charAt(i) =='-') {
				arriba = new NodoPila(popPila( )-popPila( ),arriba);				
			}else if(commando.charAt(i) =='*') {
				arriba = new NodoPila(popPila( )*popPila( ),arriba);
			}else if (commando.charAt(i) =='/') {
				arriba = new NodoPila(popPila( )/popPila( ),arriba);
			}else if(commando.charAt(i) =='^') {			
				arriba = new NodoPila(Math.pow(popPila( ),popPila( )),arriba);
			}else if (commando.charAt(i) =='%') {
				arriba = new NodoPila(popPila( )%popPila( ),arriba);			
			} 
			else if(commando.charAt(i) !=' ') {
				throw	new	IllegalArgumentException( );
			}
		}
		double	val	= popPila( );
		if(arriba!=	null) {	
			throw	new	IllegalArgumentException( );
		}
		return	val;
	}
}
