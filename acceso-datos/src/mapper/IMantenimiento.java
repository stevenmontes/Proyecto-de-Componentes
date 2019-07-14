package mapper;

import pojo.Pojo;
import pojo.Respuesta;

public interface IMantenimiento {
	public Respuesta Registrar(Pojo obj);

	public Respuesta Modificar(Pojo obj);

	public Respuesta Obtener();

	public Respuesta Obtener(Pojo obj);

	public Respuesta Eliminar(Pojo obj);
}
