package veterinario;

public class CasaDaTia {
	
	public static void main(String[] args) {
		
		Gato felix = new Gato();
//		felix.nome = "Felix";
//		felix.cor = "São Paulo";
//		felix.genero = 'O';
//		felix.tamanho = -10;
		
		Gato garfield = new Gato();	
//		garfield.nome = "Garfield";
//		garfield.cor = "Caramelo";
//		garfield.genero = 'M';
		
		felix.miar();
		garfield.miar();
		
		felix.calcularDose(6, 5);
		//System.out.println("O gato deve tomar " + dose + " gota(s)");
		
	}

}
