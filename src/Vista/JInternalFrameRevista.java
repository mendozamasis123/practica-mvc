/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.DAORevista;
import Modelo.Revista;
import java.sql.Time;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JInternalFrameRevista extends javax.swing.JInternalFrame {

    
    public JInternalFrameRevista() {
        initComponents();
        this.jTextNumero.setEnabled(false);
    }
    public void limpiarCampos() {
    jTextNumero.setText("");
    jTextTitulo.setText("");
    jTextAyo.setText("");
    jTextIssn.setText("");
    jTextPrecio.setText("");
    jTextHoraventa.setText("");
}
    public void obtenerDatos() {
    List<Revista> revistas = new DAORevista().ObtenerDatos();
    DefaultTableModel modelo = new DefaultTableModel();
    String[] columnas = 
    {"Numero", "titulo", "año", "Issn", "Precio", "Horaventa"};

    modelo.setColumnIdentifiers(columnas);
    
    
    for (Revista re : revistas) {
        String[] renglon = {
            Integer.toString(re.getNumero()),
            re.getTitulo(),
            Integer.toString(re.getAyo()),
            re.getIssn(),
            Float.toString(re.getPrecio()),
            re.getHoraventa().toString()
        };
        modelo.addRow(renglon);
    }
    jTableRevista.setModel(modelo);
}
    public void actualizarAutor() {
    int num = Integer.parseInt(this.jTextNumero.getText());
    String tit = this.jTextTitulo.getText();
    int ayo = Integer.parseInt(this.jTextAyo.getText());
    String iss = this.jTextIssn.getText();
    float pre = Float.parseFloat(this.jTextPrecio.getText());
    Time hrv = Time.valueOf(this.jTextHoraventa.getText());

    DAORevista dao = new DAORevista();
    int res = dao.Actualizar(num, tit, ayo, iss, pre, hrv);
    if (res == 1) {
        JOptionPane.showMessageDialog(rootPane, "Revista Actualizado!");
    } else {
        JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");
    }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextAyo = new javax.swing.JTextField();
        jTextIssn = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextHoraventa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBAgregarR = new javax.swing.JButton();
        jBEditarR = new javax.swing.JButton();
        jBactualizarR = new javax.swing.JButton();
        jBBorrarR = new javax.swing.JButton();
        jBBuscarR = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRevista = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar / Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 153, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Numero");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Titulo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Issn");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Horaventa");

        jTextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIssn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAyo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextHoraventa, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextAyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextIssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextHoraventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transacciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 153, 255))); // NOI18N

        jBAgregarR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBAgregarR.setForeground(new java.awt.Color(153, 153, 255));
        jBAgregarR.setText("Agregar");
        jBAgregarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarRActionPerformed(evt);
            }
        });

        jBEditarR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEditarR.setForeground(new java.awt.Color(153, 153, 255));
        jBEditarR.setText("Editar");
        jBEditarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarRActionPerformed(evt);
            }
        });

        jBactualizarR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBactualizarR.setForeground(new java.awt.Color(153, 153, 255));
        jBactualizarR.setText("Actualizar");
        jBactualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarRActionPerformed(evt);
            }
        });

        jBBorrarR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBBorrarR.setForeground(new java.awt.Color(153, 153, 255));
        jBBorrarR.setText("Borrar");
        jBBorrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarRActionPerformed(evt);
            }
        });

        jBBuscarR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBBuscarR.setForeground(new java.awt.Color(153, 153, 255));
        jBBuscarR.setText("Buscar");
        jBBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregarR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBEditarR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jBactualizarR))
                    .addComponent(jBBuscarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBorrarR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextBuscar))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAgregarR)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEditarR)
                    .addComponent(jBactualizarR))
                .addGap(28, 28, 28)
                .addComponent(jBBorrarR)
                .addGap(28, 28, 28)
                .addComponent(jBBuscarR)
                .addGap(18, 18, 18)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revistas Registradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 153, 255))); // NOI18N

        jTableRevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTableRevista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTituloActionPerformed
        
    }//GEN-LAST:event_jTextTituloActionPerformed

    private void jBAgregarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarRActionPerformed

        String num = jTextTitulo.getText();

        int ayo = Integer.parseInt(jTextAyo.getText());
        String iss = jTextIssn.getText();
        Float pre = Float.parseFloat(jTextPrecio.getText());
        String hrv = jTextHoraventa.getText();

        if (num.contentEquals("") || ayo <= 0 ||
            iss.contentEquals("") || pre <= 0 ||
            hrv.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
        } else {
            try {
                // Convierte de String a Date
                Time hrs = Time.valueOf(hrv); // Usar formato de fecha: yyyy-mm-dd
                // Objeto para acceder al método Insertar de DAOAutor
                Revista rev = new DAORevista().Insertar(num, ayo, iss, pre, hrs);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }

            obtenerDatos(); // llama a este método para que se muestre el nuevo registro en la tabla del formulario
            limpiarCampos();
        }
    }//GEN-LAST:event_jBAgregarRActionPerformed

    private void jBEditarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarRActionPerformed

        int fila = this.jTableRevista.getSelectedRow(); // Se obtiene #fila seleccionada
        if (fila == -1) {
            JOptionPane.showMessageDialog
        (rootPane, "Seleccione un registro de la tabla");
        } else { // Se toma cada campo de la tabla del registro seleccionado y se asigna a una variable
            try {
                int num = Integer.parseInt((String) 
                        this.jTableRevista.getValueAt(fila, 0).toString());
                String tit = (String) this.jTableRevista.getValueAt(fila, 1);
                int ayo = Integer.parseInt((String) 
                        this.jTableRevista.getValueAt(fila, 2).toString());
                String iss = (String) this.jTableRevista.getValueAt(fila, 3);
                float pre = Float.parseFloat((String) 
                        this.jTableRevista.getValueAt(fila, 4).toString());
                Time hrv = Time.valueOf((String) 
                        this.jTableRevista.getValueAt(fila, 5).toString());

                // Se ubican en las cajas de textos los datos capturados de la tabla
                jTextNumero.setText("" + num);
                jTextTitulo.setText(tit);
                jTextAyo.setText(String.valueOf(ayo));
                jTextIssn.setText(iss);
                jTextPrecio.setText(String.valueOf(pre));
                jTextHoraventa.setText(String.valueOf(hrv));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBEditarRActionPerformed

    private void jBactualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarRActionPerformed
        actualizarAutor();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jBactualizarRActionPerformed

    private void jBBorrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarRActionPerformed
        // TODO add your handling code here:
        int fila = this.jTableRevista.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog
        (rootPane, "Seleccione un registro de la tabla");
        } else {
            int id = Integer.parseInt((String) 
                    this.jTableRevista.getValueAt(fila, 0).toString());
            DAORevista dao = new DAORevista();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jBBorrarRActionPerformed

    private void jBBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarR;
    private javax.swing.JButton jBBorrarR;
    private javax.swing.JButton jBBuscarR;
    private javax.swing.JButton jBEditarR;
    private javax.swing.JButton jBactualizarR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRevista;
    private javax.swing.JTextField jTextAyo;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextHoraventa;
    private javax.swing.JTextField jTextIssn;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
