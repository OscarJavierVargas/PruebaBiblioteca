package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// metodos  insertar libro
	public Libro insertarLibro(String titulo, String autor, String publicado ) {
		Libro nLibro5=new Libro(titulo, autor, publicado);
		return nLibro5;
		
	}
	
	// prestar libro
	public Libro prestarLIbro(String titulo, String autor, String publicado ) {
		Biblioteca prest=new Biblioteca();
		prest.getLibrosBiblioteca();
	return null;}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main=new Main();

		Libro nLibro=new Libro("don quijote", "Miguel de cervantes", "1605");
		Libro nLibro1=new Libro("ien años de soledad", "de Gabriel García Márquez", "1900");
		Libro nLibro2=new Libro("El señor de los anillos", " J. R. R. Tolkien", "1605" );
		Libro nLibro3=new Libro("1984, ", "George Orwell", "1605" );

		
		Usuario usuario=new Usuario("Oscar", 1010);
		Usuario usuario1=new Usuario("Javier", 2020);
		Usuario usuario2=new Usuario("Pedro", 3030);
		Usuario usuario3=new Usuario("Miguel", 4040);
		
		Biblioteca bibli=new Biblioteca(nLibro, "prestado");
		Biblioteca bibli1=new Biblioteca(nLibro1, "prestado");
		Biblioteca bibli2=new Biblioteca(nLibro2, "prestado");
		Biblioteca bibli3=new Biblioteca(nLibro3, "prestado");
		
		List<Biblioteca> listaBiblio=new ArrayList<Biblioteca>();
		listaBiblio.add(bibli);
		listaBiblio.add(bibli1);
		listaBiblio.add(bibli2);
		listaBiblio.add(bibli3);
		
		
		List<Libro> lista=new ArrayList<Libro>();
		lista.add(nLibro);
		lista.add(nLibro1);
		lista.add(nLibro2);
		lista.add(nLibro3);

		
		for(int i=0; listaBiblio.size()>i; i++) {
			//System.out.println(listaBiblio.get(i).toString());
		//	System.out.print(listaBiblio.get(i).getLibrosBiblioteca().getTitulo());
		//	System.out.println("  "+listaBiblio.get(i).getEstado());
			
		}
		

		
		int expresion=1;
	
		switch(expresion) {
		  case 1: //code to be executed
			  Libro nuevo=main.insertarLibro("nuevo", "Oscar Jacier", "1984");
				System.out.println(nuevo.toString());
		  break; //optional
		  case 2: //code to be executed
			  System.out.println(" 2 ");
		  break; //optional
		 
		  default: //code to be executed if all cases are not matched
			  System.out.println(" defaul ");
		}
		
		
		

	}
}
