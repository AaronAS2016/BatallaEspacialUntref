import java.util.function.IntConsumer;

class Piloto {
	
	
	
	//Inicializando nave y radar
	Nave navePiloto = new Nave();
	Radar radarPiloto = navePiloto.obtenerRadar();
	Monitor monitorPiloto = navePiloto.obtenerMonitor();
	
	void moverSiempre(){
		
	}
	
	void salirDeLaBase() {
		navePiloto.despegar();
	}
	
	
	//Mueve la nave siempre al norte mientras recolecta y destruye asteroides
	void moverSiempreAlNorteRecolectando() {
		
		while(radarPiloto.escanearNorte() != Espectro.DESCONOCIDO){
			moverAlNorte();
			recolectarAlNorte();			
		}
		
	}
	
	//Mueve la nave destruyendo todo
 
	int llegarAlNorte() {
		int pasos = 0;
		while(radarPiloto.escanearNorte() != Espectro.DESCONOCIDO){	
			pasos += moverAlNorte();
			destruirAlNorte();
		}
		
		return pasos;
	}

	int moverAlNorte() {
		int cantidadDePasos = 0;
		while (radarPiloto.escanearNorte() == Espectro.VACIO) {
			cantidadDePasos++;
			navePiloto.avanzarAlNorte();
		}
		return cantidadDePasos;
	}

	void destruirAlNorte() {
		while (radarPiloto.escanearNorte() != Espectro.VACIO &&
			   radarPiloto.escanearNorte() != Espectro.DESCONOCIDO) {
			navePiloto.atacarAlNorte();
		}
	}

	void recolectarAlNorte() {
		
		int cantidadAntimateria = radarPiloto.buscarAlNorte(Sustancia.ANTIMATERIA);
		int cantidadCristal = radarPiloto.buscarAlNorte(Sustancia.CRISTAL);
		int cantidadMetal = radarPiloto.buscarAlNorte(Sustancia.METAL);
		
		int cantidadTotal = cantidadAntimateria + cantidadCristal + cantidadMetal;

		while(cantidadTotal != 0){
			recolectarSustanciasAlNorte(cantidadAntimateria, cantidadCristal, cantidadMetal);
			cantidadAntimateria = radarPiloto.buscarAlNorte(Sustancia.ANTIMATERIA);
			cantidadCristal = radarPiloto.buscarAlNorte(Sustancia.CRISTAL);
			cantidadMetal = radarPiloto.buscarAlNorte(Sustancia.METAL);
			cantidadTotal = cantidadAntimateria + cantidadCristal + cantidadMetal;
		}
		if(cantidadTotal == 0){
			destruirAlNorte();
		}
		
	}
	
	void recolectarSustanciasAlNorte(int cantidadAntimateria, int cantidadCristal, int cantidadMetal){

		recolectarAntimateriaAlNorte(cantidadAntimateria);
		System.out.println("Antimateria: " + cantidadAntimateria);
		recolectarCristalAlNorte(cantidadCristal);
		System.out.println("Cristal: " + cantidadCristal);
		recolectarMetalAlNorte(cantidadMetal);	
		System.out.println("Metal: " + cantidadCristal);
	}

	void recolectarAntimateriaAlNorte(int cantidad) {
		if (radarPiloto.escanearNorte() == Espectro.CONTENEDOR && cantidad > 0) {
			navePiloto.cargarDesdeNorte(Sustancia.ANTIMATERIA, cantidad);
		}
	}

	void recolectarCristalAlNorte(int cantidad) {
		if (radarPiloto.escanearNorte() == Espectro.CONTENEDOR && cantidad > 0) {
			navePiloto.cargarDesdeNorte(Sustancia.CRISTAL, cantidad);
		}
	}

	void recolectarMetalAlNorte(int cantidad) {
		if (radarPiloto.escanearNorte() == Espectro.CONTENEDOR && cantidad > 0) {
			navePiloto.cargarDesdeNorte(Sustancia.METAL, cantidad);
		}
	}
	
	void descargarAntimateria(){
		if(monitorPiloto.consultarCarga(Sustancia.ANTIMATERIA)>0){
			while(radarPiloto.escanearSur()==Espectro.VACIO){
				navePiloto.avanzarAlSur();
			}
		}
		if(radarPiloto.escanearSur()==Espectro.BASE){
			navePiloto.descargarEnSur(Sustancia.ANTIMATERIA,100) ;
		}
	}
	
	void descargarCristal(){
		if(monitorPiloto.consultarCarga(Sustancia.CRISTAL)>0){
			while(radarPiloto.escanearSur()==Espectro.VACIO){
				navePiloto.avanzarAlSur();
			}
		}
		if(radarPiloto.escanearSur()==Espectro.BASE){
			navePiloto.descargarEnSur(Sustancia.CRISTAL,100) ;
		}
	}
	
	void descargarMetal(){
		if(monitorPiloto.consultarCarga(Sustancia.METAL)>0){
			while(radarPiloto.escanearSur()==Espectro.VACIO){
				navePiloto.avanzarAlSur();
			}
		}
		if(radarPiloto.escanearSur()==Espectro.BASE){
			navePiloto.descargarEnSur(Sustancia.METAL,100) ;
		}
	}
}
