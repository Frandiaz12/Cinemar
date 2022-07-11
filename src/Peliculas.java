
public class Peliculas {
	private String genero;
	private String nombre;
	private int duracionMinutos;
	public Peliculas(String genero, String nombre, int duracionMinutos) {
		this.duracionMinutos=duracionMinutos;
		this.genero=genero;
		this.nombre=nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	@Override
	public String toString() {
		return "Peliculas [genero=" + genero + ", nombre=" + nombre + ", duracionMinutos=" + duracionMinutos + "]";
	}
	

}
