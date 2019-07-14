package pojo;
public class Respuesta {
	private boolean Estado;
	private String Mensaje;
	private Object Dato;

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	public Object getDato() {
		return Dato;
	}

	public void setDato(Object dato) {
		Dato = dato;
	}

	public void Completado(String pMensaje, Object pDato) {
		Mensaje = pMensaje;
		Dato = pDato;
		Estado = true;
	}

	public void Completado(String pMensaje) {
		Mensaje = pMensaje;
		Estado = true;
	}

	public void Error(String pMensaje) {
		Mensaje = pMensaje;
		Estado = false;
	}

}
