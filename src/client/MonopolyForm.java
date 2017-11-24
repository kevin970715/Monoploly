package client;

import interfaces.MonopolyInterface;
import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import server.Player;

/**
 *
 * @author Flia Alcalá Castro
 */
public class MonopolyForm extends javax.swing.JFrame {

    String src;
    int x;
    int y;
    int actSquare;
    int finSquare;
    String name;
    MonopolyInterface mi;
    DefaultListModel model;
    ThreadClient thread;
    int face1,face2;
    public MonopolyForm() {
        initComponents();
        logInBtn.setEnabled(false);
        logOutBtn.setEnabled(false);
        startGameBtn.setEnabled(false);
        tossDiceBtn.setEnabled(false);
        movePlayerBtn.setEnabled(false);
        this.getContentPane().setBackground(new Color(1, 2, 6));
        jPanel1.setBackground(new Color(34, 139, 34));
        pieceImg.setFocusable(true);
        model = new DefaultListModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        connectHostBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        piecePlayer = new javax.swing.JComboBox<>();
        logInBtn = new javax.swing.JButton();
        pieceImg = new javax.swing.JLabel();
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
        setTitle("Monopoly");
        setMinimumSize(new java.awt.Dimension(1300, 740));
        setPreferredSize(new java.awt.Dimension(1300, 740));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Welcome to Monopoly!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Host:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        host.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        host.setMinimumSize(new java.awt.Dimension(6, 25));
        getContentPane().add(host, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 47, 120, -1));

        connectHostBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        connectHostBtn.setForeground(new java.awt.Color(0, 0, 204));
        connectHostBtn.setText("Connect");
        connectHostBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectHostBtnActionPerformed(evt);
            }
        });
        getContentPane().add(connectHostBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 46, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Choose your piece:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 48, -1, -1));

        piecePlayer.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        getContentPane().add(piecePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 47, 140, -1));

        logInBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logInBtn.setForeground(new java.awt.Color(0, 153, 0));
        logInBtn.setText("Login");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 46, -1, -1));

        pieceImg.setToolTipText("");
        pieceImg.setMaximumSize(new java.awt.Dimension(20, 20));
        pieceImg.setMinimumSize(new java.awt.Dimension(20, 20));
        pieceImg.setPreferredSize(new java.awt.Dimension(20, 20));
        getContentPane().add(pieceImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 532, 35, 35));
        getContentPane().add(tableroMonopoly, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 1010, 628));

        logOutBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logOutBtn.setText("Logout");
        getContentPane().add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 46, -1, -1));

        startGameBtn.setBackground(new java.awt.Color(204, 0, 0));
        startGameBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        startGameBtn.setForeground(new java.awt.Color(255, 255, 255));
        startGameBtn.setText("PLAY");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startGameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 30, 170, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addPlayers(ArrayList<Player> players){
        model.removeAllElements();
        for (Player player : players)
            model.addElement(player.getName()+", "+player.getMoney().getMoney());
        jList1.setModel(model);
    }

    public void showTurn(String t){
        turn.setText(t);
    }
       
    public void addMessaje(String msj){
        if(!msj.equals("")){
            msj=recordZone.getText()+"\n"+msj;
            recordZone.setText(msj);
        }
    }
    
    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed
        try {
            if(mi.startGame())
                startGameBtn.setEnabled(false);
        } catch (RemoteException ex) {
            Logger.getLogger(MonopolyForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startGameBtnActionPerformed

    private void tossDiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tossDiceBtnActionPerformed
        try {
            face1=mi.tosseDice();
            face2=mi.tosseDice();
            if(mi.getTurn().equals(name))
                movePlayerBtn.setEnabled(true);        
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
        String nameImg = null;
        String nameImg2 = null; 
        switch(face1){
            case 1: nameImg="One"; break;
            case 2: nameImg="Two"; break;
            case 3: nameImg="Three"; break;
            case 4: nameImg="Four"; break;
            case 5: nameImg="Five"; break;
            case 6: nameImg="Six"; break;
        }
        switch(face2){
            case 1: nameImg2="One"; break;
            case 2: nameImg2="Two"; break;
            case 3: nameImg2="Three"; break;
            case 4: nameImg2="Four"; break;
            case 5: nameImg2="Five"; break;
            case 6: nameImg2="Six"; break;           
        }
        ImageIcon dLeft = new ImageIcon("src/img/"+nameImg+".png");
        ImageIcon dRight = new ImageIcon("src/img/"+nameImg2+".png");
        DialogTossDices dialog = new DialogTossDices(this, true, dLeft, dRight);
        dialog.getContentPane().setBackground(new Color(1, 2, 6));
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_tossDiceBtnActionPerformed

    private void movePlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movePlayerBtnActionPerformed
        actSquare = 38;//Posición actual de la ficha en el tablero (Square), se obtiene con getCurrentPosition del player
        finSquare = 4;//Posición final de la ficha en el tablero (Square), se obtiene con moverFicha del player
        x=pieceImg.getX();
        y=pieceImg.getY();
        
        while (actSquare < finSquare) {
            if(actSquare >= 0 && actSquare < 10){
                x = (x-120)+35;
            } else if (actSquare >= 10 && actSquare < 20){
                y = (y-18)-35;
            } else if (actSquare >= 20 && actSquare < 30){
                x = (x+120)-35;
            } else if (actSquare >= 30 && actSquare <= 39){
                y = (y+18)+35;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MonopolyForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            pieceImg.setLocation(x, y);
            JOptionPane.showMessageDialog(null, "X="+x+ " Y="+y, src, JOptionPane.WARNING_MESSAGE);
            actSquare++;
        }
        
        if(actSquare > finSquare){
            int posAux = 40-actSquare;
            
            while(posAux >= 0){
                if(posAux == 0){
                    actSquare=0;
                    break;
                }
                y = (y+18)+35;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MonopolyForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                pieceImg.setLocation(x, y);
                posAux--;
            }
            
            while (actSquare < finSquare) {
                if(actSquare >= 0 && actSquare < 10){
                    x = (x-120)+35;
                } else if (actSquare >= 10 && actSquare < 20){
                    y = (y-18)-35;
                } else if (actSquare >= 20 && actSquare < 30){
                    x = (x+120)-35;
                } else if (actSquare >= 30 && actSquare <= 39){
                    y = (y+18)+35;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MonopolyForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                pieceImg.setLocation(x, y);
                JOptionPane.showMessageDialog(null, "X="+x+ " Y="+y, src, JOptionPane.WARNING_MESSAGE);
                actSquare++;
            }
        }
        
        int numCarta=0;
        String carta=null;
        try{
            numCarta=mi.movePlayer(name, face1, face2);
        } catch (RemoteException ex) {
            Logger.getLogger(MonopolyForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch(numCarta){
            case 1:  carta="SLN"; break;
            case 3:  carta="SLS"; break;
            case 6:  carta="FE";  break;
            case 8:  carta="FN";  break;
            case 9:  carta="FS";  break;
            case 11: carta="SJS"; break;
            case 13: carta="SJE"; break;
            case 14: carta="SJN"; break;
            case 16: carta="NS";  break;
            case 18: carta="NE";  break;
            case 19: carta="NN";  break;
            case 21: carta="ME";  break;
            case 23: carta="MS";  break;
            case 24: carta="MN";  break;
            case 26: carta="SFE"; break;
            case 27: carta="SFS"; break;
            case 29: carta="SFN"; break;
            case 31: carta="CE";  break;
            case 32: carta="CS";  break;
            case 34: carta="CN";  break;
            case 37: carta="BAN"; break;
            case 39: carta="BAS"; break;
            case 5: case 15: case 25: case 35:
            //trenes
                break;
        }
        if(carta!=null){
            ImageIcon img = new ImageIcon("src/img/"+carta+".png");
            DialogProperty dialog = new DialogProperty(this, true, img);
            dialog.getContentPane().setBackground(new Color(1, 2, 6));
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        }
        movePlayerBtn.setEnabled(false);
    }//GEN-LAST:event_movePlayerBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        if(piecePlayer.getSelectedItem().equals("Select one")){
            JOptionPane.showMessageDialog(null, "No has seleccionado una pieza.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            name=(String) piecePlayer.getSelectedItem();
            try {
                if(mi.logIn(name)){
                    if (name.equals(mi.getPlayers().get(0).getName()))
                        startGameBtn.setEnabled(true);
                    else
                        recordZone.setText("Espere a iniciar el juego");
                    src="src/img/"+name+".png";
                    logOutBtn.setEnabled(true);
                    tossDiceBtn.setEnabled(true);
                    mi.removePossiblesNames(name);
                    logInBtn.setEnabled(false);
                    thread = new ThreadClient(this,mi,name);
                    thread.start();
                    ImageIcon imagenTablero = new ImageIcon("src/img/tableroMonopoly.jpg");
                    Icon tablero= new ImageIcon(imagenTablero.getImage().getScaledInstance(tableroMonopoly.getWidth(), tableroMonopoly.getHeight(), Image.SCALE_DEFAULT));
                    tableroMonopoly.setIcon(tablero);
                    ImageIcon imagePiece = new ImageIcon(src);
                    Icon piece= new ImageIcon(imagePiece.getImage().getScaledInstance(pieceImg.getWidth(), pieceImg.getHeight(), Image.SCALE_DEFAULT));
                    pieceImg.setIcon(piece);
                }else{
                    JOptionPane.showMessageDialog(null, "El nombre ya fue escogido. Seleccion otro.", "Escoge otro nombre", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void connectHostBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectHostBtnActionPerformed
        try {
            String hostName=host.getText();
            mi=(MonopolyInterface) Naming.lookup("rmi://"+hostName+"/monopoly");
            logInBtn.setEnabled(true);
            connectHostBtn.setEnabled(false);
            for(String pName: mi.getPossiblesNames())
                piecePlayer.addItem(pName);
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_connectHostBtnActionPerformed

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
    private javax.swing.JTextField host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton movePlayerBtn;
    private javax.swing.JLabel pieceImg;
    private javax.swing.JComboBox<String> piecePlayer;
    private javax.swing.JTextArea recordZone;
    private javax.swing.JButton startGameBtn;
    private javax.swing.JLabel tableroMonopoly;
    private javax.swing.JButton tossDiceBtn;
    private javax.swing.JLabel turn;
    // End of variables declaration//GEN-END:variables
}
