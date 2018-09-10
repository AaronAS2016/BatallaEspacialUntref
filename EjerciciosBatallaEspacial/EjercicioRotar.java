
class EjercicioRotar {

	void iniciar(){
		
		Nave miNave = new Nave();
		miNave.despegar();
		miNave.avanzarAlNorte();		
		for (int vuelta = 0; vuelta < 5; vuelta++){
			
			miNave.avanzarAlEste();
			miNave.avanzarAlSur();
			miNave.avanzarAlSur();
			miNave.avanzarAlOeste();
			miNave.avanzarAlOeste();
			miNave.avanzarAlNorte();
			miNave.avanzarAlNorte();
			miNave.avanzarAlEste();
		}
	}
}
