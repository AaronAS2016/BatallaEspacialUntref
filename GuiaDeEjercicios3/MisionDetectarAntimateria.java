
class MisionDetectarAntimateria {
	/*
	 * Lleva una Nave, anclada en la Base, hasta el Contenedor
	 * más cercano, si la cantidad de ANTIMATERIA que tiene es menor
	 * a 100 regresa a la Base.
	 */
	
	String encontroContenedor(Radar radar){
		String hayContenedor = "NO_ENCONTRO";
		
		if(radar.escanearNorte() == Espectro.CONTENEDOR){
			hayContenedor = "ENCONTRO_NORTE";
		}
		if(radar.escanearSur() == Espectro.CONTENEDOR){
			hayContenedor = "ENCONTRO_SUR";
		}
		if(radar.escanearEste() == Espectro.CONTENEDOR){
			hayContenedor = "ENCONTRO_ESTE";
		}
		if(radar.escanearOeste() == Espectro.CONTENEDOR){
			hayContenedor = "ENCONTRO_OESTE";
		}
		
		System.out.println(hayContenedor);
		return hayContenedor;
	}
	
	 void ejecutar() {
	 // implementar
		 
		//Inicializar nave
		 Nave miNave = new Nave();
		 miNave.despegar();
		 miNave.avanzarAlNorte();
		 
		 
		 Radar miRadar = miNave.obtenerRadar();
		 
		 //Movemos nave hacia el contenedor mas cercano

		 	int movimientoSimple= 0,
 				movimientoComplejo = 1;
		 	boolean noEncontro =  (encontroContenedor(miRadar) != "ENCONTRO_NORTE") || 
		 						  (encontroContenedor(miRadar) != "ENCONTRO_SUR" ) ||
		 						  (encontroContenedor(miRadar) != "ENCONTRO_OESTE") ||
		 						  (encontroContenedor(miRadar) != "ENCONTRO_ESTE");
			 while(noEncontro){
				 
				 movimientoSimple++;
				 movimientoComplejo++;
				 
				 
				 for(int j = 0; j < movimientoSimple; j++){
					 miNave.avanzarAlEste(); 
					 if(encontroContenedor(miRadar) != "NO_ENCONTRO" ){
						 //Recolectar sustancai
						 System.out.println(encontroContenedor(miRadar));
						 noEncontro = false;
						 movimientoSimple = 0;
						 movimientoComplejo = 0;
						 
					 } 
				 }
				 
				 for(int j = 0; j < movimientoComplejo; j++){
					 miNave.avanzarAlSur(); 
					 if(encontroContenedor(miRadar) != "NO_ENCONTRO" ){
						 //Recolectar sustancai
						 System.out.println(encontroContenedor(miRadar));
						 noEncontro = false;
						 movimientoSimple = 0;
						 movimientoComplejo = 0;
					 }
				 }
				 
				 for(int j = 0; j < movimientoComplejo; j++){
					 miNave.avanzarAlOeste(); 
					 if(encontroContenedor(miRadar) != "NO_ENCONTRO" ){
						 //Recolectar sustancai
						 System.out.println(encontroContenedor(miRadar));
						 noEncontro = false;
						 movimientoSimple = 0;
						 movimientoComplejo = 0;
					 }
				 }
				 
				 for(int j = 0; j < movimientoComplejo; j++){
					 miNave.avanzarAlNorte(); 
					 if(encontroContenedor(miRadar) != "NO_ENCONTRO" ){
						 //Recolectar sustancai
						 System.out.println(encontroContenedor(miRadar));
						 noEncontro = false;
						 movimientoSimple = 0;
						 movimientoComplejo = 0;
					 }
				 }
				 
				 for(int j = 0; j < movimientoSimple; j++){
					 miNave.avanzarAlEste(); 
					 if(encontroContenedor(miRadar) != "NO_ENCONTRO" ){
						 //Recolectar sustancai
						 System.out.println(encontroContenedor(miRadar));
						 noEncontro = false;
						 movimientoSimple = 0;
						 movimientoComplejo = 0;
					 }
				 }
			 }
		
		 
		 /*
		 for(int i = 0; i < 2; i++){
			 miNave.avanzarAlSur();
		 }
		 miNave.avanzarAlOeste(); */
		 
		 
		 //Comprobamos la cantidad de sustancia 
		 /*
		 int cantidad = miRadar.buscarAlOeste(Sustancia.ANTIMATERIA);
		 System.out.println("Hay " + cantidad + " de ANTIMATERIA");
		 
		 if(cantidad > 100){
			 
			 miNave.cargarDesdeOeste(Sustancia.ANTIMATERIA, cantidad);
			 
			 //Volvemos a la base
			 for(int i = 0; i < 2; i++){
				 miNave.avanzarAlNorte();
			 }
			 
			 //Descaramso en la base la antimateria
			 miNave.descargarEnEste(Sustancia.ANTIMATERIA, cantidad);
		 }
		 
		 else if(cantidad <= 100 ){
			 
			 //Destruimos el contenedor
			 while(miRadar.escanearOeste() == Espectro.CONTENEDOR){
				 miNave.atacarAlOeste();
			 }
		 }*/
		 
		 
		 
	 }


}
