/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class bmi extends javax.swing.JFrame {
Connection con ;
Statement stmt;
int flag;
    /**
     * Creates new form bmi
     */
    public bmi() {
        initComponents();
        pan.setOpaque(false);
        btnag.hide();
    }
void OpenConnection()
 {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fitness?useSSL=false","root","utkarsh");
        stmt=con.createStatement();
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 }
void setdata_bmi_s(String h)
    {
        try
        {
            OpenConnection();

             String query="Select bmi from bmival where sid="+h+";";
             ResultSet rs=stmt.executeQuery(query);
             if(rs.next())
             {
                 String a=rs.getString("bmi");
                 lbl.setText("BMI="+a);
                 int x=Integer.parseInt(a);
                 if(x<19){
                     lbl1.setText("Its time for you to eat!");
                 }
                 else if(x>23){
                     lbl1.setText("Follow a diet and workout!");
                     lbl2.setText("ZUMBA & TRX");
                 }
                 else{
                     lbl1.setText("You are doing great!");
                     lbl2.setText("Go for PILATES ");
                 }
                 
               
                
             }
            rs.close();
            stmt.close();
            con.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
        try
        {
            OpenConnection();

             String quer="Select name from student where id="+h+";";
             ResultSet rs=stmt.executeQuery(quer);
             if(rs.next())
             {
                String a=rs.getString("name").toUpperCase();
                lbl3.setText("Hi "+a+",");
             }
                
             
             
            rs.close();
            stmt.close();
            con.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
} 
void setdata_bmi_i(String h)
    {
        try
        {
            OpenConnection();

             String query="Select bmi from bmival where iid="+h+";";
             ResultSet rs=stmt.executeQuery(query);
             if(rs.next())
             {
                String a=rs.getString("bmi");
                 lbl.setText("BMI="+a);
                 int x=Integer.parseInt(a);
                 if(x<19){
                     lbl1.setText("Its time for you to eat!");
                 }
                 else if(x>23){
                     lbl1.setText("See what you eat and workout!");
                      lbl2.setText("ZUMBA & TRX");
                 }
                 else{
                     lbl1.setText("You are doing great!");
                     lbl2.setText("Go for PILATES ");
                 }
               
                
             }
             
            rs.close();
            stmt.close();
            con.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
        try
        {
            OpenConnection();

             String quer="Select name from instructor where id="+h+";";
             ResultSet rs=stmt.executeQuery(quer);
             if(rs.next())
             {
                String a=rs.getString("name").toUpperCase();
                lbl3.setText("Hi "+a+",");
             }
                
             
             
            rs.close();
            stmt.close();
            con.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
        
} 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pan = new javax.swing.JPanel();
        btncal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtw = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        cdstudent = new javax.swing.JRadioButton();
        cdinst = new javax.swing.JRadioButton();
        lbl1 = new javax.swing.JLabel();
        btnag = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btnag1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan.setForeground(new java.awt.Color(255, 255, 255));

        btncal.setBackground(new java.awt.Color(51, 51, 51));
        btncal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btncal.setForeground(new java.awt.Color(255, 255, 255));
        btncal.setText("CALCULATE");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Height (in cm)");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weight (in kg)");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BMI Calculator");

        lbl.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(cdstudent);
        cdstudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cdstudent.setForeground(new java.awt.Color(255, 255, 255));
        cdstudent.setText("STUDENT");

        buttonGroup1.add(cdinst);
        cdinst.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cdinst.setForeground(new java.awt.Color(255, 255, 255));
        cdinst.setText("INSTRUCTOR");

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));

        btnag.setBackground(new java.awt.Color(51, 51, 51));
        btnag.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnag.setForeground(new java.awt.Color(255, 255, 255));
        btnag.setText("AGAIN");
        btnag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));

        btnag1.setBackground(new java.awt.Color(51, 51, 51));
        btnag1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnag1.setForeground(new java.awt.Color(255, 255, 255));
        btnag1.setText("CLOSE");
        btnag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnag1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                        .addComponent(btncal)
                        .addGap(24, 24, 24)
                        .addComponent(btnag)
                        .addGap(18, 18, 18)
                        .addComponent(btnag1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txth)
                            .addComponent(txtw, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
            .addGroup(panLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panLayout.createSequentialGroup()
                            .addComponent(cdstudent)
                            .addGap(18, 18, 18)
                            .addComponent(cdinst))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdstudent)
                    .addComponent(cdinst))
                .addGap(18, 18, 18)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnag, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnag1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 560));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\fitness pictures\\224a707cc9ee9857a2ebd50ff63b237a.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 417, 637));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/manage/texture_pattern_black_background_50469_3840x2400.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed
       try {
           if((cdstudent.getText())!="" && (cdinst.getText())!="" && (txth.getText())!= "" && (txtw.getText())!= "" )
       {OpenConnection();
           if(cdstudent.isSelected()){
                String y=JOptionPane.showInputDialog("Please enter the Student ID");
                String del="delete from bmival where sid="+y+";";
                     stmt.executeUpdate(del);
        String query="insert into bmival values ("+y+",NULL,"+txth.getText()+","+txtw.getText()+",NULL);";
                    stmt.executeUpdate(query);
                    
                    String proc="call bmical("+y+",NULL);";
                    stmt.executeUpdate(proc);
                    setdata_bmi_s(y);
               
           }
             if(cdinst.isSelected()){
                 String y=JOptionPane.showInputDialog("Please enter the Instructor ID");
                 String del="delete from bmival where iid="+y+";";
                     stmt.executeUpdate(del);
        String query="insert into bmival values (NULL,"+y+","+txth.getText()+","+txtw.getText()+",NULL);";
                    stmt.executeUpdate(query);
                    
                    String proc="call bmical(NULL,"+y+");";
                    stmt.executeUpdate(proc);
                    setdata_bmi_i(y);
             
             }
             btncal.hide();
             btnag.show();
       }
        
        
       else{
            JOptionPane.showMessageDialog(null, "Fields Empty");
       }
        
        
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncalActionPerformed

    private void btnagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagActionPerformed
       btnag.hide();
       btncal.show();
       txth.setText("");
       txtw.setText("");
         lbl.setText("");
         lbl1.setText("");
         lbl2.setText("");
         lbl3.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btnagActionPerformed

    private void btnag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnag1ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnag1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnag;
    private javax.swing.JButton btnag1;
    private javax.swing.JButton btncal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cdinst;
    private javax.swing.JRadioButton cdstudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JPanel pan;
    private javax.swing.JTextField txth;
    private javax.swing.JTextField txtw;
    // End of variables declaration//GEN-END:variables
}
