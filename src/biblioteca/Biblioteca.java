package biblioteca;


public class Biblioteca {

	
	public Biblioteca() {
		super();
	}
	
	public Biblioteca(Libro librosBiblioteca, String estado) {
		super();
		this.librosBiblioteca = librosBiblioteca;
		Estado = estado;
	}
	
	private Libro librosBiblioteca;
	private String Estado;
	
	
	public Libro getLibrosBiblioteca() {
		return librosBiblioteca;
	}
	public void setLibrosBiblioteca(Libro librosBiblioteca) {
		this.librosBiblioteca = librosBiblioteca;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Biblioteca [librosBiblioteca=" + librosBiblioteca + ", Estado=" + Estado + "]";
	}



}
