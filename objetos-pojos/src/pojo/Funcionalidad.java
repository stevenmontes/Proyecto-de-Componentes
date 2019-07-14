package pojo;

public class Funcionalidad extends Pojo{
	private String Codigo;
	private String Nombre;
	private String Descripcion;
	private int Prioridad;
	private String IdProyecto;

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getPrioridad() {
		return Prioridad;
	}

	public void setPrioridad(int prioridad) {
		Prioridad = prioridad;
	}

	public String getIdProyecto() {
		return IdProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		IdProyecto = idProyecto;
	}
}
