class Cuadrado {
	private double lado;

	public Cuadrado(double ladoDelCuadrado) {
		establecerLado(ladoDelCuadrado);
	}

	public double obtenerLado() {
		return lado;
	}

	public double obtenerPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double obtenerSuperficie() {
		double superficie = lado * lado;
		return superficie;
	}

	public void establecerSuperficie(double nuevaSuperficie) {
		if (nuevaSuperficie > 0) {
			double nuevoLado = Math.sqrt(nuevaSuperficie);
			establecerLado(nuevoLado);
		}
	}

	public void establecerPerimetro(double nuevoPerimetro) {
		double nuevoLado = nuevoPerimetro / 4;
		establecerLado(nuevoLado);
	}

	public void establecerLado(double nuevoLado) {
		if (nuevoLado > 0) {
			lado = nuevoLado;
		} else if (nuevoLado < 0) {
			lado = nuevoLado * (-1);
		} else {
			lado = 1;
		}
	}

}
