package Tema4;
public	class	CRN {
	private	String	commando;
	private	NodoPila arriba;
	private double val;
	/**
	 * Metodo constructor de la clase RPN.
	 * @param commando recoge un String pasado como parametro
	 */
	public CRN(String commando) {
		arriba	=	null;
		this.commando=	commando;
	}
	/**
	 * Este metodo ordena los numeros obtenidos a patir del String para pasarlos a la clase NodoPila y ser calculados
	 * @return dato_arriba
	 */
	public	double	popPila( ) {
		double	dato_arriba	=	arriba.dato;
		arriba	=	arriba.abajo;
		return	dato_arriba;
	}
	/**
	 * metodo que extrae de un string los numeros y el char para efectuar el calculo segun sea el char.
	 * @return val resultado de la operacion
	 */
	public	double	resultado() {		
		for(int	i= 0;i<	commando.length( );	i++) {
			//si	es	un	digito
			if(Character.isDigit(commando.charAt(i))) {				
				// obtener	un string a	partir	del		numero
				String temp	="";
				for(int j= 0; j< 100 && (Character.isDigit(commando.charAt(i)) || commando.charAt(i) =='.');j++,i++) {
					temp = 	temp + commando.charAt(i);
				}
				// 	convertir	a double y	añadir a	la	pila	
			arriba = NodoPila.createNodoPila(Double.parseDouble(temp), arriba);				
			}else if	(commando.charAt(i) ==	'+'	) {				
				arriba = NodoPila.createNodoPila(popPila( )+popPila( ), arriba);
			}else if(commando.charAt(i) =='-') {
				arriba = NodoPila.createNodoPila(popPila( )-popPila( ), arriba);				
			}else if(commando.charAt(i) =='*') {
				arriba = NodoPila.createNodoPila(popPila( )*popPila( ), arriba);
			}else if (commando.charAt(i) =='/') {
				arriba = NodoPila.createNodoPila(popPila( )/popPila( ), arriba);
			}else if(commando.charAt(i) =='^') {			
				arriba = NodoPila.createNodoPila(Math.pow(popPila( ),popPila( )), arriba);
			}else if (commando.charAt(i) =='%') {
				arriba = NodoPila.createNodoPila(popPila( )%popPila( ), arriba);			
			} 
			else if(commando.charAt(i) !=' ') {
				throw	new	IllegalArgumentException( );
			}
		}
		val = popPila( );
		if(arriba!=	null) {	
			throw	new	IllegalArgumentException( );
		}
		return	val;
	}
}
