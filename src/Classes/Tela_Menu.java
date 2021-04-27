
package Classes;

public class Tela_Menu extends javax.swing.JFrame {

    public Tela_Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemMotoristas = new javax.swing.JMenuItem();
        jMenuItemVeiculos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMovimentecao = new javax.swing.JMenuItem();
        jMenuItemManutencao = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("CADASTRO");
        jMenu1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jMenuItemMotoristas.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItemMotoristas.setText("MOTORISTAS");
        jMenuItemMotoristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMotoristasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMotoristas);

        jMenuItemVeiculos.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItemVeiculos.setText("VEÍCULOS");
        jMenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVeiculosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVeiculos);

        jMenuBar1.add(jMenu1);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("REGISTROS");
        jMenu3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItem1.setText("MOVIMENTACÃO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItem2.setText("MANUTENÇÃO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("CONSULTA");
        jMenu2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jMenuItemMovimentecao.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItemMovimentecao.setText("MOVIMENTAÇÃO");
        jMenuItemMovimentecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovimentecaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemMovimentecao);

        jMenuItemManutencao.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItemManutencao.setText("MANUTENÇÃO");
        jMenuItemManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemManutencao);

        jMenuBar1.add(jMenu2);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("SAIR");
        jMenu4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jMenuItem3.setText("SAIR");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMotoristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMotoristasActionPerformed
        
        dispose();
        Tela_Motoristas x = new Tela_Motoristas();
        x.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemMotoristasActionPerformed

    private void jMenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVeiculosActionPerformed
        
        dispose();
        Tela_Veiculos x = new Tela_Veiculos();
        x.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemVeiculosActionPerformed

    private void jMenuItemMovimentecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovimentecaoActionPerformed
        dispose();
        Tela_Consulta_Movimentacao x = new Tela_Consulta_Movimentacao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemMovimentecaoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        Tela_Movimentacao x = new Tela_Movimentacao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        Tela_Manutencao x = new Tela_Manutencao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoActionPerformed
        dispose();
        Tela_Consulta_Manutencao x = new Tela_Consulta_Manutencao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemManutencaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemManutencao;
    private javax.swing.JMenuItem jMenuItemMotoristas;
    private javax.swing.JMenuItem jMenuItemMovimentecao;
    private javax.swing.JMenuItem jMenuItemVeiculos;
    // End of variables declaration//GEN-END:variables
}
