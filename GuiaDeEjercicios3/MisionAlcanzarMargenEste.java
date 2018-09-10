class MisionAlcanzarMargenEste {
 /*
 * Lleva una Nave, anclada en la Base, hasta el casillero
 * localizado más al ESTE, en la misma fila que la Base.
 *
 */
	void ejecutar() {
	 // implementar
		//Inicializar nave
		
		Nave miNave = new Nave();
		miNave.despegar();
		
		//Inicializar radar
		Radar miRadar = miNave.obtenerRadar();
		
		while(miRadar.escanearEste() != Espectro.DESCONOCIDO){
			
			while(miRadar.escanearEste() == Espectro.VACIO){
				miNave.avanzarAlEste();
			}
			
			while(miRadar.escanearEste() == Espectro.ASTEROIDE){
				miNave.atacarAlEste();
			}
		}
		
	 }
}
