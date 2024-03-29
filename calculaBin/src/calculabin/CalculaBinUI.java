package calculabin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculaBinUI extends javax.swing.JFrame implements KeyListener {

    // modos da calculadora
    private enum Modo {
        INTEIRO, FLOAT;
    }

    // operacoes possiveis de serem realizadas
    private enum Operacao {
        SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO;
    }
    // funcionalidades basicas e numeros de entrada
    private Numero num1, num2;
    private Operacao operacao;
    private Modo modo = Modo.INTEIRO;
    private boolean clear = false;

    public CalculaBinUI() {
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    // transforma o valor digitado em int ou em float de acordo com o modo escolhido
    private Numero converteNumero(String valor) {
        if ("".equals(valor)) {
            return null;
        }

        if (modo == Modo.INTEIRO) {
            return new IntBinario(Integer.parseInt(valor));
        } else {
            return new FloatBinario(Float.parseFloat(valor));
        }
    }

    // limpa a memoria da calculadora
    private void limpaMemoria() {
        tela.setText("");
        telaBin.setText("");
        num1 = null;
        num2 = null;
        operacao = null;
    }

    // para trocar de operacoes com int para operacoes com float
    private void trocaModo() {
        limpaMemoria();

        if (modo == Modo.INTEIRO) {
            modo = Modo.FLOAT;
            virgula.setEnabled(true);
            modoButton.setText("Modo Inteiro");
        } else {
            modo = Modo.INTEIRO;
            virgula.setEnabled(false);
            modoButton.setText("Modo Ponto Fluante");
        }
    }

    private void executa() {
        Numero resultado;

        try {
            if (operacao != null) {
                switch (operacao) {
                    case SOMA:
                        resultado = num1.soma(num2);
                        break;
                    case SUBTRACAO:
                        resultado = num1.subtracao(num2);
                        break;
                    case DIVISAO:
                        resultado = num1.divisao(num2)[0];
                        break;
                    case MULTIPLICACAO:
                        resultado = num1.multiplicacao(num2);
                        break;
                    default:
                        resultado = num2;
                }
            } else {
                resultado = num2;
            }

            tela.setText(resultado.paraStringDecimal());
            telaBin.setText(resultado.paraStringBinario());

            num1 = resultado;
            num2 = null;
            operacao = null;
        } catch (IllegalArgumentException e) {
            limpaMemoria();
            tela.setText("ERRO");
            telaBin.setText("");
        }

        clear = true;
    }

    void escreveDigito(String digito) {
        // limpa a tela apos realizar uma operacao
        if (clear) {
            tela.setText("");
            clear = false;
        }

        String valor = tela.getText() + digito;
        tela.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tela = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        telaBin = new javax.swing.JTextPane();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        start = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        modoButton = new javax.swing.JButton();
        sinalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        tela.setEditable(false);
        tela.setFocusable(false);
        jScrollPane1.setViewportView(tela);

        telaBin.setEditable(false);
        telaBin.setFocusable(false);
        jScrollPane2.setViewportView(telaBin);

        um.setText("1");
        um.setFocusable(false);
        um.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umMouseClicked(evt);
            }
        });

        dois.setText("2");
        dois.setFocusable(false);
        dois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doisMouseClicked(evt);
            }
        });

        tres.setText("3");
        tres.setFocusable(false);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });

        quatro.setText("4");
        quatro.setFocusable(false);
        quatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quatroMouseClicked(evt);
            }
        });

        cinco.setText("5");
        cinco.setFocusable(false);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });

        sete.setText("7");
        sete.setFocusable(false);
        sete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seteMouseClicked(evt);
            }
        });

        seis.setText("6");
        seis.setFocusable(false);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });

        oito.setText("8");
        oito.setFocusable(false);
        oito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oitoMouseClicked(evt);
            }
        });

        nove.setText("9");
        nove.setFocusable(false);
        nove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noveMouseClicked(evt);
            }
        });

        zero.setText("0");
        zero.setFocusable(false);
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        igual.setText("=");
        igual.setFocusable(false);
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        virgula.setText(".");
        virgula.setEnabled(false);
        virgula.setFocusable(false);
        virgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virgulaMouseClicked(evt);
            }
        });

        start.setText("CE");
        start.setFocusable(false);
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });

        soma.setText("+");
        soma.setFocusable(false);
        soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                somaMouseClicked(evt);
            }
        });

        subtracao.setText("-");
        subtracao.setFocusable(false);
        subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtracaoMouseClicked(evt);
            }
        });

        multiplicacao.setText("*");
        multiplicacao.setFocusable(false);
        multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicacaoMouseClicked(evt);
            }
        });

        divisao.setText("/");
        divisao.setFocusable(false);
        divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisaoMouseClicked(evt);
            }
        });

        apagar.setText("apagar");
        apagar.setFocusable(false);
        apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apagarMouseClicked(evt);
            }
        });

        sair.setText("sair");
        sair.setFocusable(false);
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        modoButton.setText("Modo Ponto Fluante");
        modoButton.setFocusable(false);
        modoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoButtonActionPerformed(evt);
            }
        });

        sinalButton.setText("+/-");
        sinalButton.setFocusable(false);
        sinalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinalButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(sinalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sinalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void umMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umMouseClicked
        escreveDigito("1");
    }//GEN-LAST:event_umMouseClicked

    private void doisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doisMouseClicked
        escreveDigito("2");
    }//GEN-LAST:event_doisMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        escreveDigito("3");
    }//GEN-LAST:event_tresMouseClicked

    private void quatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatroMouseClicked
        escreveDigito("4");
    }//GEN-LAST:event_quatroMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        escreveDigito("5");
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        escreveDigito("6");
    }//GEN-LAST:event_seisMouseClicked

    private void seteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seteMouseClicked
        escreveDigito("7");
    }//GEN-LAST:event_seteMouseClicked

    private void oitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oitoMouseClicked
        escreveDigito("8");
    }//GEN-LAST:event_oitoMouseClicked

    private void noveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noveMouseClicked
        escreveDigito("9");
    }//GEN-LAST:event_noveMouseClicked

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        escreveDigito("0");
    }//GEN-LAST:event_zeroMouseClicked

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        limpaMemoria();
    }//GEN-LAST:event_startMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        num2 = converteNumero(tela.getText());
        executa();
        operacao = null;
    }//GEN-LAST:event_igualMouseClicked

    private void somaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseClicked
        num2 = converteNumero(tela.getText());
        executa();
        operacao = Operacao.SOMA;
    }//GEN-LAST:event_somaMouseClicked

    private void subtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtracaoMouseClicked
        num2 = converteNumero(tela.getText());
        executa();
        operacao = Operacao.SUBTRACAO;
    }//GEN-LAST:event_subtracaoMouseClicked

    private void multiplicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacaoMouseClicked
        num2 = converteNumero(tela.getText());
        executa();
        operacao = Operacao.MULTIPLICACAO;
    }//GEN-LAST:event_multiplicacaoMouseClicked

    private void divisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoMouseClicked
        num2 = converteNumero(tela.getText());
        executa();
        operacao = Operacao.DIVISAO;
    }//GEN-LAST:event_divisaoMouseClicked

    private void apagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apagarMouseClicked
        tela.setText("");
    }//GEN-LAST:event_apagarMouseClicked

    private void virgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virgulaMouseClicked
        escreveDigito(".");
    }//GEN-LAST:event_virgulaMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt);
    }//GEN-LAST:event_formKeyPressed

    private void modoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoButtonActionPerformed
        trocaModo();
    }//GEN-LAST:event_modoButtonActionPerformed

    private void sinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinalButtonActionPerformed
        String texto = tela.getText();
        if (texto.startsWith("-")) {
            tela.setText(texto.substring(1));
        } else if (!texto.equals("")) {
            tela.setText("-" + texto);
        }
    }//GEN-LAST:event_sinalButtonActionPerformed

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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();

        switch (keyChar) {
            case '=':
                num2 = converteNumero(tela.getText());
                executa();
                operacao = null;
                break;
            case '+':
                num2 = converteNumero(tela.getText());
                executa();
                operacao = Operacao.SOMA;
                break;
            case '-':
                num2 = converteNumero(tela.getText());
                executa();
                operacao = Operacao.SUBTRACAO;
                break;
            case '*':
                num2 = converteNumero(tela.getText());
                executa();
                operacao = Operacao.MULTIPLICACAO;
                break;
            case '/':
                num2 = converteNumero(tela.getText());
                executa();
                operacao = Operacao.DIVISAO;
                break;
            case '0':
                escreveDigito("0");
                break;
            case '1':
                escreveDigito("1");
                break;
            case '2':
                escreveDigito("2");
                break;
            case '3':
                escreveDigito("3");
                break;
            case '4':
                escreveDigito("4");
                break;
            case '5':
                escreveDigito("5");
                break;
            case '6':
                escreveDigito("6");
                break;
            case '7':
                escreveDigito("7");
                break;
            case '8':
                escreveDigito("8");
                break;
            case '9':
                escreveDigito("9");
                break;
            case ',':
                if (modo ==Modo.FLOAT)
                    escreveDigito(".");
                break;
            case '.':
                if (modo ==Modo.FLOAT)
                    escreveDigito(".");
                break;
        }

        if (keyCode == KeyEvent.VK_C) {
            limpaMemoria();
        } else if (keyCode == KeyEvent.VK_ENTER) {
            num2 = converteNumero(tela.getText());
            executa();
            operacao = null;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton cinco;
    private javax.swing.JButton divisao;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modoButton;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton sair;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton sinalButton;
    private javax.swing.JButton soma;
    private javax.swing.JButton start;
    private javax.swing.JButton subtracao;
    private javax.swing.JTextPane tela;
    private javax.swing.JTextPane telaBin;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton virgula;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
