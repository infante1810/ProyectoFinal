package UI;


import java.awt.Color;
import javax.swing.JPanel;
import static UI.Dashboard.content;
import java.awt.BorderLayout;
import dataaccess.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import defaultPackage.*;
import javax.swing.JOptionPane;

/**
 *
 * @author a
 */
public class BooksFrame extends javax.swing.JPanel {
    private Libro[] libroBusqueda;
    private Libro[] libros;
    /**
     * Creates new form Principal
     */
    public BooksFrame() {
        initComponents();
       consultarLibros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bid = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNuevo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Libros");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        bid.setForeground(new java.awt.Color(102, 102, 102));
        bid.setText("Ingrese el nombre del libro a buscar");
        bid.setBorder(null);
        bid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bidMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bidMousePressed(evt);
            }
        });
        add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        button.setBackground(new java.awt.Color(16, 152, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        btnDelete.setBackground(new java.awt.Color(16, 152, 173));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });
        btnDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Borrar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        btnDelete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 395, 80, -1));

        btnEdit.setBackground(new java.awt.Color(16, 152, 173));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });
        btnEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        btnEdit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 395, 80, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Tipo", "Autores", "ISBN", "Disponibles", "Editorial", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 300));

        btnNuevo.setBackground(new java.awt.Color(16, 152, 173));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevoMousePressed(evt);
            }
        });
        btnNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nuevo");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        btnNuevo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 395, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidMousePressed
       if(bid.getText().equals("Ingrese el nombre del libro a buscar"))
        bid.setText("");
    }//GEN-LAST:event_bidMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
       
    }//GEN-LAST:event_jLabel3MousePressed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow() != -1){
            int idSeleccionado = (int) tblModel.getValueAt(jTable1.getSelectedRow(), 6);
            System.out.println(idSeleccionado);
            try(Connection connection = App.getConnection()){
                LibroDao libroDao = App.getLibroDao(connection);
                libroDao.delete(idSeleccionado);
            }
            catch(Exception e){
            }
        }else{
            JOptionPane.showMessageDialog(
                this, "Seleccione Un Archivo", "Archivo No Seleccionado",
                JOptionPane.INFORMATION_MESSAGE);
        }

        consultarLibros();
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMouseExited

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(bid.getText().equals("") || bid.getText() == null || bid.getText().equals(" "))
            bid.setText("Ingrese el nombre del libro a buscar");
    }//GEN-LAST:event_jTable1MousePressed

    // EDITAR
    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow() != -1){
            
            int idSeleccionado = (int) tblModel.getValueAt(jTable1.getSelectedRow(), 6);
            String titulo =(String) tblModel.getValueAt(jTable1.getSelectedRow(), 0);; 
            int tipo = Integer.parseInt(String.valueOf(tblModel.getValueAt(jTable1.getSelectedRow(), 1)));
            String autores =(String) tblModel.getValueAt(jTable1.getSelectedRow(), 2);
            String isbn = (String) tblModel.getValueAt(jTable1.getSelectedRow(), 3); 
            int stock = Integer.parseInt(String.valueOf(tblModel.getValueAt(jTable1.getSelectedRow(), 4)));
            int editorial = Integer.parseInt(String.valueOf(tblModel.getValueAt(jTable1.getSelectedRow(), 5))); 
            
            boolean activo = false; 
            if(stock>0){
                activo = true; 
            }                      
             
            try{
                 
                 UpBooks p1 = new UpBooks(idSeleccionado,titulo, tipo, stock, editorial, autores, isbn, activo);
                 p1.setSize(750, 430);
                 p1.setLocation(0,0);
                 content.removeAll();
                 content.add(p1, BorderLayout.CENTER);
                 content.revalidate();
                 content.repaint();
            }
            catch(Exception e){   
            }
        }else{
           JOptionPane.showMessageDialog(
                    this, "Seleccione Un Archivo", "Archivo No Seleccionado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditMousePressed
    // BUSCAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
         String busqueda = bid.getText();
         buscarLibros(busqueda);
    }//GEN-LAST:event_buttonMousePressed

    private void bidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidMouseClicked
        if(bid.getText().equals("Ingrese el nombre del libro a buscar"))
        bid.setText("");
    }//GEN-LAST:event_bidMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMousePressed
         
         UpBooks p1 = new UpBooks();
         p1.setSize(750, 430);
         p1.setLocation(0,0);
         content.removeAll();
         content.add(p1, BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_btnNuevoMousePressed

   
    private void buscarLibros(String busqueda) {
        libroBusqueda = null;
        try (Connection connection = App.getConnection()) {
           LibroDao libroDao = App.getLibroDao(connection);
           libroBusqueda = libroDao.getByName(busqueda);
        } 
        catch (Exception ex) {
            System.out.println("Problema cargar Editorial1");
        }
        try{
            cargarTblLibrosBusqueda();
        }
        catch (Exception e){
            System.out.println("Problema cargarTBLEditoriales2");
        }
        
    }
    private void consultarLibros() {
        libros = null;
        try (Connection connection = App.getConnection()) {
            LibroDao libroDao = App.getLibroDao(connection);
            libros = libroDao.getAll();
        } 
        catch (Exception ex) {
            System.out.println("Problema cargar Libro");
        }
        try{
            cargarTblLibros();
        }
        catch (Exception e){
            System.out.println("Problema cargarTBLibros");
        }
    }
    private void cargarTblLibrosBusqueda() {
        
        DefaultTableModel tblModel = (
                DefaultTableModel)jTable1.getModel();
        
        while (tblModel.getRowCount() != 0) tblModel.removeRow(0);
        
        if (libroBusqueda == null) return;
        
        for (int i = 0; i < libroBusqueda.length; i++) {
            tblModel.insertRow(i, toRow(libroBusqueda[i]));
        }
        
    }
    
    private void cargarTblLibros() {
        
        DefaultTableModel tblModel = (
                DefaultTableModel)jTable1.getModel();
        
        while (tblModel.getRowCount() != 0) tblModel.removeRow(0);
        
        if (libros == null) return;
        
        for (int i = 0; i < libros.length; i++) {
            tblModel.insertRow(i, toRow(libros[i]));
        }
        
    }
    
    private Object[] toRow(Libro i) {
        return new Object[] {
            i.getTitulo(),i.getTipoRecurso(),i.getAutores(),i.getIsbn(),i.getStock(),i.getEditorial(), i.getId()
        };
    }
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,170,191));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(16,152,173));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField bid;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
