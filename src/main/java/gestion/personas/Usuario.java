package gestion.personas;

import enumeraciones.SexoTipo;
import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * Esta clase hereda de persona e implementa la interface serializable.
 * @author Grupo 2
 */
public class Usuario extends Persona implements Serializable {
    private boolean administrador;
    private String nombreUsuario;
    private String contrasenia;
    
    private static final long serialVersionUID = 42L;
    
    /**
     * Construye un objeto Usuario con todos sus parametros inicializados
     * 
     * @param administrador boolean
     * @param nombreUsuario String
     * @param contrasenia String
     * @param nombres String
     * @param apellidos String
     * @param dni Integer
     * @param fechaNacimiento GregorianCalendar
     * @param nacionalidad String
     * @param domicilio String
     * @param codPostal Integer
     * @param localidad String
     * @param numCelular String
     * @param mail String
     * @param sexo SexoTipo
     */
    public Usuario(boolean administrador, String nombreUsuario, String contrasenia, String nombres, String apellidos, Integer dni, GregorianCalendar fechaNacimiento,
                   String nacionalidad, String domicilio, Integer codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.administrador = administrador;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Construye un objeto Usuario con sus atributos de inicio de sesion seteados
     * 
     * @param administrador boolean
     * @param nombreUsuario String
     * @param contrasenia String
     *  
     */
    public Usuario(boolean administrador, String nombreUsuario, String contrasenia) {
        this.administrador = administrador;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Construye un objeto Usuario con valores por defecto
     */
    public Usuario() {
    }

    /**
     * Devuelve un valor booleano que nos permite saber si el usuario es un administrador o no
     * 
     * @return <b>true</b> -> si el usuario es un administrador y <b>false</b> -> en el caso contrario
     */
    public boolean esAdministrador() {
        return administrador;
    }

    /**
     * Modifica los permisos de administrador para el usuario
     * true para que sea administrador, false para que sea un simbre usuario
     * 
     * @param administrador boolean
     */
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    /**
     * Devulve en nombre de usuario
     * 
     * @return String
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Setea un nuevo nombre para el usuario
     * 
     * @param nombreUsuario String
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Devuelve la contraseña del usuario
     * 
     * @return String
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Setea un nuevo valor para la contraseña
     * 
     * @param contrasenia String
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
      
    /**
     * Devuelve una representacion del objeto Usuario en forma de String
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Administrador: %s"
                + "%nNombre usuario: %s"
                + "%nContraseña: %s", administrador, nombreUsuario, contrasenia);
    }
	
	
}
