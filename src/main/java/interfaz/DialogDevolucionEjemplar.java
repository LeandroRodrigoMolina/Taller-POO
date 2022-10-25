/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import excepciones.EjemplarInexistenteError;
import gestion.datos.GestionDatos;
import gestion.inventario.Ejemplar;
import gestion.inventario.Multa;
import gestion.personas.Lector;
import java.util.GregorianCalendar;

/**
 *
 * @author Grupo 2
 */
public class DialogDevolucionEjemplar extends javax.swing.JDialog {

    private GestionDatos datos;

    public DialogDevolucionEjemplar(java.awt.Frame parent, boolean modal, GestionDatos datos) {
        super(parent, modal);
        this.datos = datos;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodEjemplar = new javax.swing.JTextField();
        botonRegistrarDevolucion = new javax.swing.JButton();
        botonCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel3.setText("Devolución de Ejemplar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Codigo de Ejemplar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(txtCodEjemplar, gridBagConstraints);

        botonRegistrarDevolucion.setText("Registrar");
        botonRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarDevolucionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 30, 0);
        jPanel1.add(botonRegistrarDevolucion, gridBagConstraints);

        botonCerrarVentana.setText("Cancelar");
        botonCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVentanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel1.add(botonCerrarVentana, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarDevolucionActionPerformed
        try{
            Ejemplar ejemplarEnPrestamo = datos.buscarEjemplar(txtCodEjemplar.getText());
        
            if(ejemplarEnPrestamo.getPrestamo().getFechaDevolucion().before(new GregorianCalendar())) {
                Lector persona = ejemplarEnPrestamo.getPrestamo().getSolicitante();
                
                new Multa(new GregorianCalendar(), persona);
                
                javax.swing.JOptionPane.showMessageDialog(rootPane, "El lector " + persona.getNombres() + " " + persona.getApellidos() + " ha sido multado.");
            }
        
            ejemplarEnPrestamo.getPrestamo().setReceptorPrestamo(datos.getUsuarioLoguado());
        
            datos.escribirDatosLector();
            datos.escribirDatosObra();
            txtCodEjemplar.setText("");
            this.setVisible(false);
            
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Se devolvio el ejemplar");
            
        } catch(EjemplarInexistenteError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Este ejemplar no se encuentra en prestamo");
        }
    }//GEN-LAST:event_botonRegistrarDevolucionActionPerformed

    private void botonCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVentanaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarVentanaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarVentana;
    private javax.swing.JButton botonRegistrarDevolucion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodEjemplar;
    // End of variables declaration//GEN-END:variables
}
