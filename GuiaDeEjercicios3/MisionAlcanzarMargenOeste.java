
class MisionAlcanzarMargenOeste {
	 /*
	 * Lleva una Nave, anclada en la Base, hasta el casillero
	 * localizado más al OESTE, en la misma fila que la Base.
	 *
	 */
	 void ejecutar() {
	 // implementar
		//Inicializar nave
		
		Nave miNave = new Nave();
		miNave.despegar();
		
		
		//Inicializar radar
		Radar miRadar = miNave.obtenerRadar();
		
		while(miRadar.escanearOeste() != Espectro.DESCONOCIDO){
			
			while(miRadar.escanearOeste() == Espectro.VACIO){
				miNave.avanzarAlOeste();
			}
			
			while(miRadar.escanearOeste() == Espectro.ASTEROIDE){
				miNave.atacarAlOeste();
			}
		}
	 }
}
