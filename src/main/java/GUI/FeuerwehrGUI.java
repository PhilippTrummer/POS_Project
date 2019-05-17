package GUI;

import BL.FirefightersModel;
import BL.Firefighters;
import Threads.Duration;
import java.awt.Color;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FeuerwehrGUI extends javax.swing.JFrame {

    private FirefightersModel fm = new FirefightersModel();
    private Duration d;

    public FeuerwehrGUI() {
        initComponents();
        panelDuration.setLayout(new GridLayout(1, 1));
        panelDuration.setBackground(Color.black);

        listLog.setModel(fm);
        listLog.setComponentPopupMenu(pmLog);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmLog = new javax.swing.JPopupMenu();
        miSaveLocal = new javax.swing.JMenuItem();
        miLoadLocal = new javax.swing.JMenuItem();
        miSaveDB = new javax.swing.JMenuItem();
        miLoadDB = new javax.swing.JMenuItem();
        miStart = new javax.swing.JMenuItem();
        miEnd = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLog = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTotal = new javax.swing.JList();
        panelDuration = new javax.swing.JPanel();

        miSaveLocal.setText("save local");
        miSaveLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveLocalActionPerformed(evt);
            }
        });
        pmLog.add(miSaveLocal);

        miLoadLocal.setText("load local");
        miLoadLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadLocalActionPerformed(evt);
            }
        });
        pmLog.add(miLoadLocal);

        miSaveDB.setText("save in database");
        miSaveDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveDBActionPerformed(evt);
            }
        });
        pmLog.add(miSaveDB);

        miLoadDB.setText("load from database");
        miLoadDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadDBActionPerformed(evt);
            }
        });
        pmLog.add(miLoadDB);

        miStart.setText("Einsatz starten");
        miStart.setActionCommand("start operation");
        miStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStartActionPerformed(evt);
            }
        });
        pmLog.add(miStart);

        miEnd.setText("stop operation");
        miEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEndActionPerformed(evt);
            }
        });
        pmLog.add(miEnd);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listLog);

        jLabel2.setText("Operations:");

        jLabel3.setText("Total operation duration of the firefighters:");

        jScrollPane3.setViewportView(listTotal);

        javax.swing.GroupLayout panelDurationLayout = new javax.swing.GroupLayout(panelDuration);
        panelDuration.setLayout(panelDurationLayout);
        panelDurationLayout.setHorizontalGroup(
            panelDurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDurationLayout.setVerticalGroup(
            panelDurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(panelDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miLoadLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadLocalActionPerformed
        JFileChooser chooser = new JFileChooser("D:");
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            fm.load(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_miLoadLocalActionPerformed

    private void miSaveLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveLocalActionPerformed
        fm.save();
    }//GEN-LAST:event_miSaveLocalActionPerformed

    private void miSaveDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveDBActionPerformed
        try {
            fm.saveFeuerwehrToDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(FeuerwehrGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miSaveDBActionPerformed

    private void miLoadDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadDBActionPerformed
        try {
            fm.loadFeuerwehrFromDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(FeuerwehrGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miLoadDBActionPerformed

    private void miStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStartActionPerformed
        panelDuration.setLayout(new GridLayout(1, 1));
        panelDuration.setBackground(Color.black);

        d = new Duration();
        panelDuration.add(d);
        new Thread(d).start();
    }//GEN-LAST:event_miStartActionPerformed

    private void miEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEndActionPerformed
        d.setOperation(false);
        String type = JOptionPane.showInputDialog(this, "Please enter the operation type.");
        String firefighters = JOptionPane.showInputDialog(this, "Please enter the name of the firefighter station.");
        System.out.println(d.getDiff());
        //listLog.add(new Firefighters(firefighters, type, d.getDiff()));
    }//GEN-LAST:event_miEndActionPerformed

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
            java.util.logging.Logger.getLogger(FeuerwehrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeuerwehrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeuerwehrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeuerwehrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuerwehrGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listLog;
    private javax.swing.JList listTotal;
    private javax.swing.JMenuItem miEnd;
    private javax.swing.JMenuItem miLoadDB;
    private javax.swing.JMenuItem miLoadLocal;
    private javax.swing.JMenuItem miSaveDB;
    private javax.swing.JMenuItem miSaveLocal;
    private javax.swing.JMenuItem miStart;
    private javax.swing.JPanel panelDuration;
    private javax.swing.JPopupMenu pmLog;
    // End of variables declaration//GEN-END:variables
}
