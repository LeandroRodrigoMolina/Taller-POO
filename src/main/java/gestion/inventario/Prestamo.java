/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.PrestamoTipo;
import gestion.personas.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Clase prestamo de ejemplar.
 * @author Grupo 2
 */
public class Prestamo implements Serializable{
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaDevolucion;
    private Integer diasDePrestamo = 4;
    private PrestamoTipo tipoPrestamo;
    private Usuario emisorPrestamo;
    private Usuario receptorPrestamo;
    private Ejemplar ejemplarSolicitado;
    private Lector solicitante;
    
    /**
     * Construye un objeto Pestamo con sus valores inicializados.
     * @param fechaInicio GregorianCalendar
     * @param tipoPrestamo PrestamoTipo
     * @param emisorPrestamo Usuario
     * @param ejemplarSolicitado Ejemplar
     * @param lectorSolicita Lector
     */
    public Prestamo(GregorianCalendar fechaInicio, PrestamoTipo tipoPrestamo, Usuario emisorPrestamo, Ejemplar ejemplarSolicitado, Lector lectorSolicita) {
        this.fechaInicio = fechaInicio;
        this.tipoPrestamo = tipoPrestamo;
        this.emisorPrestamo = emisorPrestamo;
        this.ejemplarSolicitado = ejemplarSolicitado;
        this.solicitante = lectorSolicita;
//        this.fechaDevolucion = new GregorianCalendar(fechaInicio.get(Calendar.YEAR), fechaInicio.get(Calendar.MONTH), fechaInicio.get(Calendar.DAY_OF_MONTH), fechaInicio.get(Calendar.HOUR), fechaInicio.get(Calendar.MINUTE) + 2);
        this.fechaDevolucion = new GregorianCalendar(fechaInicio.get(Calendar.YEAR), fechaInicio.get(Calendar.MONTH), fechaInicio.get(Calendar.DAY_OF_MONTH) + diasDePrestamo);
    
        // Se incrementa el contador de obra de acuerdo al tipo de lector general/profesor/alumno

        if(lectorSolicita.getClass().getName().equals("gestion.personas.Lector")) {
            ejemplarSolicitado.getObra().incrementarGeneral();
        } else if (lectorSolicita.getClass().getName().equals("gestion.personas.Alumno")) {
            ejemplarSolicitado.getObra().incrementarFacultad();
        }else if(lectorSolicita.getClass().getName().equals("gestion.personas.Docente")){
            ejemplarSolicitado.getObra().incrementarFacultad();
        }
        
        // Se mantiene la relacion entre Prestamo y Lector
        ejemplarSolicitado.setPrestamo(this);
        ejemplarSolicitado.agregarLector(lectorSolicita);
                
        // Se mantiene la relacion entre Prestamo y Ejemplar
        lectorSolicita.setPrestamo(this);
        lectorSolicita.agregarLibro(ejemplarSolicitado);
        
    }
    /**
     * Se crea un objecto con valores predeterminados.
     */
    public Prestamo() {
    }
    /**
     * Devuelve la fecha de inicio del préstamo
     * @return GregorianCalendar
     */
    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Establece la fecha de inicio del préstamo.
     * @param fechaInicio GregorianCalendar
     */
    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Devuelve la fecha de devolución del préstamo.
     * @return GregorianCalendar
     */
    public GregorianCalendar getFechaDevolucion() {
        return fechaDevolucion;
    }
    /**
     * Establece la fecha de devolución.
     * @param fechaDevolucion GregorianCalendar
     */
    public void setFechaDevolucion(GregorianCalendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    /**
     * Devuelve los días del préstamo.
     * @return Integer
     */
    public Integer getDiasDePrestamo() {
        return diasDePrestamo;
    }
    /**
     * Establece la cantidad de días del préstamo.
     * @param diasDePrestamo Integer
     */
    public void setDiasDePrestamo(Integer diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }
    /**
     * Devuelve el tipo de préstamo.
     * @return PrestamoTipo
     */
    public PrestamoTipo getTipoPrestamo() {
        return tipoPrestamo;
    }
    /**
     * Establece el tipo de préstamo. Requiere un objeto PrestamoTipo.
     * @param tipoPrestamo PrestamoTipo
     */
    public void setTipoPrestamo(PrestamoTipo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }
    /**
     * Devuelve el emisor del préstamo.
     * @return Usuario
     */
    public Usuario getEmisorPrestamo() {
        return emisorPrestamo;
    }
    /**
     * Establece el emisor del préstamo. Requiere como parámetro un objeto Usuario.
     * @param emisorPrestamo Usuario
     */
    public void setEmisorPrestamo(Usuario emisorPrestamo) {
        this.emisorPrestamo = emisorPrestamo;
    }
    /**
     * Devuelve el receptor del préstamo.
     * @return Usuario
     */
    public Usuario getReceptorPrestamo() {
        return receptorPrestamo;
    }
    /**
     * Establece el receptor del préstamo. Requiere un objeto Usuario.
     * @param receptorPrestamo Usuario
     */
    public void setReceptorPrestamo(Usuario receptorPrestamo) {
        this.receptorPrestamo = receptorPrestamo;
        this.ejemplarSolicitado.setEnPrestamo(false);
    }
    /**
     * Devuelve el Ejemplar solicitado.
     * @return Ejemplar
     */
    public Ejemplar getEjemplarSolicitado() {
        return ejemplarSolicitado;
    }
    /**
     * Establece el Ejemplar que es solicitado para el préstamo.
     * @param ejemplarSolicitado Ejemplar
     */
    public void setEjemplarSolicitado(Ejemplar ejemplarSolicitado) {
        this.ejemplarSolicitado = ejemplarSolicitado;
    }
    /**
     * Devuelve el objeto Lector el cual solicita el prestamo.
     * @return Lector
     */
    public Lector getSolicitante() {
        return solicitante;
    }
    /**
     * Establece la solicitud del lector. Requiere un objeto Lector.
     * @param solicitante Lector
     */
    public void setSolicitante(Lector solicitante) {
        this.solicitante = solicitante;
    }
    
    
}