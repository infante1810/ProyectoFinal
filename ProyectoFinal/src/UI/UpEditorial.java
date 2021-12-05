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
public class UpEditorial extends javax.swing.JPanel {

  
    boolean edit;
    String idus;
    /**
     * Creates new form Principal
     */
    public UpEditorial() {
        initComponents();
        
        edit = false;
    }
    
    public UpEditorial(String usid,String editorialId, String names, String countries, String emails, String states, String ustel) {
        initComponents();
        idus = usid;
      
        name.setText(names);
        country.setText(countries);
        email.setText(emails);
        
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
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Registrar nuevo Editorial");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

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

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 50));

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
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Pais");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        country.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        country.setForeground(new java.awt.Color(102, 102, 102));
        country.setText("Ingrese Pais");
        country.setBorder(null);
        country.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                countryMousePressed(evt);
            }
        });
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });
        add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Email");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("Ingrese email");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailMousePressed(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(34, 184, 207));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Nombre");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
       
       if(name.getText().equals("Ingrese el nombre"))
        name.setText("");
       if(country.getText().equals("") || country.getText() == null || country.getText().equals(" "))
        country.setText("Ingrese Pais");
       if(email.getText().equals("") || email.getText() == null || email.getText().equals(" "))
        email.setText("Ingrese email");
      
       
    }//GEN-LAST:event_nameMousePressed

    private void countryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryMousePressed
       
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(country.getText().equals("Ingrese Pais"))
        country.setText("");
       if(email.getText().equals("") || email.getText() == null || email.getText().equals(" "))
        email.setText("Ingrese email");
       
    }//GEN-LAST:event_countryMousePressed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMousePressed
       
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(email.getText().equals("Ingrese email"))
        email.setText("");
       if(country.getText().equals("") || country.getText() == null || country.getText().equals(" "))
        country.setText("Ingrese Pais");
       
      
    }//GEN-LAST:event_emailMousePressed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
    // REGISTRAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
        Editorial p1 = new Editorial();
        p1.setSize(750, 430);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                    
          
    }//GEN-LAST:event_buttonMousePressed

   void setColor(JPanel panel){
        panel.setBackground(new Color(21,170,191));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(16,152,173));
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField country;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
