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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class instructor_b extends javax.swing.JFrame {
Connection con ;
Statement stmt;
int flag;
DefaultTableModel model;
    /**
     * Creates new form instructor_b
     */
    public instructor_b(String a,String b) {
        initComponents();
        show1();
        pUpdate.hide();
        disabled();
        lbl.setText(a.toUpperCase()+"'s Background");
      txtID.setText(b);
        setdata(b);
         pview.setVisible(false);
          pAdd.setOpaque(false);
        pUpdate.setOpaque(false);
        pview.setOpaque(false);
    }
void enabled()
{
    txtID.setEditable(true);
    txtName.setEditable(true);
    
     txtPhone.setEditable(true);
      txtEmail.setEditable(true);
      
}
void disabled()
{
    txtID.setEditable(false);
    txtName.setEditable(false);
  
    txtPhone.setEditable(false);
    txtEmail.setEditable(false);
       
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
void show1()
{
        delete2();
        DefaultTableModel model=(DefaultTableModel)tblstdID.getModel();

        try{
          OpenConnection();
        
           String query="Select id from instructor_b;";
           ResultSet rs=stmt.executeQuery(query);
           while(rs.next())
           {
             String BookID=rs.getString("id") ;
            
             model.addRow(new Object[] {BookID});
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
     void delete2()
{
    DefaultTableModel model=(DefaultTableModel)tblstdID.getModel();
    int rows=model.getRowCount();
    if (rows>0)
    {
        for (int i=0;i<rows;i++)
        {
            model.removeRow(0);
        }
    }
}
   void clear()
{
    txtID.setText("");
    txtName.setText("");
 
    txtPhone.setText("");
    txtEmail.setText("");
    lbldate.setText("");
    
} 
   void delete1()
{
    int rows=model.getRowCount();
    if (rows>0){
        for (int i=0;i<rows;i++){
            model.removeRow(0);
        }
    }
}
   void setdata(String h)
    {
        try
        {
            OpenConnection();

             String query="Select * from instructor_b where id="+h+";";
             ResultSet rs=stmt.executeQuery(query);
             if(rs.next())
             {
                 txtID.setText(rs.getString("id"));
                 txtName.setText(rs.getString("address").toUpperCase());
                
                 lbldate.setText(rs.getString("join_date"));
                 txtPhone.setText(rs.getString("exp"));
                 txtEmail.setText(rs.getString("salary"));
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstdID = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbDate = new javax.swing.JComboBox();
        txtPhone = new javax.swing.JTextField();
        cbmonth = new javax.swing.JComboBox();
        cbYear = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pview = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pUpdate = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pAdd = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instructor ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 140, 24));

        tblstdID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InstructorID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblstdID);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 105, 150));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Joining");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 150, -1));

        cbDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dd", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateActionPerformed(evt);
            }
        });
        getContentPane().add(cbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        txtPhone.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 177, -1));

        cbmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mm", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmonthActionPerformed(evt);
            }
        });
        getContentPane().add(cbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yyyy", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        getContentPane().add(cbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        txtName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 177, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 110, -1));

        txtEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 177, -1));

        txtID.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 177, -1));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 140, 23));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salary");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 90, -1));

        pview.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pviewLayout = new javax.swing.GroupLayout(pview);
        pview.setLayout(pviewLayout);
        pviewLayout.setHorizontalGroup(
            pviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap())
        );
        pviewLayout.setVerticalGroup(
            pviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(pview, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        pUpdate.setBackground(new java.awt.Color(0, 0, 0));

        btnUpdate.setBackground(new java.awt.Color(153, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 51, 51));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 153, 255));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 51, 51));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pUpdateLayout = new javax.swing.GroupLayout(pUpdate);
        pUpdate.setLayout(pUpdateLayout);
        pUpdateLayout.setHorizontalGroup(
            pUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(48, 48, 48)
                .addComponent(btnCancel)
                .addGap(97, 97, 97))
        );
        pUpdateLayout.setVerticalGroup(
            pUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUpdateLayout.createSequentialGroup()
                .addGroup(pUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(pUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 340, 40));

        pAdd.setBackground(new java.awt.Color(0, 0, 0));

        add.setBackground(new java.awt.Color(153, 153, 255));
        add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 51, 51));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 153, 255));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 51, 51));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(153, 153, 255));
        btnDel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 51, 51));
        btnDel.setText("DELETE");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(153, 153, 255));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 51, 51));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClose1.setBackground(new java.awt.Color(153, 153, 255));
        btnClose1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(255, 51, 51));
        btnClose1.setText("VIEW");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAddLayout = new javax.swing.GroupLayout(pAdd);
        pAdd.setLayout(pAddLayout);
        pAddLayout.setHorizontalGroup(
            pAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddLayout.createSequentialGroup()
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDel)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addGap(18, 18, 18)
                .addComponent(btnClose1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pAddLayout.setVerticalGroup(
            pAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddLayout.createSequentialGroup()
                .addGroup(pAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(btnEdit)
                    .addComponent(btnDel)
                    .addComponent(btnClose)
                    .addComponent(btnClose1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 530, 50));

        lbl.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 570, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/manage/yoga-and-pineal-gland-stability-and-ecstasy-20160212_SLH_0066-e.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1640, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDateActionPerformed

    private void cbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmonthActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if ((txtID.getText()).compareTo("")!=0 && (txtName.getText()).compareTo("")!=0 &&  (txtPhone.getText()).compareTo("")!=0 && (txtEmail.getText()).compareTo("")!=0 && (cbDate.getSelectedItem())!="" && (cbmonth.getSelectedItem())!="" && (cbYear.getSelectedItem())!=""  ){
                OpenConnection();

                String d=cbYear.getSelectedItem()+"/"+cbmonth.getSelectedItem()+"/"+cbDate.getSelectedItem();
                String y=null;

                if(flag==1)
                {
                    String query="insert into instructor_b values ("+Integer.parseInt(txtID.getText())+",'"+txtName.getText()+"',"+Double.parseDouble(txtPhone.getText())+",'"+d+"','"+txtEmail.getText()+ "');";
                    stmt.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Record Updated!");
                }
                else if(flag==2)
                {
                    String query="update instructor_b set gname='"+txtName.getText()+"',address='"+txtPhone.getText()+"',join_date='"+d+",exp='"+txtEmail.getText()+"' where id="+txtID.getText()+";";
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Record Modified!");
                }

                stmt.close();
                con.close();
            } else {
                JOptionPane.showMessageDialog(null, "Fields Empty");

            }

            pUpdate.setVisible(false);
            pAdd.setVisible(true);

            clear();
            disabled();
            show1();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        pAdd.setVisible(true);
        pUpdate.setVisible(false);
         pview.setVisible(false);

        clear();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        clear();
        pUpdate.setVisible(true);
        pAdd.setVisible(false);
 pview.setVisible(false);
        enabled();
        flag=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        String y=JOptionPane.showInputDialog("Enter the instructor ID to modify");
        setdata(y);
        pUpdate.setVisible(true);
        pAdd.setVisible(false);
 pview.setVisible(false);
        enabled();
        flag=2;
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String x=JOptionPane.showInputDialog("Enter the instructor ID to Delete background");
        setdata(x);
        int ans=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete background?");
        if (ans==JOptionPane.YES_OPTION)
        {
            try
            {
                OpenConnection();

                String query="Delete from instructor_b where id=" + x + ";";
                stmt.executeUpdate(query);

                stmt.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Record Deleted!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error in connectivity");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Record Not Deleted!");
        }
        show1();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        lbl.setText("BACKGROUND");
        String y=JOptionPane.showInputDialog("Enter the instructor ID to VIEW background");
        setdata(y);
        pUpdate.setVisible(false);
        pAdd.setVisible(false);
         pview.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         pview.setVisible(false);
        pAdd.setVisible(true);
        pUpdate.setVisible(false);
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(instructor_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructor_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructor_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructor_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbDate;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JComboBox cbmonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbldate;
    private javax.swing.JPanel pAdd;
    private javax.swing.JPanel pUpdate;
    private javax.swing.JPanel pview;
    private javax.swing.JTable tblstdID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
