package biblioteca;

public class Libro {
	public Libro() {
		
	}
	

	public Libro(String titulo, String autor, String anioPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		AnioPublicacion = anioPublicacion;
		
	}
	private String titulo;
	private String autor;
	private String AnioPublicacion;


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnioPublicacion() {
		return AnioPublicacion;
	}
	public void setAnioPublicacion(String anioPublicacion) {
		AnioPublicacion = anioPublicacion;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", AnioPublicacion=" + AnioPublicacion 
				 + "]";
	}
	
	

}
