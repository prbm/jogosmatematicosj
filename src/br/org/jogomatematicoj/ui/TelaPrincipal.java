/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.jogomatematicoj.ui;

import br.org.jogomatematicoj.business.DecompoeNumero;
import br.org.jogomatematicoj.business.Divisao;
import br.org.jogomatematicoj.business.Multiplicacao;
import br.org.jogomatematicoj.business.OperacoesBase;
import br.org.jogomatematicoj.business.Soma;
import br.org.jogomatematicoj.business.Subtracao;
import br.org.jogomatematicoj.imagens.SelecionaImagem;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Ricardo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        edResultado.setVisible(false);
        separadorConta.setVisible(false);
        lblOperacaoSelecionada.setVisible(false);
        btIgual.setVisible(false);
    }

    /**
     * Add one digit to the answer
     */
    private void adicionarDigitoAResposta(String dig){
        if(edResultado.getText().length()>4)
            return;
        
        edResultado.setText(dig+edResultado.getText());
        mostrarResposta();
    }
    
    /**
     * mount the labels of factors according the generated values
     * @param fatores 
     */
    private void mostrarLabels(int[] fatores){
        DecompoeNumero dn = new DecompoeNumero();
        int[] fator = {0,0,0,0,0};
        int posArray = 0;
        
        // determina os labels de acordo com o número gerado para o fator 1
        fator = dn.decompoeInteiro(fatores[0]);

        // determina a posição inicial
        posArray = 5 - fator.length;

        // posiciona as imagens de acordo com os fatores gerados
        for (int i = 0; i < fator.length; i++) {
            switch (posArray) {
                case 0:
                    lblFator1Digito004.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 1:
                    lblFator1Digito003.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 2:
                    lblFator1Digito002.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 3:
                    lblFator1Digito001.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 4:
                    lblFator1Digito000.setIcon(si.getNumeroIcon(fator[i]));
                    break;
            }
            posArray++;
        }

        // determina os labels de acordo com o número gerado para o fator 2
        fator = dn.decompoeInteiro(fatores[1]);

        // determina a posição inicial
        posArray = 5 - fator.length;

        // posiciona as imagens de acordo com os fatores gerados
        for (int i = 0; i < fator.length; i++) {
            switch (posArray) {
                case 0:
                    lblFator2Digito004.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 1:
                    lblFator2Digito003.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 2:
                    lblFator2Digito002.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 3:
                    lblFator2Digito001.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 4:
                    lblFator2Digito000.setIcon(si.getNumeroIcon(fator[i]));
                    break;
            }
            posArray++;
        }
        
    }
    
    /**
     * Mount labels with images related to the answer
     */
    private void mostrarResposta(){
        
        int[] fator = {0, 0, 0, 0, 0};
        DecompoeNumero dn = new DecompoeNumero();
        int posArray = 0;
        
        fator = dn.decompoeInteiro(edResultado.getText());
        // escode os números não usados
        if (fator.length < 5) {
            lblRespostaDigito004.setIcon(si.getBlankIcon());
            if (fator.length < 4) {
                lblRespostaDigito003.setIcon(si.getBlankIcon());
                if (fator.length < 3) {
                    lblRespostaDigito002.setIcon(si.getBlankIcon());
                    if (fator.length < 2) {
                        lblRespostaDigito001.setIcon(si.getBlankIcon());
                        if (fator.length < 1) {
                            lblRespostaDigito000.setIcon(si.getBlankIcon());
                        }
                    }
                }
            }
        }

        // determina a posição inicial
        posArray = 5 - fator.length;

        // posiciona as imagens de acordo com os fatores gerados
        for (int i = 0; i < fator.length; i++) {
            switch (posArray) {
                case 0:
                    lblRespostaDigito004.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 1:
                    lblRespostaDigito003.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 2:
                    lblRespostaDigito002.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 3:
                    lblRespostaDigito001.setIcon(si.getNumeroIcon(fator[i]));
                    break;
                case 4:
                    lblRespostaDigito000.setIcon(si.getNumeroIcon(fator[i]));
                    break;
            }
            posArray++;
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSelecaoOperacoes = new javax.swing.JPanel();
        btSomar = new javax.swing.JButton();
        btSubtrair = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblFator1Digito004 = new javax.swing.JLabel();
        lblFator1Digito003 = new javax.swing.JLabel();
        lblFator1Digito002 = new javax.swing.JLabel();
        lblFator1Digito001 = new javax.swing.JLabel();
        lblFator1Digito000 = new javax.swing.JLabel();
        lblFator2Digito004 = new javax.swing.JLabel();
        lblFator2Digito003 = new javax.swing.JLabel();
        lblFator2Digito002 = new javax.swing.JLabel();
        lblFator2Digito001 = new javax.swing.JLabel();
        lblFator2Digito000 = new javax.swing.JLabel();
        lblOperacaoSelecionada = new javax.swing.JLabel();
        btIgual = new javax.swing.JButton();
        edResultado = new javax.swing.JTextField();
        lblRespostaDigito000 = new javax.swing.JLabel();
        lblRespostaDigito001 = new javax.swing.JLabel();
        lblRespostaDigito002 = new javax.swing.JLabel();
        lblRespostaDigito004 = new javax.swing.JLabel();
        lblRespostaDigito003 = new javax.swing.JLabel();
        separadorConta = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btNum0 = new javax.swing.JButton();
        btNum1 = new javax.swing.JButton();
        btNum2 = new javax.swing.JButton();
        btNum3 = new javax.swing.JButton();
        btNum4 = new javax.swing.JButton();
        btNum6 = new javax.swing.JButton();
        btNum5 = new javax.swing.JButton();
        btNum7 = new javax.swing.JButton();
        btNum8 = new javax.swing.JButton();
        btNum9 = new javax.swing.JButton();
        btApagaDigito = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuResultados = new javax.swing.JMenu();
        mnuItemResultadosGerais = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Treinando Matemática");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(633, 653));
        setResizable(false);

        panelSelecaoOperacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btSomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/soma.png"))); // NOI18N
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        btSubtrair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/subtracao.png"))); // NOI18N
        btSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtrairActionPerformed(evt);
            }
        });

        btMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/multiplicacao.png"))); // NOI18N
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/divisao.png"))); // NOI18N
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSelecaoOperacoesLayout = new javax.swing.GroupLayout(panelSelecaoOperacoes);
        panelSelecaoOperacoes.setLayout(panelSelecaoOperacoesLayout);
        panelSelecaoOperacoesLayout.setHorizontalGroup(
            panelSelecaoOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoOperacoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btSomar)
                .addGap(18, 18, 18)
                .addComponent(btSubtrair)
                .addGap(18, 18, 18)
                .addComponent(btMultiplicar)
                .addGap(18, 18, 18)
                .addComponent(btDividir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSelecaoOperacoesLayout.setVerticalGroup(
            panelSelecaoOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelecaoOperacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSelecaoOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSomar))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFator1Digito004.setBackground(new java.awt.Color(255, 255, 255));
        lblFator1Digito004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator1Digito003.setBackground(new java.awt.Color(255, 255, 255));
        lblFator1Digito003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator1Digito002.setBackground(new java.awt.Color(255, 255, 255));
        lblFator1Digito002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator1Digito001.setBackground(new java.awt.Color(255, 255, 255));
        lblFator1Digito001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator1Digito000.setBackground(new java.awt.Color(255, 255, 255));
        lblFator1Digito000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator2Digito004.setBackground(new java.awt.Color(255, 255, 255));
        lblFator2Digito004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator2Digito003.setBackground(new java.awt.Color(255, 255, 255));
        lblFator2Digito003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator2Digito002.setBackground(new java.awt.Color(255, 255, 255));
        lblFator2Digito002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator2Digito001.setBackground(new java.awt.Color(255, 255, 255));
        lblFator2Digito001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblFator2Digito000.setBackground(new java.awt.Color(255, 255, 255));
        lblFator2Digito000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblOperacaoSelecionada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/soma.png"))); // NOI18N

        btIgual.setBackground(new java.awt.Color(204, 204, 204));
        btIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/igual.png"))); // NOI18N
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        edResultado.setEditable(false);
        edResultado.setBackground(new java.awt.Color(255, 255, 255));
        edResultado.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        edResultado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        edResultado.setEnabled(false);
        edResultado.setFocusable(false);
        edResultado.setSelectedTextColor(new java.awt.Color(0, 0, 102));

        lblRespostaDigito000.setBackground(new java.awt.Color(255, 255, 255));
        lblRespostaDigito000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblRespostaDigito001.setBackground(new java.awt.Color(255, 255, 255));
        lblRespostaDigito001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblRespostaDigito002.setBackground(new java.awt.Color(255, 255, 255));
        lblRespostaDigito002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblRespostaDigito004.setBackground(new java.awt.Color(255, 255, 255));
        lblRespostaDigito004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        lblRespostaDigito003.setBackground(new java.awt.Color(255, 255, 255));
        lblRespostaDigito003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/blank.png"))); // NOI18N

        separadorConta.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(separadorConta)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btIgual)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblOperacaoSelecionada))
                            .addComponent(edResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFator1Digito004, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator2Digito004)
                            .addComponent(lblRespostaDigito004))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFator2Digito003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito003)
                            .addComponent(lblRespostaDigito003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFator2Digito002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito002)
                            .addComponent(lblRespostaDigito002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFator2Digito001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito001)
                            .addComponent(lblRespostaDigito001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFator1Digito000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator2Digito000)
                            .addComponent(lblRespostaDigito000))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFator1Digito001, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito002, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito003, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito004, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFator1Digito000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edResultado)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFator2Digito000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFator2Digito001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFator2Digito002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFator2Digito003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFator2Digito004))
                    .addComponent(lblOperacaoSelecionada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorConta, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblRespostaDigito000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRespostaDigito001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRespostaDigito002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRespostaDigito003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRespostaDigito004))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btNum0.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum0.setMnemonic('0');
        btNum0.setText("0");
        btNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum0ActionPerformed(evt);
            }
        });

        btNum1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum1.setMnemonic('1');
        btNum1.setText("1");
        btNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum1ActionPerformed(evt);
            }
        });

        btNum2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum2.setMnemonic('2');
        btNum2.setText("2");
        btNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum2ActionPerformed(evt);
            }
        });

        btNum3.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum3.setMnemonic('3');
        btNum3.setText("3");
        btNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum3ActionPerformed(evt);
            }
        });

        btNum4.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum4.setMnemonic('4');
        btNum4.setText("4");
        btNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum4ActionPerformed(evt);
            }
        });

        btNum6.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum6.setMnemonic('6');
        btNum6.setText("6");
        btNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum6ActionPerformed(evt);
            }
        });

        btNum5.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum5.setMnemonic('5');
        btNum5.setText("5");
        btNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum5ActionPerformed(evt);
            }
        });

        btNum7.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum7.setMnemonic('7');
        btNum7.setText("7");
        btNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum7ActionPerformed(evt);
            }
        });

        btNum8.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum8.setMnemonic('8');
        btNum8.setText("8");
        btNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum8ActionPerformed(evt);
            }
        });

        btNum9.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        btNum9.setMnemonic('9');
        btNum9.setText("9");
        btNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum9ActionPerformed(evt);
            }
        });

        btApagaDigito.setFont(new java.awt.Font("Segoe Print", 0, 21)); // NOI18N
        btApagaDigito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/jogomatematicoj/imagens/borracha.png"))); // NOI18N
        btApagaDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagaDigitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNum0)
                    .addComponent(btNum5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNum6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btApagaDigito)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btApagaDigito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuResultados.setMnemonic('r');
        menuResultados.setText("Resultados");

        mnuItemResultadosGerais.setMnemonic('g');
        mnuItemResultadosGerais.setText("Resultados Gerais");
        mnuItemResultadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemResultadosGeraisActionPerformed(evt);
            }
        });
        menuResultados.add(mnuItemResultadosGerais);

        jMenuBar1.add(menuResultados);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSelecaoOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSelecaoOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomarActionPerformed
        operacaoSelecionada = OperacoesBase.SOMA;
        int[] fatores = new int[2];
        
        s.gerar2Inteiros(numMaximoSomaSubtrai);
        fatores[0] = s.getFator1();
        fatores[1] = s.getFator2();
        
        zeraTela();
        mostrarLabels(fatores);

        lblOperacaoSelecionada.setIcon(si.getOperacaoIcon(OperacoesBase.SOMA));
        edResultado.setText("");
    }//GEN-LAST:event_btSomarActionPerformed

    private void btSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtrairActionPerformed
        operacaoSelecionada = OperacoesBase.SUBTRACAO;
        int[] fatores = new int[2];
        
        subtracao.gerar2Inteiros(numMaximoSomaSubtrai);
        fatores[0] = subtracao.getFator1();
        fatores[1] = subtracao.getFator2();
        
        zeraTela();
        mostrarLabels(fatores);
        lblOperacaoSelecionada.setIcon(si.getOperacaoIcon(OperacoesBase.SUBTRACAO));
        edResultado.setText("");
    }//GEN-LAST:event_btSubtrairActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        if(edResultado.getText().length()<1)
            return;
        
        switch (operacaoSelecionada) {
            case OperacoesBase.SOMA:
                s.soma2Inteiros(Integer.parseInt(edResultado.getText()));
                if (s.isAcertou()) {
                    JOptionPane.showMessageDialog(this, "Parabéns, você acertou!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Você errou! Mas porque não tentar novamente???");
                }
                break;
            case OperacoesBase.SUBTRACAO:
                subtracao.subtrair2Inteiros(Integer.parseInt(edResultado.getText()));
                if (subtracao.isAcertou()) {
                    JOptionPane.showMessageDialog(this, "Parabéns, você acertou!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Você errou! Mas porque não tentar novamente???");
                }
                break;
            case OperacoesBase.MULTIPLICACAO:
                multiplicacao.multiplicar2Inteiros(Integer.parseInt(edResultado.getText()));
                if (multiplicacao.isAcertou()) {
                    JOptionPane.showMessageDialog(this, "Parabéns, você acertou!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Você errou! Mas porque não tentar novamente???");
                }
                break;
            case OperacoesBase.DIVISAO:
                divisao.dividir2Inteiros(Integer.parseInt(edResultado.getText()));
                if (divisao.isAcertou()) {
                    JOptionPane.showMessageDialog(this, "Parabéns, você acertou!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Você errou! Mas porque não tentar novamente???");
                }
                break;
        }

    }//GEN-LAST:event_btIgualActionPerformed

    private void btNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum0ActionPerformed
        adicionarDigitoAResposta("0");
    }//GEN-LAST:event_btNum0ActionPerformed

    private void btNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum1ActionPerformed
        adicionarDigitoAResposta("1");
    }//GEN-LAST:event_btNum1ActionPerformed

    private void btNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum2ActionPerformed
        adicionarDigitoAResposta("2");
    }//GEN-LAST:event_btNum2ActionPerformed

    private void btNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum3ActionPerformed
        adicionarDigitoAResposta("3");
    }//GEN-LAST:event_btNum3ActionPerformed

    private void btNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum4ActionPerformed
        adicionarDigitoAResposta("4");
    }//GEN-LAST:event_btNum4ActionPerformed

    private void btNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum5ActionPerformed
        adicionarDigitoAResposta("5");
    }//GEN-LAST:event_btNum5ActionPerformed

    private void btNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum6ActionPerformed
        adicionarDigitoAResposta("6");
    }//GEN-LAST:event_btNum6ActionPerformed

    private void btNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum7ActionPerformed
        adicionarDigitoAResposta("7");
    }//GEN-LAST:event_btNum7ActionPerformed

    private void btNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum8ActionPerformed
        adicionarDigitoAResposta("8");
    }//GEN-LAST:event_btNum8ActionPerformed

    private void btNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum9ActionPerformed
        adicionarDigitoAResposta("9");
    }//GEN-LAST:event_btNum9ActionPerformed

    private void btApagaDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagaDigitoActionPerformed
        if(edResultado.getText().length()==0)
            return;
        
        String tmp = edResultado.getText();
        tmp = tmp.substring(1);
        edResultado.setText(tmp);

        if(edResultado.getText().length()>=1)
            mostrarResposta();
        else
            lblRespostaDigito000.setIcon(si.getBlankIcon());
    }//GEN-LAST:event_btApagaDigitoActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        operacaoSelecionada = OperacoesBase.MULTIPLICACAO;
        int[] fatores = new int[2];
        
        multiplicacao.gerar2Inteiros();
        fatores[0] = multiplicacao.getFator1();
        fatores[1] = multiplicacao.getFator2();
        
        zeraTela();
        mostrarLabels(fatores);
        lblOperacaoSelecionada.setIcon(si.getOperacaoIcon(OperacoesBase.MULTIPLICACAO));
        edResultado.setText("");

    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        operacaoSelecionada = OperacoesBase.DIVISAO;
        int[] fatores = new int[2];
        
        divisao.gerar2Inteiros();
        fatores[0] = divisao.getFator1();
        fatores[1] = divisao.getFator2();
        
        zeraTela();
        mostrarLabels(fatores);

        lblOperacaoSelecionada.setIcon(si.getOperacaoIcon(OperacoesBase.DIVISAO));
        edResultado.setText("");

    }//GEN-LAST:event_btDividirActionPerformed

    private void mnuItemResultadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemResultadosGeraisActionPerformed
        TelaDeEstatisticas tde = new TelaDeEstatisticas(s, subtracao, multiplicacao, divisao);
        tde.setVisible(true);
    }//GEN-LAST:event_mnuItemResultadosGeraisActionPerformed

    private void zeraTela() {
        lblFator1Digito004.setIcon(si.getBlankIcon());
        lblFator1Digito003.setIcon(si.getBlankIcon());
        lblFator1Digito002.setIcon(si.getBlankIcon());
        lblFator1Digito001.setIcon(si.getBlankIcon());
        lblFator1Digito000.setIcon(si.getBlankIcon());

        lblFator2Digito004.setIcon(si.getBlankIcon());
        lblFator2Digito003.setIcon(si.getBlankIcon());
        lblFator2Digito002.setIcon(si.getBlankIcon());
        lblFator2Digito001.setIcon(si.getBlankIcon());
        lblFator2Digito000.setIcon(si.getBlankIcon());

        lblRespostaDigito004.setIcon(si.getBlankIcon());
        lblRespostaDigito003.setIcon(si.getBlankIcon());
        lblRespostaDigito002.setIcon(si.getBlankIcon());
        lblRespostaDigito001.setIcon(si.getBlankIcon());
        lblRespostaDigito000.setIcon(si.getBlankIcon());
        
        separadorConta.setVisible(true);
        lblOperacaoSelecionada.setVisible(true);
        btIgual.setVisible(true);
        
        lblOperacaoSelecionada.setIcon(si.getBlankIcon());
        edResultado.setText("");
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagaDigito;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btNum0;
    private javax.swing.JButton btNum1;
    private javax.swing.JButton btNum2;
    private javax.swing.JButton btNum3;
    private javax.swing.JButton btNum4;
    private javax.swing.JButton btNum5;
    private javax.swing.JButton btNum6;
    private javax.swing.JButton btNum7;
    private javax.swing.JButton btNum8;
    private javax.swing.JButton btNum9;
    private javax.swing.JButton btSomar;
    private javax.swing.JButton btSubtrair;
    private javax.swing.JTextField edResultado;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFator1Digito000;
    private javax.swing.JLabel lblFator1Digito001;
    private javax.swing.JLabel lblFator1Digito002;
    private javax.swing.JLabel lblFator1Digito003;
    private javax.swing.JLabel lblFator1Digito004;
    private javax.swing.JLabel lblFator2Digito000;
    private javax.swing.JLabel lblFator2Digito001;
    private javax.swing.JLabel lblFator2Digito002;
    private javax.swing.JLabel lblFator2Digito003;
    private javax.swing.JLabel lblFator2Digito004;
    private javax.swing.JLabel lblOperacaoSelecionada;
    private javax.swing.JLabel lblRespostaDigito000;
    private javax.swing.JLabel lblRespostaDigito001;
    private javax.swing.JLabel lblRespostaDigito002;
    private javax.swing.JLabel lblRespostaDigito003;
    private javax.swing.JLabel lblRespostaDigito004;
    private javax.swing.JMenu menuResultados;
    private javax.swing.JMenuItem mnuItemResultadosGerais;
    private javax.swing.JPanel panelSelecaoOperacoes;
    private javax.swing.JSeparator separadorConta;
    // End of variables declaration//GEN-END:variables
    private int operacaoSelecionada = -1;
    private SelecionaImagem si = new SelecionaImagem();
    private Soma s = new Soma();
    private Subtracao subtracao = new Subtracao();
    private static final int numMaximoSomaSubtrai = 10000;
    private Multiplicacao multiplicacao = new Multiplicacao();
    private Divisao divisao = new Divisao();
}
