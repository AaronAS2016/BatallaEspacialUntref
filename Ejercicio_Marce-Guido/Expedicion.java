class Expedicion {

	Nave naveExploradora;
	Radar radar;

	public Expedicion(Nave naveExploradora) {
		this.naveExploradora = naveExploradora;
		this.naveExploradora.despegar();
		this.naveExploradora.avanzarAlOeste();
		radar = this.naveExploradora.obtenerRadar();
	}

	public int expedicionOscilante(int amplitud, int frecuecia) {
		int pasos = 0;
		pasos = oscilar(amplitud, frecuecia);
		return pasos;
	}

	private int oscilar(int amplitud, int frecuencia) {
		int movimiento = 1;
		int pasos = 0;
		while (radar.escanearNorte() != Espectro.DESCONOCIDO
				&& radar.escanearSur() != Espectro.DESCONOCIDO
				&& movimiento <= amplitud) {
			for (int i = 0; i < movimiento; i++) {
				naveExploradora.avanzarAlNorte();
			}
			for (int i = 0; i < movimiento; i++) {
				naveExploradora.avanzarAlSur();

			}
			for (int i = 0; i < movimiento; i++) {
				naveExploradora.avanzarAlSur();

			}
			for (int i = 0; i < movimiento; i++) {
				naveExploradora.avanzarAlNorte();

			}
			if (radar.escanearOeste() == Espectro.VACIO && pasos < frecuencia) {
				naveExploradora.avanzarAlOeste();
				pasos++;
			}

			movimiento++;
		}

		return pasos;
	}
}
