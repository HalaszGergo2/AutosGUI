
package main;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class AutoGUI extends javax.swing.JFrame {
    boolean beinditva = false;
    int valasz;
   
    
    public AutoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EsemenyTxt = new javax.swing.JTextArea();
        sldDefekt = new javax.swing.JSlider();
        lblDefekt = new javax.swing.JLabel();
        chbDefekt = new javax.swing.JCheckBox();
        btnReset = new javax.swing.JButton();
        spnPotkerek = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuBeindit = new javax.swing.JMenuItem();
        mnuLeallit = new javax.swing.JMenuItem();
        mnuTankol = new javax.swing.JMenuItem();
        mnuKerek = new javax.swing.JMenuItem();
        mnuMegy = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Autó események"));

        EsemenyTxt.setColumns(20);
        EsemenyTxt.setRows(5);
        EsemenyTxt.setMinimumSize(new java.awt.Dimension(10, 15));
        jScrollPane1.setViewportView(EsemenyTxt);

        sldDefekt.setValue(20);
        sldDefekt.setEnabled(false);
        sldDefekt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldDefektMouseReleased(evt);
            }
        });

        lblDefekt.setText("Esély defektre:");

        chbDefekt.setText("Lehet defekt");
        chbDefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDefektActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        spnPotkerek.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        spnPotkerek.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPotkerekStateChanged(evt);
            }
        });

        jLabel1.setText("Pótkerék:");

        jMenu1.setText("Autó parancsok");

        mnuBeindit.setText("Beindít");
        mnuBeindit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBeinditActionPerformed(evt);
            }
        });
        jMenu1.add(mnuBeindit);

        mnuLeallit.setText("Leállít");
        mnuLeallit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLeallitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLeallit);

        mnuTankol.setText("Tankol");
        mnuTankol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTankolActionPerformed(evt);
            }
        });
        jMenu1.add(mnuTankol);

        mnuKerek.setText("Kerékcsere");
        mnuKerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKerekActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKerek);

        mnuMegy.setText("Megy");
        mnuMegy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMegyActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMegy);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(chbDefekt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(sldDefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(lblDefekt)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDefekt)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sldDefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(spnPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbDefekt)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuBeinditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBeinditActionPerformed
        if(!beinditva){
            kiiras("Beindítod az autót?", "Az autót beindítottad!", "Nem inditottad be az autót!");
            beinditva = true;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Már be van indítva az autó!");
        }
    }//GEN-LAST:event_mnuBeinditActionPerformed

    private void mnuLeallitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLeallitActionPerformed
    if(beinditva){
        kiiras("Leállítod az autót?", "Az autó leállítva!", "Nem állítottad le az autót!");
        beinditva = false;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nincs beindítva az autó!");
        }
    }//GEN-LAST:event_mnuLeallitActionPerformed

    private void chbDefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDefektActionPerformed
        sldDefekt.setEnabled(chbDefekt.isSelected());
        lblDefekt.setText("Esély defektre: "+sldDefekt.getValue()+"%");
        
    }//GEN-LAST:event_chbDefektActionPerformed

    private void sldDefektMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldDefektMouseReleased
        lblDefekt.setText("Esély defektre: "+sldDefekt.getValue()+"%");
        EsemenyTxt.setText("Ennyi esélyed van defektet kapni: "+sldDefekt.getValue()+"%");
    }//GEN-LAST:event_sldDefektMouseReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        sldDefekt.setEnabled(false);
        sldDefekt.setValue(20);
        lblDefekt.setText("Esély defektre: ");
        chbDefekt.setSelected(false);
        spnPotkerek.setValue(0);
        EsemenyTxt.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void spnPotkerekStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPotkerekStateChanged
        EsemenyTxt.setText("A pótkerekeket beállítottad: "+spnPotkerek.getValue());
    }//GEN-LAST:event_spnPotkerekStateChanged

    private void mnuTankolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTankolActionPerformed
        if(!beinditva){
            kiiras("Meg szeretnéd tankolni a kocsit?", "Megtankoltad a kocsit!", "Nem történt tankolás");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nincs leállítva az autó!");
        }
    }//GEN-LAST:event_mnuTankolActionPerformed

    private void mnuKerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKerekActionPerformed
        valasz = JOptionPane.showConfirmDialog(rootPane, "Kereket cserélnél?");
        int potkerekSzam = (int)spnPotkerek.getValue();
        if(valasz == JOptionPane.YES_OPTION){
            if(potkerekSzam >= 1){
                spnPotkerek.setValue(potkerekSzam-1);
                EsemenyTxt.setText("Kereket cseréltél, felhasználtál 1 pótkereket");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Nincs pótkereked");
            }
        }else if(valasz == JOptionPane.NO_OPTION){
            EsemenyTxt.setText("Nem cseréltél kereket");
        }
        
    }//GEN-LAST:event_mnuKerekActionPerformed

    private void mnuMegyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMegyActionPerformed
        if(beinditva){
            JOptionPane.showMessageDialog(rootPane, "Mentél a kocsival!");
            EsemenyTxt.setText("Vroom Vroom");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Nincs beindítva az autó!");
        }
    }//GEN-LAST:event_mnuMegyActionPerformed
    private void kiiras(String kerdes, String igen, String nem) throws HeadlessException {
        valasz = JOptionPane.showConfirmDialog(rootPane, kerdes);
        if(valasz == JOptionPane.YES_OPTION){
            EsemenyTxt.setText(igen);
        }else if(valasz == JOptionPane.NO_OPTION){
            EsemenyTxt.setText(nem);
        }
    }
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
            java.util.logging.Logger.getLogger(AutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea EsemenyTxt;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chbDefekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDefekt;
    private javax.swing.JMenuItem mnuBeindit;
    private javax.swing.JMenuItem mnuKerek;
    private javax.swing.JMenuItem mnuLeallit;
    private javax.swing.JMenuItem mnuMegy;
    private javax.swing.JMenuItem mnuTankol;
    private javax.swing.JSlider sldDefekt;
    private javax.swing.JSpinner spnPotkerek;
    // End of variables declaration//GEN-END:variables
}
