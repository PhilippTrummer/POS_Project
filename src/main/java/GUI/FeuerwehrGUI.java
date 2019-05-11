package GUI;

import BL.FeuerwehrBL;
import javax.swing.JFileChooser;

public class FeuerwehrGUI extends javax.swing.JFrame {

    FeuerwehrBL bl = new FeuerwehrBL();
    
    public FeuerwehrGUI() {
        initComponents();
        listLog.setModel(bl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miAdd = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        miChange = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLog = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUser = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btImportDB = new javax.swing.JButton();
        btImportLocal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listGesamt = new javax.swing.JList();
        btStart = new javax.swing.JButton();
        btEnd = new javax.swing.JButton();
        btSaveLocal = new javax.swing.JButton();
        btSaveDB = new javax.swing.JButton();

        miAdd.setText("jMenuItem1");
        jPopupMenu1.add(miAdd);

        miDelete.setText("jMenuItem1");
        jPopupMenu1.add(miDelete);

        miChange.setText("jMenuItem1");
        jPopupMenu1.add(miChange);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listLog);

        jScrollPane2.setViewportView(listUser);

        jLabel1.setText("Benutzer:");

        jLabel2.setText("Einsätze:");

        jLabel3.setText("Gesamteinsatzzeit von den Feuerwehren:");

        btImportDB.setText("Datei von Datenbank importieren");
        btImportDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImportDBActionPerformed(evt);
            }
        });

        btImportLocal.setText("Datei local importieren");
        btImportLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImportLocalActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listGesamt);

        btStart.setText("Einsatz starten");

        btEnd.setText("Einsatz beenden");

        btSaveLocal.setText("Local Speichern");

        btSaveDB.setText("In Datenbank speichern");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btImportLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btImportDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btSaveLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSaveDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(btStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSaveDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSaveLocal)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btImportDB)
                    .addComponent(btStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btImportLocal)
                    .addComponent(btEnd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btImportDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImportDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btImportDBActionPerformed

    private void btImportLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImportLocalActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Philipp\\Desktop");
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            bl.load(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_btImportLocalActionPerformed

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
    private javax.swing.JButton btEnd;
    private javax.swing.JButton btImportDB;
    private javax.swing.JButton btImportLocal;
    private javax.swing.JButton btSaveDB;
    private javax.swing.JButton btSaveLocal;
    private javax.swing.JButton btStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listGesamt;
    private javax.swing.JList listLog;
    private javax.swing.JList listUser;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miChange;
    private javax.swing.JMenuItem miDelete;
    // End of variables declaration//GEN-END:variables
}
