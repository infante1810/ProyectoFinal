package UI;


import java.awt.Color;
import javax.swing.JPanel;
import static UI.Dashboard.content;
import java.awt.BorderLayout;
import dataaccess.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import defaultPackage.*;

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
        nuevo2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        nuevo2.setBackground(new java.awt.Color(16, 152, 173));
        nuevo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo2MousePressed(evt);
            }
        });
        nuevo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        nuevo2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(nuevo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 395, 80, -1));

        edit.setBackground(new java.awt.Color(16, 152, 173));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        edit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 395, 80, -1));

        delete.setBackground(new java.awt.Color(16, 152, 173));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Borrar");
        delete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 395, 80, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Tipo", "Autores", "ISBN", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 760, 300));
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
        // Abrir sección
        UpBooks p1 = new UpBooks();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel3MousePressed

    private void nuevo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MouseEntered

    private void nuevo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MouseExited

    private void nuevo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MousePressed
       
    }//GEN-LAST:event_nuevo2MousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        setColor(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        resetColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(bid.getText().equals("") || bid.getText() == null || bid.getText().equals(" "))
            bid.setText("Ingrese el nombre del libro a buscar");
    }//GEN-LAST:event_jTable1MousePressed
    // BORRAR
    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
       
    }//GEN-LAST:event_deleteMousePressed

    // EDITAR
    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
       
    }//GEN-LAST:event_editMousePressed
    // BUSCAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
         String busqueda = bid.getText();
         buscarLibros(busqueda);
    }//GEN-LAST:event_buttonMousePressed

    private void bidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidMouseClicked
        if(bid.getText().equals("Ingrese el nombre del libro a buscar"))
        bid.setText("");
    }//GEN-LAST:event_bidMouseClicked

    private void nuevo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MouseClicked
    
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
            i.getTitulo(),i.getTipoRecurso(),i.getEditorial(),i.getAutores(),i.getIsbn(),i.isActivo()
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
    private javax.swing.JPanel button;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel nuevo2;
    // End of variables declaration//GEN-END:variables
}
