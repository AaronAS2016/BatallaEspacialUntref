class Circulo {

	private double radio;
	
	public Circulo(double radioDelCirculo) {
		
		establecerRadio(radioDelCirculo);
	}
	
	public double obtenerDiametro(){
		
		double diametro = radio * 2;
		
		return diametro;
	}
	
	public double obtenerRadio(){
		return radio;
	}
		
	public double obtenerPerimetro(){
		
		double perimetro = 2 * 3 * radio;
		
		return perimetro;
	}
	
	public double obtenerSuperficie(){
		
		double superficie = 3 * (radio * radio);
		
		return superficie;
	}
	
	public void establecerRadio(double nuevoRadio){
		if(nuevoRadio > 0){
			radio = nuevoRadio;
		}else if(nuevoRadio < 0){
			radio = nuevoRadio * (-1);
		}else{
			radio = 1;
		}
	}
	
	public void establecerDiametro(double nuevoDiametro){
		double nuevoRadio = nuevoDiametro / 2;
		establecerRadio(nuevoRadio);
	}
	
	public void establecerSuperficie(double nuevaSuperficie){
		double nuevoRadio =  Math.sqrt(3 / nuevaSuperficie);
		establecerRadio(nuevoRadio);
	}
	
	public void establecerPerimetro(double nuevoPerimetro){
		double nuevoRadio = (nuevoPerimetro / 6);
		establecerRadio(nuevoRadio);  
	}
	
	
	
	
}
