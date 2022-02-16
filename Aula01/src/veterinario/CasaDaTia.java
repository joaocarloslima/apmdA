package veterinario;

public class CasaDaTia {
	
	public static void main(String[] args) {
		
		Gato felix = new Gato();
		felix.nome = "Felix";
		felix.cor = "Preto";
		felix.genero = 'M';
		
		Gato garfield = new Gato();	
		garfield.nome = "Garfield";
		garfield.cor = "Caramelo";
		garfield.genero = 'M';
		
		felix.miar();
		garfield.miar();
		
		
	}

}
