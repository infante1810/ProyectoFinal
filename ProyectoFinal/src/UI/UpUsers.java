/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static UI.Dashboard.content;
/**
 *
 * @author a
 */
public class UpUsers extends javax.swing.JPanel {

  
    boolean edit;
    String idus;
    /**
     * Creates new form Principal
     */
    public UpUsers() {
        initComponents();
        
        edit = false;
    }
    
    public UpUsers(String usid, String usname, String usap1, String usap2, String usdom, String ustel) {
        initComponents();
        
        idus = usid;
        name.setText(usname);
        ap.setText(usap1);
        gender.setText(usap2);
        idCarrera.setText(usdom);
        nameCarrera.setText(ustel);
        edit = true;
        jLabel1.setText("Guardar");
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
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        nameCarrera = new javax.swing.JTextField();
        idCarrera = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        ap = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Registrar nuevo Estudiante");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Carrera");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Id Carrera");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        nameCarrera.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nameCarrera.setForeground(new java.awt.Color(102, 102, 102));
        nameCarrera.setText("Ingrese nombre de carrera");
        nameCarrera.setBorder(null);
        nameCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameCarreraMousePressed(evt);
            }
        });
        nameCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCarreraActionPerformed(evt);
            }
        });
        add(nameCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 260, 30));

        idCarrera.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        idCarrera.setForeground(new java.awt.Color(102, 102, 102));
        idCarrera.setText("Ingrese ID carrera");
        idCarrera.setBorder(null);
        idCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idCarreraMousePressed(evt);
            }
        });
        idCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCarreraActionPerformed(evt);
            }
        });
        add(idCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 260, 30));

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
        jLabel1.setText("Registrar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Matricula");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Ingrese el nombre");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Apellido ");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        ap.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ap.setForeground(new java.awt.Color(102, 102, 102));
        ap.setText("Ingrese el apellido");
        ap.setBorder(null);
        ap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apMousePressed(evt);
            }
        });
        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apActionPerformed(evt);
            }
        });
        add(ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Genero");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(102, 102, 102));
        gender.setText("Genero");
        gender.setBorder(null);
        gender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                genderMousePressed(evt);
            }
        });
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Nombres");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        Id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Id.setForeground(new java.awt.Color(102, 102, 102));
        Id.setText("Ingrese Matricula");
        Id.setBorder(null);
        Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdMousePressed(evt);
            }
        });
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Fecha de nacimiento");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("dd/mm/yyyy");
        date.setBorder(null);
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void nameCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameCarreraActionPerformed

    private void idCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idCarreraMousePressed
       
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(idCarrera.getText().equals("Ingrese ID carrera"))
        idCarrera.setText("");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
    }//GEN-LAST:event_idCarreraMousePressed

    private void nameCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameCarreraMousePressed
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(nameCarrera.getText().equals("Ingrese nombre de carrera"))
        nameCarrera.setText("");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
    }//GEN-LAST:event_nameCarreraMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        if(name.getText().equals("Ingrese el nombre"))
        name.setText("");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
    }//GEN-LAST:event_nameMousePressed

    private void apMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apMousePressed
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap.getText().equals("Ingrese el apellido"))
        ap.setText("");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
    }//GEN-LAST:event_apMousePressed

    private void apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apActionPerformed

    private void genderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genderMousePressed
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(gender.getText().equals("Genero"))
        gender.setText("");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
    }//GEN-LAST:event_genderMousePressed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void idCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCarreraActionPerformed
    // REGISTRAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
        Users p1 = new Users();
        p1.setSize(750, 430);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                    
          
    }//GEN-LAST:event_buttonMousePressed

    private void IdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdMousePressed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMousePressed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(date.getText().equals("dd/mm/yyyy"))
        date.setText("");
       if(Id.getText().equals("") || Id.getText() == null || Id.getText().equals(" "))
        Id.setText("Ingrese Matricula");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
    }//GEN-LAST:event_dateMouseClicked

    private void IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdMouseClicked
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(Id.getText().equals("Ingrese Matricula"))
        Id.setText("");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("dd/mm/yyyy");
       if(gender.getText().equals("") || gender.getText() == null || gender.getText().equals(" "))
        gender.setText("Genero");
       if(ap.getText().equals("") || ap.getText() == null || ap.getText().equals(" "))
        ap.setText("Ingrese el apellido");
       if(idCarrera.getText().equals("") || idCarrera.getText() == null || idCarrera.getText().equals(" "))
        idCarrera.setText("Ingrese ID carrera");
       if(nameCarrera.getText().equals("") || nameCarrera.getText() == null || nameCarrera.getText().equals(" "))
        nameCarrera.setText("Ingrese nombre de carrera");
    }//GEN-LAST:event_IdMouseClicked

   void setColor(JPanel panel){
        panel.setBackground(new Color(21,170,191));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(16,152,173));
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField ap;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField date;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField idCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameCarrera;
    // End of variables declaration//GEN-END:variables
}