package mapper;

public final class ColumnasSql {
	/*Nombre y columnas de la tabla proyecto*/
	private static String NombreTabla_Proyecto = "TBL_PROYECTO";
	private static String ColCodigo_Proyecto = "CODIGO";
	private static String ColDescripcion_Proyecto = "DESCRIPCION";
	private static String ColVersion_Proyecto = "VERSION";
	private static String ColNombre_Proyecto = "NOMBRE";
	
	/*Nombre y columnas de la tabla usuario.*/
	private static String NombreTablaUsuario = "TBL_USUARIO";
	private static String ColCedulaUsuario = "CEDULA";
	private static String ColPrimerNombre = "PRIMER_NOMBRE";
	private static String ColSegundoNombre = "SEGUNDO_NOMBRE";
	private static String ColPrimerApellido = "PRIMER_APELLIDO";
	private static String ColSegundoApellido = "SEGUNDO_APELLIDO";
	private static String ColFechaNacimiento = "FECHA_NACIMIENTO";
	private static String ColClave = "CLAVE";
	
	/*Nombre y columnas de la tabla funcionalidad.*/
	private static String NombreTabla_Funcionalidad = "TBL_FUNCIONALIDAD";
	private static String ColCodigo_Funcionalidad = "CODIGO";
	private static String ColNombre_Funcionalidad = "NOMBRE";
	private static String ColDescripcion_Funcionalidad = "DESCRIPCION";
	private static String ColPrioridad_Funcionalidad = "PRIORIDAD";
	private static String ColIdProyecto_Funcionalidad = "ID_PROYECTO";
	
	/*Nombre y columnas de la tabla requerimiento.*/
	private static String NombreTabla_Req = "TBL_REQUERIMIENTO";
	private static String ColCodigo_Req = "CODIGO";
	private static String ColDescripcion_Req= "DESCRIPCION";	
	
	/*Nombre y columnas de la tabla actor*/
	private static String NombreTabla_Actor = "TBL_ACTOR";
	private static String ColId_Actor = "ID";
	private static String ColNombre_Actor = "NOMBRE";
	private static String ColDescripcion_Actor = "DESCRIPCION";
	
	/*Nombre y columnas de la tabla usuario x proyecto*/
	private static String NombreTabla_UsuarioxProy= "TBL_USUARIOxPROYECTO";
	private static String ColID_UsuarioxProy = "ID";
	private static String ColIDUsuario_UsuarioxProy = "ID_USUARIO";
	private static String ColIDProyecto_UsuarioxProy = "ID_PROYECTO";
	
	/*Nombre y columnas de la tabla requerimiento x funcionalidad*/
	private static String NombreTabla_RequerimientoxFuncionalidad = "TBL_USUARIOxPROYECTO";
	private static String ColID_RequerimientoxFuncionalidad = "ID";
	private static String ColIDRequerimiento_RequerimientoxFuncionalidad = "ID_REQUERIMIENTO";
	private static String ColIDFuncionalidad_RequerimientoxFuncionalidad = "ID_FUNCIONALIDAD";
	
	/*Nombre y columnas de la tabla actor x funcionalidad*/
	private static String NombreTabla_ActorxFuncionalidad = "TBL_USUARIOxPROYECTO";
	private static String ColID_ActorxFuncionalidad = "ID";
	private static String ColIDActor_ActorxFuncionalidad = "ID_ACTOR";
	private static String ColIDFuncionalidad_ActorxFuncionalidad = "ID_FUNCIONALIDAD";
	
}
