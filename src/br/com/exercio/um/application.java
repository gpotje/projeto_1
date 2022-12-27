package br.com.exercio.um;

public class application {

	public static void main(String[] args) {
		
		  Pessoa jose = new Pessoa();
		  jose.setIdade(45);
		  jose.setNome("jose da silva");
		  
		  Pessoa maria = new Pessoa();
		  maria.setIdade(40);
		  maria.setNome("maria da souza");
		  
		  //Pessoa jose = maria ;
		  
		  System.out.println(jose.toString());
		  System.out.println(maria.toString());
		 
	}
	
}

