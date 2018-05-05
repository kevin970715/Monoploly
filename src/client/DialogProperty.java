package client;

import java.awt.Image;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import server.Player;
import server.Square;

/**
 *
 * @author Flia Alcalá Castro
 */
public class DialogProperty extends javax.swing.JDialog {

    /**
     * Creates new form DialogProperty
     */
    MonopolyForm parent;
    ImageIcon img;
    Square carta;
    Player player;
    boolean x;
    
    public DialogProperty(MonopolyForm parent, boolean modal, ImageIcon img, Square carta, Player player,boolean x) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.carta=carta;
        this.player=player;
        this.x=x;
        propertyName.setText(carta.getName());
        price.setText(String.valueOf(carta.getPrice()));
        if(carta.isHaveOwner())
            owner.setText(carta.getOwner());
        else
            owner.setText("none");
        propertyImg.setIcon(new ImageIcon(img.getImage().getScaledInstance(propertyImg.getWidth(), propertyImg.getHeight(), Image.SCALE_DEFAULT)));
        this.setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        propertyName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        owner = new javax.swing.JLabel();
        propertyImg = new javax.swing.JLabel();
        buyBtn = new javax.swing.JButton();
        close = new javax.swing.JButton();
        morgage = new javax.swing.JButton();
        quitMorgage = new javax.swing.JButton();
        buyHouse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Property Title");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property name:");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Owner:");

        propertyName.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        propertyName.setForeground(new java.awt.Color(255, 255, 255));
        propertyName.setText("San Luis Norte");

        price.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("$60");

        owner.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        owner.setForeground(new java.awt.Color(255, 255, 255));
        owner.setText("None");

        buyBtn.setBackground(new java.awt.Color(195, 194, 194));
        buyBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buyBtn.setText("Buy");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        morgage.setBackground(new java.awt.Color(195, 194, 194));
        morgage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        morgage.setText("Morgage");
        morgage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morgageActionPerformed(evt);
            }
        });

        quitMorgage.setBackground(new java.awt.Color(195, 194, 194));
        quitMorgage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        quitMorgage.setText("quit Morgage");
        quitMorgage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMorgageActionPerformed(evt);
            }
        });

        buyHouse.setBackground(new java.awt.Color(195, 194, 194));
        buyHouse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buyHouse.setText("Buy House");
        buyHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(propertyImg, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(propertyName)
                                    .addComponent(price)
                                    .addComponent(owner)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(quitMorgage)
                                .addGap(38, 38, 38)
                                .addComponent(buyHouse)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(morgage)
                        .addGap(52, 52, 52)
                        .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(close)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buyBtn, close});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(propertyName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(price))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(owner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertyImg, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyBtn)
                    .addComponent(close)
                    .addComponent(morgage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitMorgage)
                    .addComponent(buyHouse))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buyBtn, close});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
        try {
            parent.buyProperty(player.getName(), carta.getName());
        } catch (RemoteException ex) {
            Logger.getLogger(DialogProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_buyBtnActionPerformed

    private void morgageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morgageActionPerformed
        try {
            parent.morgage(carta.getName(), x);
        } catch (RemoteException ex) {
            Logger.getLogger(DialogProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_morgageActionPerformed

    private void buyHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyHouseActionPerformed
        try {
            parent.buyHouse(carta.getName());
        } catch (RemoteException ex) {
            Logger.getLogger(DialogProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buyHouseActionPerformed

    private void quitMorgageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMorgageActionPerformed
        try {
            parent.removeMorgage(carta.getName(), x);
        } catch (RemoteException ex) {
            Logger.getLogger(DialogProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_quitMorgageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyBtn;
    private javax.swing.JButton buyHouse;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton morgage;
    private javax.swing.JLabel owner;
    private javax.swing.JLabel price;
    private javax.swing.JLabel propertyImg;
    private javax.swing.JLabel propertyName;
    private javax.swing.JButton quitMorgage;
    // End of variables declaration//GEN-END:variables
}
