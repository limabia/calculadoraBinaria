package calculabin;

public class CalculaBinUI extends javax.swing.JFrame {

    public CalculaBinUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tela = new javax.swing.JTextPane();
        tres = new javax.swing.JButton();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        start = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(tela);

        tres.setText("3");
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });

        um.setText("1");
        um.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umMouseClicked(evt);
            }
        });
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        dois.setText("2");
        dois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doisMouseClicked(evt);
            }
        });

        igual.setText("=");
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        soma.setText("+");
        soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                somaMouseClicked(evt);
            }
        });

        cinco.setText("5");
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });

        quatro.setText("4");
        quatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quatroMouseClicked(evt);
            }
        });

        sete.setText("7");
        sete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seteMouseClicked(evt);
            }
        });

        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        seis.setText("6");
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });

        oito.setText("8");
        oito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oitoMouseClicked(evt);
            }
        });

        nove.setText("9");
        nove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noveMouseClicked(evt);
            }
        });

        virgula.setText(".");
        virgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virgulaMouseClicked(evt);
            }
        });

        start.setText("CE");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        subtracao.setText("-");
        subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtracaoMouseClicked(evt);
            }
        });

        multiplicacao.setText("*");
        multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicacaoMouseClicked(evt);
            }
        });

        divisao.setText("/");
        divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisaoMouseClicked(evt);
            }
        });

        apagar.setText("apagar");
        apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apagarMouseClicked(evt);
            }
        });

        sair.setText("sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 72, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umActionPerformed

    private void umMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umMouseClicked
        String valor = tela.getText() + um.getText();
        tela.setText(valor);
    }//GEN-LAST:event_umMouseClicked

    private void doisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doisMouseClicked
         String valor = tela.getText() + dois.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_doisMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        String valor = tela.getText() + tres.getText();
        tela.setText(valor);
    }//GEN-LAST:event_tresMouseClicked

    private void quatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatroMouseClicked
        String valor = tela.getText() + quatro.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_quatroMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
       String valor = tela.getText() + cinco.getText();
       tela.setText(valor);
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        String valor = tela.getText() + seis.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_seisMouseClicked

    private void seteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seteMouseClicked
        String valor = tela.getText() + sete.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_seteMouseClicked

    private void oitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oitoMouseClicked
        String valor = tela.getText() + oito.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_oitoMouseClicked

    private void noveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noveMouseClicked
        String valor = tela.getText() + nove.getText();
        tela.setText(valor); 
    }//GEN-LAST:event_noveMouseClicked

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        String valor = tela.getText() + zero.getText();
        tela.setText(valor);
    }//GEN-LAST:event_zeroMouseClicked

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        tela.setText("");
    }//GEN-LAST:event_startMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        String conta = tela.getText();
        System.out.println(">>>"+conta);
        // TODO enviar calculo para o calcula bin e retornar resultado
        String resultado = "resultado = 0";
        tela.setText(resultado);
    }//GEN-LAST:event_igualMouseClicked

    private void somaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseClicked
       String valor = tela.getText() + soma.getText();
        tela.setText(valor);
    }//GEN-LAST:event_somaMouseClicked

    private void subtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtracaoMouseClicked
        String valor = tela.getText() + subtracao.getText();
        tela.setText(valor);
    }//GEN-LAST:event_subtracaoMouseClicked

    private void multiplicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacaoMouseClicked
        String valor = tela.getText() + multiplicacao.getText();
        tela.setText(valor);
    }//GEN-LAST:event_multiplicacaoMouseClicked

    private void divisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoMouseClicked
        String valor = tela.getText() + divisao.getText();
        tela.setText(valor);
    }//GEN-LAST:event_divisaoMouseClicked

    private void apagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apagarMouseClicked
        tela.setText("");
    }//GEN-LAST:event_apagarMouseClicked

    private void virgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virgulaMouseClicked
        String valor = tela.getText() + virgula.getText();
        tela.setText(valor);
    }//GEN-LAST:event_virgulaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculaBinUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculaBinUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculaBinUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculaBinUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculaBinUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculaBinUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton cinco;
    private javax.swing.JButton divisao;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton sair;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton soma;
    private javax.swing.JButton start;
    private javax.swing.JButton subtracao;
    private javax.swing.JTextPane tela;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton virgula;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
