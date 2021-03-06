class Expedicion {

	Nave naveExploradora;
	Radar radar;
	boolean pudoOscilar = true;

	public Expedicion(Nave naveExploradora) {
		this.naveExploradora = naveExploradora;
		this.naveExploradora.despegar();
		radar = this.naveExploradora.obtenerRadar();
	}

	public int expedicionOscilante(int amplitud, int frecuencia) {
		int pasosAlOeste = 0;
		while (radar.escanearOeste() == Espectro.VACIO && pudoOscilar) {
			pasosAlOeste += desplazarseAlOeste(frecuencia);
			oscilar(amplitud);
		}
		return pasosAlOeste;
	}

	private void oscilar(int amplitud) {
		for (int i = 0; i < amplitud; i++) {
			if (radar.escanearNorte() == Espectro.VACIO) {
				naveExploradora.avanzarAlNorte();
			}else{
				pudoOscilar = false;
			}
		}
		for (int j = 0; j < amplitud; j++) {
			if (pudoOscilar) {
				naveExploradora.avanzarAlSur();
			}
		}

	}
	
	private int desplazarseAlOeste(int frecuencia){
		int pasos = 0;
		for (int i = 0; i < frecuencia; i++) {
			if (radar.escanearOeste() == Espectro.VACIO && pudoOscilar) {
				naveExploradora.avanzarAlOeste();
				pasos++;
			}
		}
		return pasos;
	}
}
