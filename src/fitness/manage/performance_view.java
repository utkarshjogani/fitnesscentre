/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fitness.manage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author user
 */
public class performance_view extends javax.swing.JFrame {
JLabel pic;
    Timer tm;
    int x = 0;
    
    String[] list = {
                      "C:\\Users\\user\\Desktop\\awards pictures\\464333-416674-sonu-nigam-indian-singer-awesome-images-wallpaper-0d707.jpg",//0
                      "C:\\Users\\user\\Desktop\\awards pictures\\banner2.jpg",//1
                      "C:\\Users\\user\\Desktop\\awards pictures\\banner3.jpg",//2
                      "C:\\Users\\user\\Desktop\\awards pictures\\barathanatiyam-Jatiswaram.jpg",//3
                      "C:\\Users\\user\\Desktop\\awards pictures\\maxresdefault (1).jpg",//4
                      "C:\\Users\\user\\Desktop\\awards pictures\\maxresdefault (2).jpg",//5
                      "C:\\Users\\user\\Desktop\\awards pictures\\maxresdefault (3).jpg",//6
                      "C:\\Users\\user\\Desktop\\awards pictures\\maxresdefault (4).jpg",//7
                      "C:\\Users\\user\\Desktop\\awards pictures\\maxresdefault.jpg",//8
                      "C:\\Users\\user\\Desktop\\awards pictures\\nawab-1.jpg",//9
                      "C:\\Users\\user\\Desktop\\awards pictures\\PBD_2017_opening_ceremony.jpg"//10
                    };
    /**
     * Creates new form performance_view
     */
    public performance_view() {
        super("Java SlideShow");
        initComponents();
         pic = new JLabel();
        pic.setBounds(0, 0, 1352, 700);
        JButton b=new JButton();
        b.setBounds(60,70,70,70);
        
         tm = new Timer(1500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1920, 1080);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    
   
 public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(performance_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(performance_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(performance_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(performance_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new performance_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
