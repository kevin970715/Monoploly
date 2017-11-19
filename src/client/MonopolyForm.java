/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Flia Alcalá Castro
 */
public class MonopolyForm extends javax.swing.JFrame {

    /**
     * Creates new form MonopolyForm
     */
    public MonopolyForm() {
        initComponents();
        this.getContentPane().setBackground(new Color(1, 2, 6));
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
        jLabel2 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        connectHostBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        figurePlayer = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        tableroMonopoly = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        startGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 730));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Welcome to Monopoly!");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Host:");

        host.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        host.setMinimumSize(new java.awt.Dimension(6, 25));

        connectHostBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        connectHostBtn.setForeground(new java.awt.Color(0, 0, 204));
        connectHostBtn.setText("Connect");
        connectHostBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectHostBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Choose your piece:");

        figurePlayer.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        figurePlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Carretilla", "Buque de guerra", "Vehículo", "Dedal", "Zapato de estilo antiguo", "Perro Terrier escocés", "Sombrero de copa", "Plancha" }));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Login");

        logOutBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logOutBtn.setText("Logout");

        startGameBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        startGameBtn.setForeground(new java.awt.Color(204, 0, 0));
        startGameBtn.setText("PLAY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(connectHostBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(figurePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(logOutBtn)))
                        .addGap(63, 63, 63)
                        .addComponent(startGameBtn))
                    .addComponent(tableroMonopoly, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(connectHostBtn)
                                .addComponent(jLabel3)
                                .addComponent(figurePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(jLabel2))
                            .addComponent(logOutBtn)))
                    .addComponent(startGameBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableroMonopoly, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectHostBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectHostBtnActionPerformed
        ImageIcon imagenTablero = new ImageIcon("src/img/tableroMonopolyBien.jpg");
        Icon tablero= new ImageIcon(imagenTablero.getImage().getScaledInstance(tableroMonopoly.getWidth(), tableroMonopoly.getHeight(), Image.SCALE_DEFAULT));
        tableroMonopoly.setIcon(tablero);
    }//GEN-LAST:event_connectHostBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MonopolyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonopolyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonopolyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonopolyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonopolyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectHostBtn;
    private javax.swing.JComboBox<String> figurePlayer;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton startGameBtn;
    private javax.swing.JLabel tableroMonopoly;
    // End of variables declaration//GEN-END:variables
}
