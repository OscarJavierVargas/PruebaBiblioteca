package biblioteca;

public class Usuario {
	public Usuario() {
		
	}
	
	public Usuario(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	private String nombre;
	private int id;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
