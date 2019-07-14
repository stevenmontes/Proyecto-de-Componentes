package pojo;

public class Proyecto extends Pojo {
	private String Codigo;
	private String Nombre;
	private String Descripcion;
	private String Version;
	
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
	
	public String getVersion() {
		return Version;
	}
	
	public void setVersion(String version) {
		Version = version;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
}
