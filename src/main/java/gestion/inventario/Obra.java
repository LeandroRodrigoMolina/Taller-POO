 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.ObraTipo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author martin
 */
public class Obra implements Serializable{
    private ObraTipo tipoDeObra;
    private AreaTematicaTipo areaTematica;
    private CaracteristicaTipo caracteristica;
    private int cantidadEjemplares;
    private String titulo;
    private String subtitulo;
    private String primerAutor;
    private String segundoAutor;
    private String tercerAutor;
    private String genero;
    private String indiceObra;
    private String areaReferencia;
    private int solicitudFacultad;
    private int solicitudGeneral;
    private int isbn;
    private Edicion edicion;
    private List<Ejemplar> ejemplares = new ArrayList();


    /**
     * Construye un objeto obra con los valore pasados por parametro.
     * @param tipoDeObra tipoDeObra
     * @param areaTematica AreaTematicaTipo
     * @param cantidadEjemplares int
     * @param titulo String
     * @param subtitulo String
     * @param primerAutor String
     * @param segundoAutor String
     * @param tercerAutor String
     * @param genero String
     * @param caracteristica CaracteristicaTipo
     * @param areaReferencia String
     * @param isbn int
     * @param edicion Edicion
     */    
    public Obra(ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, int cantidadEjemplares, String titulo, String subtitulo, String primerAutor,
                String segundoAutor, String tercerAutor, String genero, CaracteristicaTipo caracteristica, String areaReferencia,
                int isbn, Edicion edicion) {
        
        this.tipoDeObra = tipoDeObra;
        this.areaTematica = areaTematica;
        this.cantidadEjemplares = cantidadEjemplares;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.primerAutor = primerAutor;
        this.segundoAutor = segundoAutor;
        this.tercerAutor = tercerAutor;
        this.genero = genero;
        this.caracteristica = caracteristica;
        this.areaReferencia = areaReferencia;
        this.isbn = isbn;
        this.edicion = edicion;
        this.solicitudFacultad = 0;
        this.solicitudGeneral = 0;
    }
    /**
     * Constructor por defecto.
     */
    public Obra() {
        this.solicitudFacultad = 0;
        this.solicitudGeneral = 0;
    }
    /**
     * Devuelve el ObraTipo de la obra.
     * @return ObraTipo
     */
    public ObraTipo getTipoDeObra() {
        return tipoDeObra;
    }
    /**
     * Establece el tipo de obra. Requiere un objeto ObraTipo.
     * @param tipoDeObra ObraTipo
     */
    public void setTipoDeObra(ObraTipo tipoDeObra) {
        this.tipoDeObra = tipoDeObra;
    }
    /**
     * Devuelve el área temática de la obra.
     * @return AreaTematicaTipo
     */
    public AreaTematicaTipo getAreaTematica() {
        return areaTematica;
    }
    /**
     * Establece el area temática de la obra. Requiere un objeto AreaTematicaTipo.
     * @param areaTematica AreaTematicaTipo
     */
    public void setAreaTematica(AreaTematicaTipo areaTematica) {
        this.areaTematica = areaTematica;
    }
    /**
     * Devuelve la cantidad de ejemplares.
     * @return int
     */
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }
    /**
     * Establece la cantidad de ejemplares de la obra.
     * @param cantidadEjemplares int
     */
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    /**
     * Devuelve el titulo de la obra.
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el subtitulo de la obra.
     * @param titulo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Devuelve el subtitulo de la obra.
     * @return String
     */
    public String getSubtitulo() {
        return subtitulo;
    }
    /**
     * Establece el subtitulo de la obra.
     * @param subtitulo String
     */
    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
    /**
     * Devuelve el primer autor de la obra.
     * @return String
     */
    public String getPrimerAutor() {
        return primerAutor;
    }
    /**
     * Establece el primer autor de la obra.
     * @param primerAutor String
     */
    public void setPrimerAutor(String primerAutor) {
        this.primerAutor = primerAutor;
    }
    /**
     * Devuelve el segundo autor de la obra.
     * @return String
     */
    public String getSegundoAutor() {
        return segundoAutor;
    }
    /**
     * Establece el segundo autor de la obra.
     * @param segundoAutor String
     */
    public void setSegundoAutor(String segundoAutor) {
        this.segundoAutor = segundoAutor;
    }
    /**
     * Devuelve el tercer autor de la obra.
     * @return String
     */
    public String getTercerAutor() {
        return tercerAutor;
    }
    /**
     * Establece el tercer autor de la obra.
     * @param tercerAutor String
     */
    public void setTercerAutor(String tercerAutor) {
        this.tercerAutor = tercerAutor;
    }
    /**
     * Devuelve el género de la obra.
     * @return String
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Establece el género en un String.
     * @param genero String
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Devuelve un objeto CaracteristicaTipo de la obra actual.
     * @return Caracteristicatipo
     */
    public CaracteristicaTipo getCaracteristica() {
        return caracteristica;
    }
    /**
     * Establece la caracteristica del objeto obra actual. Requiere como parámetro un CaracteristicaTipo.
     * @param caracteristica CaracteristicaTipo
     */
    public void setCaracteristica(CaracteristicaTipo caracteristica) {
        this.caracteristica = caracteristica;
    }
    /**
     * Devuelve el indice de obra del objeto obra actual.
     * @return String
     */
    public String getIndiceObra() {
        return indiceObra;
    }
    /**
     * Establece el indice de obra del objeto obra actual.
     * @param indiceObra String
     */
    public void setIndiceObra(String indiceObra) {
        this.indiceObra = indiceObra;
    }
    /**
     * Devuelve el area de referencia del objeto de obra actual.
     * @return String
     */
    public String getAreaReferencia() {
        return areaReferencia;
    }
    /**
     * Establece el area de referencia del objeto de obra actual.
     * @param areaReferencia String
     */
    public void setAreaReferencia(String areaReferencia) {
        this.areaReferencia = areaReferencia;
    }
    /**
     * Devuelve la solicitud de facultad.
     * @return int
     */
    public int getSolicitudFacultad() {
        return solicitudFacultad;
    }
    /**
     * Establece la solicitud facultad para el objeto actual de obra.
     * @param solicitudFacultad int
     */
    public void setSolicitudFacultad(int solicitudFacultad) {
        this.solicitudFacultad = solicitudFacultad;
    }
    /**
     * Devuelve la solicitud general del objeto actual.
     * @return int
     */
    public int getSolicitudGeneral() {
        return solicitudGeneral;
    }
    /**
     * Establece la solicitud general. Requiere un int de parámetro.
     * @param solicitudGeneral int
     */
    public void setSolicitudGeneral(int solicitudGeneral) {
        this.solicitudGeneral = solicitudGeneral;
    }
    /**
     * Devuelve el ISBN de la obra.
     * @return int
     */
    public int getIsbn() {
        return isbn;
    }
    /**
     * Establece el ISBN de la Obra.
     * @param isbn int
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    /**
     * Devuelve la edicion del objeto actual.
     * @return Edicion
     */
    public Edicion getEdicion() {
        return edicion;
    }
    /**
     * Establece la edición. Se debe introducir como parámetro un objeto de tipo Edicion.
     * @param edicion Edicion
     */
    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }

    /**
     * Devuelve todos los ejemplares correspondientes al objeto Obra
     * 
     * @return List Ejemplar
     */
    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }
    
    
    
    // =========== Metodos hechos a mano =========== //
    
    /**
     * Agregar Ejemplar. Requiere que sea un objeto de tipo Ejemplar.
     * @param ej Ejemplar
     */
    public void agregarEjemplar(Ejemplar ej) {
        this.ejemplares.add(ej);
    
    }
    
    /**
     * Devuelve el ejemplar utilizando el número identificador introducido de parámetro.
     * @param identificador int
     * @return Ejemplar
     */
    public Ejemplar buscarEjemplar(int identificador) {
        for(Ejemplar ejemplar : this.ejemplares){
            if(ejemplar.getIdUnico() == identificador) return ejemplar;
        }
        
        return null;
    }
    
    /**
     * Este metodo incrementa en uno el argumento <b>solicitudGeneral</b> del objeto obra
     * 
     */
    public void incrementarGeneral() {
        solicitudGeneral++;
    }

    /**
     * Este metodo incrementa en uno el argumento <b>solicitudFacultad</b> del objeto obra
     * 
     */
    public void incrementarFacultad() {
        solicitudFacultad++;
    }
    
    /**
     * Método toString de Obra.
     * @return String
     */
    @Override
    public String toString() {
                return String.format("Tipo obra: %s"
                + "%nArea tematica: %s"
                + "%nTitulo: %s"
                + "%nPrimer autor: %s"
                + "%nGenero: %s"
                + "%nCaracteristica: %s"
                + "%nEdicion:%n%s", 
                tipoDeObra.getObraTipo(), 
                areaTematica.getAreaTematicaTipo(),titulo, primerAutor, genero, 
                caracteristica.getCaracteristicaTipo(), edicion.toString());
    }
}
