package client;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Flia Alcalá Castro
 */
public class DialogTossDices extends javax.swing.JDialog {

    /**
     * Creates new form DialogTossDices
     */
    MonopolyForm parent;
    
    public DialogTossDices(MonopolyForm parent, boolean modal, ImageIcon dLeft, ImageIcon dRight) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        diceLeft.setIcon(new ImageIcon(dLeft.getImage().getScaledInstance(diceLeft.getWidth(), diceLeft.getHeight(), Image.SCALE_DEFAULT)));
        diceRight.setIcon(new ImageIcon(dRight.getImage().getScaledInstance(diceRight.getWidth(), diceRight.getHeight(), Image.SCALE_DEFAULT)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diceLeft = new javax.swing.JLabel();
        diceRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dice result");
        setResizable(false);

        diceLeft.setForeground(new java.awt.Color(255, 255, 255));
        diceLeft.setText(" ");

        diceRight.setForeground(new java.awt.Color(255, 255, 255));
        diceRight.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diceLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(diceRight, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diceLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(diceRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diceLeft;
    private javax.swing.JLabel diceRight;
    // End of variables declaration//GEN-END:variables
}
