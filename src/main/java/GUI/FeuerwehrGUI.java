package GUI;

import BL.FeuerwehrModel;
import BL.UserModel;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FeuerwehrGUI extends javax.swing.JFrame {

    FeuerwehrModel fm = new FeuerwehrModel();
    UserModel um = new UserModel();

    public FeuerwehrGUI() {
        initComponents();
        listLog.setModel(fm);
        listLog.setComponentPopupMenu(pmLog);

        listUser.setModel(um);
        listUser.setComponentPopupMenu(pmUsers);
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
        pmUsers = new javax.swing.JPopupMenu();
        miSaveUserLocal = new javax.swing.JMenuItem();
        miLoadUserLocal = new javax.swing.JMenuItem();
        miSaveUserDB = new javax.swing.JMenuItem();
        miLoadUserDB = new javax.swing.JMenuItem();
        miAdd = new javax.swing.JMenuItem();
        miFilter = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLog = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUser = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listGesamt = new javax.swing.JList();

        miSaveLocal.setText("Local speichern");
        miSaveLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveLocalActionPerformed(evt);
            }
        });
        pmLog.add(miSaveLocal);

        miLoadLocal.setText("Locale Datei laden");
        miLoadLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadLocalActionPerformed(evt);
            }
        });
        pmLog.add(miLoadLocal);

        miSaveDB.setText("in Datenbank speichern");
        miSaveDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveDBActionPerformed(evt);
            }
        });
        pmLog.add(miSaveDB);

        miLoadDB.setText("von Datenbank laden");
        miLoadDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadDBActionPerformed(evt);
            }
        });
        pmLog.add(miLoadDB);

        miStart.setText("Einsatz starten");
        miStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStartActionPerformed(evt);
            }
        });
        pmLog.add(miStart);

        miEnd.setText("Einsatz beenden");
        miEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEndActionPerformed(evt);
            }
        });
        pmLog.add(miEnd);

        miSaveUserLocal.setText("Datei local speichern");
        miSaveUserLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveUserLocalActionPerformed(evt);
            }
        });
        pmUsers.add(miSaveUserLocal);

        miLoadUserLocal.setText("Locale Datei laden");
        miLoadUserLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadUserLocalActionPerformed(evt);
            }
        });
        pmUsers.add(miLoadUserLocal);

        miSaveUserDB.setText("in Datenbank speichern");
        pmUsers.add(miSaveUserDB);

        miLoadUserDB.setText("von Datenbank laden");
        miLoadUserDB.setToolTipText("");
        pmUsers.add(miLoadUserDB);

        miAdd.setText("Benutzer hinzufügen");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        pmUsers.add(miAdd);

        miFilter.setText("nach Einsatzzeit filtern");
        pmUsers.add(miFilter);

        miDelete.setText("Benutzer löschen");
        miDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteActionPerformed(evt);
            }
        });
        pmUsers.add(miDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listLog);

        jScrollPane2.setViewportView(listUser);

        jLabel1.setText("Benutzer:");

        jLabel2.setText("Einsätze:");

        jLabel3.setText("Gesamteinsatzzeit von den Feuerwehren:");

        jScrollPane3.setViewportView(listGesamt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSaveUserLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveUserLocalActionPerformed
        um.save();
    }//GEN-LAST:event_miSaveUserLocalActionPerformed

    private void miLoadLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadLocalActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Philipp\\Desktop");
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            fm.load(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_miLoadLocalActionPerformed

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        UserDialog dialog = new UserDialog(this, true);
        dialog.setVisible(true);

        if (dialog.isOk()) {
            um.addUser(dialog.getU());
        }
    }//GEN-LAST:event_miAddActionPerformed

    private void miSaveLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveLocalActionPerformed
        fm.save();
    }//GEN-LAST:event_miSaveLocalActionPerformed

    private void miSaveDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miSaveDBActionPerformed

    private void miLoadDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miLoadDBActionPerformed

    private void miStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miStartActionPerformed

    private void miEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miEndActionPerformed

    private void miLoadUserLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadUserLocalActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Philipp\\Desktop");
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            um.load(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_miLoadUserLocalActionPerformed

    private void miDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteActionPerformed
        int j = JOptionPane.showConfirmDialog(this, "Wollen Sie das wirklich löschen?", "Achtung!", WIDTH, WIDTH);
        if (j == JOptionPane.YES_OPTION) {
            int i = listUser.getSelectedIndex();
            um.delete(i);
        }
    }//GEN-LAST:event_miDeleteActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuerwehrGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listGesamt;
    private javax.swing.JList listLog;
    private javax.swing.JList listUser;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miEnd;
    private javax.swing.JMenuItem miFilter;
    private javax.swing.JMenuItem miLoadDB;
    private javax.swing.JMenuItem miLoadLocal;
    private javax.swing.JMenuItem miLoadUserDB;
    private javax.swing.JMenuItem miLoadUserLocal;
    private javax.swing.JMenuItem miSaveDB;
    private javax.swing.JMenuItem miSaveLocal;
    private javax.swing.JMenuItem miSaveUserDB;
    private javax.swing.JMenuItem miSaveUserLocal;
    private javax.swing.JMenuItem miStart;
    private javax.swing.JPopupMenu pmLog;
    private javax.swing.JPopupMenu pmUsers;
    // End of variables declaration//GEN-END:variables
}
