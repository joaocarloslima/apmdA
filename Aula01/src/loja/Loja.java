package loja;

public class Loja {
	
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		Smartphone iphone = new Smartphone();
		
		livro1.getAutor();
		livro1.getDescricao();
		livro1.getPreco();
		
		iphone.setMarca("Apple");
		iphone.setModelo("X");
		iphone.setDescricao("Iphone X 256G");
		
	}

}
