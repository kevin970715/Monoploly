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
        jPanel1.setBackground(new Color(34, 139, 34));
    }

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
        jPanel1 = new javax.swing.JPanel();
        tossDiceBtn = new javax.swing.JButton();
        movePlayerBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        turn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordZone = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Choose your piece:");

        figurePlayer.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        figurePlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Carretilla", "Buque de guerra", "Vehículo", "Dedal", "Zapato antiguo", "Perro terrier", "Sombrero de copa", "Plancha" }));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Login");

        logOutBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logOutBtn.setText("Logout");

        startGameBtn.setBackground(new java.awt.Color(204, 0, 0));
        startGameBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        startGameBtn.setForeground(new java.awt.Color(255, 255, 255));
        startGameBtn.setText("PLAY");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        tossDiceBtn.setBackground(new java.awt.Color(0, 0, 0));
        tossDiceBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tossDiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        tossDiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.png"))); // NOI18N
        tossDiceBtn.setText("Toss Dice");
        tossDiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tossDiceBtnActionPerformed(evt);
            }
        });

        movePlayerBtn.setBackground(new java.awt.Color(0, 0, 0));
        movePlayerBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        movePlayerBtn.setForeground(new java.awt.Color(255, 255, 255));
        movePlayerBtn.setText("Move piece");
        movePlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movePlayerBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Players / Money");

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sombrero de copa , 1500" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        turn.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        turn.setForeground(new java.awt.Color(0, 0, 153));
        turn.setText("Turn: Sombrero de copa");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Record");

        recordZone.setEditable(false);
        recordZone.setBackground(new java.awt.Color(240, 240, 240));
        recordZone.setColumns(20);
        recordZone.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        recordZone.setLineWrap(true);
        recordZone.setRows(5);
        recordZone.setText("Sombrero de copa bought \"San Luis Norte\" for $60.");
        jScrollPane2.setViewportView(recordZone);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(turn)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movePlayerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tossDiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tossDiceBtn)
                .addGap(18, 18, 18)
                .addComponent(movePlayerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(figurePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logOutBtn)))
                        .addGap(26, 26, 26)
                        .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableroMonopoly, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(connectHostBtn)
                                    .addComponent(jLabel3)
                                    .addComponent(figurePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2)
                                    .addComponent(logOutBtn)))
                            .addComponent(startGameBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableroMonopoly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed
        ImageIcon imagenTablero = new ImageIcon("src/img/tableroMonopoly.jpg");
        Icon tablero= new ImageIcon(imagenTablero.getImage().getScaledInstance(tableroMonopoly.getWidth(), tableroMonopoly.getHeight(), Image.SCALE_DEFAULT));
        tableroMonopoly.setIcon(tablero);
    }//GEN-LAST:event_startGameBtnActionPerformed

    private void tossDiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tossDiceBtnActionPerformed
        ImageIcon dLeft = new ImageIcon("src/img/One.png");
        ImageIcon dRight = new ImageIcon("src/img/Two.png");
        DialogTossDices dialog = new DialogTossDices(this, true, dLeft, dRight);
        dialog.getContentPane().setBackground(new Color(1, 2, 6));
        dialog.getContentPane().setBackground(new Color(34, 139, 34));
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_tossDiceBtnActionPerformed

    private void movePlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movePlayerBtnActionPerformed
        ImageIcon img = new ImageIcon("src/img/SLN.png");
        DialogProperty dialog = new DialogProperty(this, true, img);
        dialog.getContentPane().setBackground(new Color(1, 2, 6));
        dialog.getContentPane().setBackground(new Color(34, 139, 34));
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_movePlayerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton movePlayerBtn;
    private javax.swing.JTextArea recordZone;
    private javax.swing.JButton startGameBtn;
    private javax.swing.JLabel tableroMonopoly;
    private javax.swing.JButton tossDiceBtn;
    private javax.swing.JLabel turn;
    // End of variables declaration//GEN-END:variables
}
