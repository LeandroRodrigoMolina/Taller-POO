package gestion.personas;

import enumeraciones.SexoTipo;
import gestion.inventario.Ejemplar;
import gestion.inventario.Multa;
import gestion.inventario.Prestamo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Esta clase hereda de Persona, especifica que en una biblioteca hay lectores.
 * @author Grupo 2
 */
public class Lector extends Persona {
    private boolean estaMultado;
    private Prestamo Prestamo;
    private List<Ejemplar> listaLibros;
    private List<Multa>multas;

    private static final long serialVersionUID = 500L;
    /**
     * Construye un objeto de tipo Lector con sus valores inicializados
     * 
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
    public Lector(String nombres, String apellidos, Integer dni, GregorianCalendar fechaNacimiento, String nacionalidad, 
                  String domicilio, Integer codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.estaMultado = false;
        this.listaLibros = new ArrayList();
        this.multas = new ArrayList();
    
    }

    /**
     * Construye un objeto lector con todos sus valores por defecto
     */
    public Lector() {
        this.listaLibros = new ArrayList();
        this.multas = new ArrayList();
    }

    /**
     * Devuelve si el lector esta multado
     * 
     * true -> El lector esta multado
     * false -> El lector no esta multado
     * 
     * @return boolean 
     */
    public boolean estaMultado() {
        return estaMultado;
    }

    /**
     * Settea el estado del lector
     * 
     * true -> El lector pasa a estar multado
     * false -> El lector deja de estar multado
     * 
     * @param estaMultado boolean
     */
    public void setEstaMultado(boolean estaMultado) {
        this.estaMultado = estaMultado;
    }
    

    /**
     * Devuelve la informacion de el prestamo que posee el lector
     * 
     * @return Prestamo 
     */
    public Prestamo getPrestamo() {
        return Prestamo;
    }

    /**
     * Setea un nuevo prestamo para el lector
     * 
     * @param Prestamo Prestamo
     */
    public void setPrestamo(Prestamo Prestamo) {
        this.Prestamo = Prestamo;
    }

    /**
     * Devuelve una lista con todas las multas que tiene el lector
     * 
     * @return List - Ejemplar
     */
    public List<Ejemplar> getListaLibros() {
        return listaLibros;
    }

    /**
     * Setea un nuevo valor para la el listado de libros que pidio prestado el lector
     * 
     * @param listaLibros ArrayList - Ejemplar
     */
    public void setListaLibros(ArrayList<Ejemplar> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * Devuelve el listado de todas las multas que posee el lector
     * 
     * @return Lista - Multa
     */
    public List<Multa> getMultas() {
        return multas;
    }

    /**
     * Setea un nuevo valor para la lista de multas que posee el lector
     * 
     * @param multas List - Multa
     */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
    
    
    
    // ========== Metodos hechos a mano ========== //
    
    /**
     * Agrega un objeto libro al historial de los libros que solicito el lector
     * 
     * @param ejemplar Ejemplar
     */
    public void agregarLibro(Ejemplar ejemplar) {
        this.listaLibros.add(ejemplar);
    }
    
    /**
     * Agrega un objeto multa al historial de busquedas de el lector
     * 
     * @param multa Multa
     */
    public void agregarMulta(Multa multa) {
        this.multas.add(multa);
        this.estaMultado = true;
    }

    /**
     * Devuelve la cantidad de multas que le pusieron al lector
     * 
     * @return Integer 
     */
    public int cantidadMultas() {
        return multas.size();
    }
    
    /**
     * Devuelve la representacion del objeto lector en forma de un string
     * 
     * @return String 
     */
    @Override
    public String toString() {
        String lectorClase;
        if(this instanceof Alumno){
            lectorClase = "Alumno";
        }else if(this instanceof Docente){
            lectorClase = "Docente";
        }else{
            lectorClase = "Lector";
        }
        return String.format("%s |"
                + " Es un %s |"
                + "%n Multas: %s", super.toString(), lectorClase, multas.size());
    }
   
}