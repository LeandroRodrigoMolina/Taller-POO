package com.mycompany.taller.poo;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.FormatoTipo;
import enumeraciones.ObraTipo;
import enumeraciones.PrestamoTipo;
import enumeraciones.SexoTipo;
import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import excepciones.PrestamoInexistenteError;
import gestion.datos.GestionDatos;
import interfaz.VentanaLogueo;
import gestion.inventario.*;
import gestion.personas.*;
import interfaz.VentanaAdministrador;
import interfaz.VentanaBibliotecario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.output.OutputException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Grupo 2
 */
public class Main {
    public static void main(String []args) throws EjemplarInexistenteError, LectorNoRegistradoError, BarcodeException, OutputException, IOException {
        
//        Edicion edicion1 = new Edicion("Pearson", "Argentina", 10, 2016, 1, 526, "Español", FormatoTipo.PAPEL);
//        Obra obra1 = new Obra(ObraTipo.LIBRO, AreaTematicaTipo.PROGRAMACION, 1, "Como Programar en Java", "", "Paul Deitel", "Harvey Deitel", "", "Informatica", CaracteristicaTipo.BOLETIN, "Programacion", 011, edicion1);
//        Ejemplar ejemplar1 = new Ejemplar(new GregorianCalendar(23, 4, 2020), "Comprado", new Ubicacion(1, 1, 1), obra1);

//        Esto se queda para poder acordarnos la contraseñas y los usuarios
//        Bibliotecario biblio1 = new Bibliotecario(true, "Norma", "12345");
//        Bibliotecario biblio2 = new Bibliotecario(false, "Eduardo", "hola01");
//        Bibliotecario biblio3 = new Bibliotecario(false, "Ana", "345");
//        Bibliotecario biblio4 = new Bibliotecario(false, "Elisa", "1111a");
        
//        de aca en adelante se puede borrar todo
        
        GestionDatos datos = new GestionDatos();
        Ejemplar ej1 = datos.buscarEjemplar("1");
        System.out.println(ej1);

//        datos.agregarObra(obra1);
//        datos.agregarLector(new Lector("Oscar", "Molina", 1, new GregorianCalendar(10, 3, 1975), "Argentina", "P.A de Maria 123", 3200, "Concordia", "3457458123", "oscar@gmail.com", SexoTipo.MASCULINO));
        
//        Lector lectorDNI1 = datos.buscarLector(1);
//        Lector lectorDNI2 = datos.buscarLector(2);
//        System.out.println(lectorDNI2.getClass().getName());

//        datos.agregarUsuario(biblio1);
//        datos.agregarUsuario(biblio2);
//        datos.agregarUsuario(biblio3);
//        datos.agregarUsuario(biblio4);
        
        VentanaLogueo login = new VentanaLogueo(datos);
        login.setVisible(true);
    }
}
