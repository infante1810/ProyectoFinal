package UI;

import java.sql.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import dataaccess.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Antonio
 */
public class Lendings extends javax.swing.JPanel {

    private static final String DB_URL = 
        "jdbc:mysql://localhost:3306/biblioteca";
    
    private static final String DB_USERNAME = "root";
    
    private static final String DB_PASSWORD = "root";
    
    
    /**
     * Creates new form Principal
     */
    public Lendings() {
        initComponents();
        
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
        Text3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        book_id = new javax.swing.JTextField();
        book_return = new javax.swing.JTextField();
        folio = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Fecha de devolucion");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Pr??stamo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("ISBN");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Matricula Estudiante");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 10, 350));

        jSeparator4.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 260, 10));

        book_id.setForeground(new java.awt.Color(102, 102, 102));
        book_id.setText("Ingrese el ISBN del Libro a prestar");
        book_id.setBorder(null);
        book_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book_idMousePressed(evt);
            }
        });
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 260, 30));

        book_return.setForeground(new java.awt.Color(102, 102, 102));
        book_return.setText("yyyy-MM-dd HH:mm");
        book_return.setBorder(null);
        book_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book_returnMousePressed(evt);
            }
        });
        book_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_returnActionPerformed(evt);
            }
        });
        add(book_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 260, 30));

        folio.setForeground(new java.awt.Color(102, 102, 102));
        folio.setText("Ingrese la matricula del estudiante");
        folio.setBorder(null);
        folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folioMousePressed(evt);
            }
        });
        folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioActionPerformed(evt);
            }
        });
        add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 260, 30));

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
        jLabel1.setText("Prestar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageUI/prestamo.gif"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void folioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folioMousePressed
       if(folio.getText().equals("Ingrese la matricula del estudiante"))
        folio.setText("");
       if(book_id.getText().equals("") || book_id.getText() == null || book_id.getText().equals(" "))
        book_id.setText("Ingrese el ISBN del Libro a prestar");
       if(book_return.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            book_return.setText("(\"yyyy-MM-dd HH:mm");
    }//GEN-LAST:event_folioMousePressed

    private void book_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_idMousePressed
        if(book_id.getText().equals("Ingrese el ISBN del Libro a prestar"))
            book_id.setText("");
        if(folio.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            folio.setText("Ingrese la matricula del estudiante");
        if(book_return.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            book_return.setText("(\"yyyy-MM-dd HH:mm");
    }//GEN-LAST:event_book_idMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // PRESTAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
       
        try (Connection connection = getConnection()) {
            
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String book = book_id.getText();
            int matricula = 0;
            String fechaEntregaStr = book_return.getText();
            LocalDateTime fechaEntrega = null;
            
            try {
                fechaEntrega = LocalDateTime.parse(fechaEntregaStr, formatoFecha);
                matricula = Integer.parseInt(folio.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Datos introducidos invalidos, verifique la matricula o la fecha");
                return;
            }
            
            String sqlVerificarPrestamoExistente =
                    "SELECT * FROM prestamos_v WHERE (alumno_matricula = ?) AND (libro_isbn = ?) AND (fecha_devuelto IS NULL)";
            PreparedStatement stmtVerificarPrestamoExistente = connection.prepareStatement(sqlVerificarPrestamoExistente);
            stmtVerificarPrestamoExistente.setInt(1, matricula);
            stmtVerificarPrestamoExistente.setString(2, book);
            ResultSet rVerificarPrestamoExistente = stmtVerificarPrestamoExistente.executeQuery();
            if (rVerificarPrestamoExistente.next()) {
                JOptionPane.showMessageDialog(this, "Un mismo alumno no puede pedir dos libros iguales");
                return;
            }
            
            String sqlLibro = 
                    "SELECT * FROM biblioteca.libros_inventario_existencia_v WHERE (isbn = ?)";
            PreparedStatement stmtLibro = connection.prepareStatement(sqlLibro);
            stmtLibro.setString(1, book);
            ResultSet rLibro = stmtLibro.executeQuery();
            if (!rLibro.next()) {
                JOptionPane.showMessageDialog(this, "No se encontro el libro introducido");
                return;
            }
            if (rLibro.getInt("cantidad_en_inventario") == 0) {
                JOptionPane.showMessageDialog(
                        this, "El libro " + rLibro.getString("titulo") + " no esta disponible de momento");
                return;
            }
            
            String sqlAlumno = 
                    "SELECT * FROM biblioteca.alumnos_v WHERE matricula = ?";
            PreparedStatement stmtAlumno = connection.prepareStatement(sqlAlumno);
            stmtAlumno.setInt(1, matricula);
            ResultSet rAlumno = stmtAlumno.executeQuery();

            if (!rAlumno.next()) {
                JOptionPane.showMessageDialog(this, "No se encontro la matricula introducida");
                return;
            }
            
            String fechaStr = formatoFecha.format(LocalDateTime.now());
            LocalDateTime fechaHoy = LocalDateTime.parse(fechaStr, formatoFecha);
            
            PrestamoDao prestamoDao = new PrestamoDbDao(connection);
            
            Prestamo prestamo = new Prestamo();
            prestamo.setLibroInventarioId(rLibro.getInt("id"));
            prestamo.setAlumnoId(rAlumno.getInt("matricula"));
            prestamo.setFechaPrestamo(fechaHoy);
            prestamo.setFechaDebeDevolver(fechaEntrega);
            prestamo.setFechaDevuelto(null);
            int id = prestamoDao.insert(prestamo);
            JOptionPane.showMessageDialog(
                    this, "Prestamo del libro " + rLibro.getString("titulo") + " realizado con exito. Se tiene que devolver a dia " + fechaEntrega);
            
            String sqlLibroInv = 
                    "SELECT libro_inventario_id FROM prestamos WHERE id = ?";
            PreparedStatement stmtLibroInv = connection.prepareStatement(sqlLibroInv);
            stmtLibroInv.setInt(1, id);
            ResultSet rLibroInv = stmtLibroInv.executeQuery();
            rLibroInv.next();
            
            String sqlIdInv =
                    "SELECT id FROM libros_inventario WHERE (libro_id = ?) AND (disponible = 1) "
                    + "ORDER BY libro_id LIMIT 1";
            PreparedStatement stmtIdLibro = connection.prepareStatement(sqlIdInv);
            stmtIdLibro.setInt(1, rLibroInv.getInt("libro_inventario_id"));
            ResultSet rIdLibro = stmtIdLibro.executeQuery();
            rIdLibro.next();
            
            String sqlLibroPrestado =
                    "UPDATE libros_inventario SET disponible = 0 WHERE id = ?";
            PreparedStatement stmtLibroPrestado = connection.prepareStatement(sqlLibroPrestado);
            stmtLibroPrestado.setInt(1, rIdLibro.getInt("id"));
            stmtLibroPrestado.execute();
            
            

        }
        catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
        
    }//GEN-LAST:event_buttonMousePressed

    private void folioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folioActionPerformed

    private void book_returnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_returnMousePressed
         if(book_return.getText().equals("yyyy-MM-dd HH:mm"))
            book_return.setText("");
        if(folio.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            folio.setText("Ingrese la matricula del estudiante");
        if(book_id.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
            book_id.setText("Ingrese el ISBN del Libro a prestar");
    }//GEN-LAST:event_book_returnMousePressed

    private void book_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_returnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_returnActionPerformed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,170,191));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(16,152,173));
    }
    
    private static Connection getConnection() throws SQLException {
        //DriverManager.registerDriver(new OracleDriver());
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_return;
    private javax.swing.JPanel button;
    private javax.swing.JTextField folio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
