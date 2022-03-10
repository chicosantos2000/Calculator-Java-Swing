
package calculadoraswing;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculadora = new javax.swing.JTextPane();
        botao0 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoCE = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoVezes = new javax.swing.JButton();
        botaoMenos = new javax.swing.JButton();
        botaoMais = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jScrollPane1.setViewportView(visorCalculadora);

        botao0.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao0.setText("0");
        botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao0MouseClicked(evt);
            }
        });
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botaoCE.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });
        botaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCEActionPerformed(evt);
            }
        });

        botaoDiv.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoDiv.setText("/");
        botaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivMouseClicked(evt);
            }
        });
        botaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivActionPerformed(evt);
            }
        });

        botaoVezes.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoVezes.setText("*");
        botaoVezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVezesMouseClicked(evt);
            }
        });
        botaoVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVezesActionPerformed(evt);
            }
        });

        botaoMenos.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoMenos.setText("-");
        botaoMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMenosMouseClicked(evt);
            }
        });
        botaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenosActionPerformed(evt);
            }
        });

        botaoMais.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoMais.setText("+");
        botaoMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMaisMouseClicked(evt);
            }
        });
        botaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisActionPerformed(evt);
            }
        });

        botaoIgual.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIgualMouseClicked(evt);
            }
        });
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseClicked
       String valor = visorCalculadora.getText();
       visorCalculadora.setText(valor + "2");
    }//GEN-LAST:event_botao2MouseClicked

    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCEMouseClicked
        visorCalculadora.setText("");
    }//GEN-LAST:event_botaoCEMouseClicked

    private void botaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCEActionPerformed

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao3MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "3");
    }//GEN-LAST:event_botao3MouseClicked

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao4MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "4");
    }//GEN-LAST:event_botao4MouseClicked

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao1MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "1");
    }//GEN-LAST:event_botao1MouseClicked

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao6MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "6");
    }//GEN-LAST:event_botao6MouseClicked

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao7MouseClicked
       String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "7");
    }//GEN-LAST:event_botao7MouseClicked

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao8MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "8");
    }//GEN-LAST:event_botao8MouseClicked

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao9MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "9");
    }//GEN-LAST:event_botao9MouseClicked

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao0MouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "0");
    }//GEN-LAST:event_botao0MouseClicked

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao5MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "5");
    }//GEN-LAST:event_botao5MouseClicked

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao5ActionPerformed

    private void botaoDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDivMouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "/"); 
    }//GEN-LAST:event_botaoDivMouseClicked

    private void botaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDivActionPerformed

    private void botaoVezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVezesMouseClicked
      String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "*");
    }//GEN-LAST:event_botaoVezesMouseClicked

    private void botaoVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVezesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVezesActionPerformed

    private void botaoMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMenosMouseClicked
           String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "-");
    }//GEN-LAST:event_botaoMenosMouseClicked

    private void botaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMenosActionPerformed

    private void botaoMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMaisMouseClicked
         String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "+"); 
    }//GEN-LAST:event_botaoMaisMouseClicked

    private void botaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMaisActionPerformed

    private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIgualMouseClicked
         String valor = visorCalculadora.getText();
        System.out.println(">>>"+valor);
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(valor);

        visorCalculadora.setText(resultado);
    }//GEN-LAST:event_botaoIgualMouseClicked

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoIgualActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoVezes;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane visorCalculadora;
    // End of variables declaration//GEN-END:variables
}
