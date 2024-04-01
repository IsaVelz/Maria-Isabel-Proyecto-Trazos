
package com.mycompany.editordibujos;
import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import javax.swing.*;

public class Editor extends javax.swing.JPanel {
    private LinkedList<Forma> formas = new LinkedList<>();
    private String formaActual = "Linea";
    private Forma formaSeleccionada;
    private JWindow window;
    
    public Editor(JWindow window) {
        this.window = window;
        initComponents();
    }

    public Editor() {
        initComponents();
    }
    
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Forma forma : formas) {
            forma.dibujar(g);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Tipos = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Seleccionar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cargar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Tipos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tipos.setForeground(new java.awt.Color(51, 51, 51));
        Tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Línea", "Rectángulo", "Círculo" }));

        Agregar.setBackground(new java.awt.Color(120, 235, 169));
        Agregar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(197, 60, 60));
        Eliminar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Seleccionar.setBackground(new java.awt.Color(124, 148, 204));
        Seleccionar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(140, 53, 53));
        Guardar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cargar.setBackground(new java.awt.Color(140, 53, 53));
        Cargar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        Cerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(204, 0, 0));
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cerrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cargar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(Seleccionar)
                    .addComponent(Eliminar)
                    .addComponent(Guardar)
                    .addComponent(Cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(Cerrar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(this);
     
    if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
                oos.writeObject(formas);
                oos.close();
                
                JOptionPane.showMessageDialog(this, "Los trazos se han guardado en " + archivo.getAbsolutePath(), "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los trazos: " + e.getMessage(), "Error para guardar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int seleccion = fileChooser.showOpenDialog(this);
    
        if (seleccion == JFileChooser.APPROVE_OPTION) {
        File archivo = fileChooser.getSelectedFile();
         try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
            LinkedList<Forma> formasCargadas = (LinkedList<Forma>) ois.readObject();
            formas.addAll(formasCargadas);
            ois.close();
            repaint();
            
            JOptionPane.showMessageDialog(this, "Trazos cargados desde " + archivo.getAbsolutePath(), "Carga exitosa del trazo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los trazos: " + e.getMessage(), "Error en la carga del trazo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
    String tipoSeleccionado = (String) Tipos.getSelectedItem();
    int x1 = (int) (Math.random() * getWidth());
    int y1 = (int) (Math.random() * getHeight());
    int x2 = (int) (Math.random() * getWidth());
    int y2 = (int) (Math.random() * getHeight());

    switch (tipoSeleccionado) {
        case "Línea":
            formas.add(new Forma(x1, y1, x2, y2, "Linea"));
            break;
        case "Rectángulo":
            formas.add(new Forma(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), "Rectangulo"));
            break;
        case "Círculo":
            int radio = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            formas.add(new Forma(x1 - radio, y1 - radio, radio * 2, radio * 2, "Circulo"));
            break;
        default:
            break;
        }
    repaint();
    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      if (formaSeleccionada != null) {
        formas.remove(formaSeleccionada);
        formaSeleccionada = null; 
        repaint(); 
    } else if (!formas.isEmpty()) {
        formas.removeLast();
        repaint();
    }
    }//GEN-LAST:event_EliminarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
    window.setVisible(false);
    window.dispose();
    }//GEN-LAST:event_CerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JComboBox<String> Tipos;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
