package br.org.jogomatematicoj.ui;

import br.org.jogomatematicoj.business.Divisao;
import br.org.jogomatematicoj.business.Multiplicacao;
import br.org.jogomatematicoj.business.Soma;
import br.org.jogomatematicoj.business.Subtracao;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * This class will be used to show the statistcs of the user after doing the
 * tests and check his/her performance
 *
 * @author Paulo Ricardo
 */
public class TelaDeEstatisticas extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeEstatisticas
     */
    public TelaDeEstatisticas() {
        initComponents();
    }

    /**
     * Creates new form TelaDeEstatisticas, passing Matemathics Operations as
     * Objects
     */
    public TelaDeEstatisticas(Soma soma, Subtracao sub, Multiplicacao m, Divisao d) {
        initComponents();
        
        this.soma = soma;
        this.sub = sub;
        this.mult = m;
        this.div = d;

        this.msgTentou = "Você tentou %d vez";
        this.msgAcertos = "Você acertou %d conta";
        this.msgErros = "Você errou %d conta";
        
        this.msgSemAcertos = "Você não tem acertos";
        this.msgSemTenativas = "Você não tentou";
        this.msgSemErros = "Você não tem erros";
        
        addListeners();
    }

    /**
     * Add Listeners to the screen
     */
    private void addListeners() {
        addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                String msg;

                // atualiza os resultados da soma
                if (soma.getNumeroAcertos() > 0 || soma.getNumeroErros() > 0) {
                    msg = msgAcertos;
                    msg = msg.format(msg, soma.getNumeroAcertos());
                    if (soma.getNumeroAcertos() > 1) {
                        msg += "s";
                    }

                    lblAcertosSoma.setText(msg);

                    msg = msgErros;
                    msg = msg.format(msg, soma.getNumeroErros());
                    if (soma.getNumeroErros() > 1) {
                        msg += "s";
                    }

                    lblErrosSoma.setText(msg);

                    msg = msgTentou;
                    msg = msg.format(msg, (soma.getNumeroErros() + soma.getNumeroAcertos()));
                    if ((soma.getNumeroErros() + soma.getNumeroAcertos()) > 1) {
                        msg += "s";
                    }

                    lblTentativasSoma.setText(msg);

                    msg = "%.1f";
                    msg = msg.format(msg, soma.getPercentualAcertos() / 10);
                    lblNotaSoma.setText(msg);
                }
                else{
                    lblAcertosSoma.setText(msgSemAcertos);
                    lblErrosSoma.setText(msgSemErros);
                    lblTentativasSoma.setText(msgSemTenativas);
                }

                // atualiza os resultados da subtração
                if (sub.getNumeroAcertos() > 0 || sub.getNumeroErros() > 0) {
                    msg = msgAcertos;
                    msg = msg.format(msg, sub.getNumeroAcertos());
                    if (sub.getNumeroAcertos() > 1) {
                        msg += "s";
                    }

                    lblAcertosSubtracao.setText(msg);

                    msg = msgErros;
                    msg = msg.format(msg, sub.getNumeroErros());
                    if (sub.getNumeroErros() > 1) {
                        msg += "s";
                    }

                    lblErrosSubtracao.setText(msg);

                    msg = msgTentou;
                    msg = msg.format(msg, (sub.getNumeroErros() + sub.getNumeroAcertos()));
                    if ((sub.getNumeroErros() + sub.getNumeroAcertos()) > 1) {
                        msg += "s";
                    }

                    lblTentativasSubtracao.setText(msg);

                    msg = "%.1f";
                    msg = msg.format(msg, sub.getPercentualAcertos() / 10);
                    lblNotaSubtracao.setText(msg);
                }
                else{
                    lblAcertosSubtracao.setText(msgSemAcertos);
                    lblErrosSubtracao.setText(msgSemErros);
                    lblTentativasSubtracao.setText(msgSemTenativas);
                }

                // atualiza os resultados da multiplicação
                if (mult.getNumeroAcertos() > 0 || mult.getNumeroErros() > 0) {
                    msg = msgAcertos;
                    msg = msg.format(msg, mult.getNumeroAcertos());
                    if (mult.getNumeroAcertos() > 1) {
                        msg += "s";
                    }

                    lblAcertosMultiplicacao.setText(msg);

                    msg = msgErros;
                    msg = msg.format(msg, mult.getNumeroErros());
                    if (mult.getNumeroErros() > 1) {
                        msg += "s";
                    }

                    lblErrosMultiplicacao.setText(msg);

                    msg = msgTentou;
                    msg = msg.format(msg, (mult.getNumeroErros() + mult.getNumeroAcertos()));
                    if ((mult.getNumeroErros() + mult.getNumeroAcertos()) > 1) {
                        msg += "s";
                    }

                    lblTentativasMultiplicacao.setText(msg);

                    msg = "%.1f";
                    msg = msg.format(msg, mult.getPercentualAcertos() / 10);
                    lblNotaMultiplicacao.setText(msg);
                }
                else{
                    lblAcertosMultiplicacao.setText(msgSemAcertos);
                    lblErrosMultiplicacao.setText(msgSemErros);
                    lblTentativasMultiplicacao.setText(msgSemTenativas);
                }

                // atualiza os resultados da divisão
                if (div.getNumeroAcertos() > 0 || div.getNumeroErros() > 0) {
                    msg = msgAcertos;
                    msg = msg.format(msg, div.getNumeroAcertos());
                    if (div.getNumeroAcertos() > 1) {
                        msg += "s";
                    }

                    lblAcertosDivisao.setText(msg);

                    msg = msgErros;
                    msg = msg.format(msg, div.getNumeroErros());
                    if (div.getNumeroErros() > 1) {
                        msg += "s";
                    }

                    lblErrosDivisao.setText(msg);

                    msg = msgTentou;
                    msg = msg.format(msg, (div.getNumeroErros() + div.getNumeroAcertos()));
                    if ((div.getNumeroErros() + div.getNumeroAcertos()) > 1) {
                        msg += "s";
                    }

                    lblTentativasDivisao.setText(msg);

                    msg = "%.1f";
                    msg = msg.format(msg, div.getPercentualAcertos() / 10);
                    lblNotaDivisao.setText(msg);
                }
                else{
                    lblAcertosDivisao.setText(msgSemAcertos);
                    lblErrosDivisao.setText(msgSemErros);
                    lblTentativasDivisao.setText(msgSemTenativas);
                }

                // atualiza os resultados gerais
                int numAcertos = soma.getNumeroAcertos() + sub.getNumeroAcertos() + mult.getNumeroAcertos() + div.getNumeroAcertos();
                int numErros = soma.getNumeroErros() + sub.getNumeroErros() + mult.getNumeroErros() + div.getNumeroErros();

                if (numAcertos > 0 || numErros > 0) {

                    msg = msgAcertos;
                    msg = msg.format(msg, numAcertos);
                    if (numAcertos > 1) {
                        msg += "s";
                    }

                    lblAcertosGeral.setText(msg);

                    msg = msgErros;
                    msg = msg.format(msg, numErros);
                    if (numErros > 1) {
                        msg += "s";
                    }

                    lblErrosGeral.setText(msg);

                    msg = msgTentou;
                    msg = msg.format(msg, numErros + numAcertos);
                    if ((numErros + numAcertos) > 1) {
                        msg += "s";
                    }

                    lblTentativasGeral.setText(msg);

                    double notaAcertos = ((double) numAcertos) / (numAcertos + numErros);

                    msg = "%.1f";
                    msg = msg.format(msg, notaAcertos * 10);
                    lblNotaGeral.setText(msg);
                }
                else{
                    lblAcertosGeral.setText(msgSemAcertos);
                    lblErrosGeral.setText(msgSemErros);
                    lblTentativasGeral.setText(msgSemTenativas);
                }

            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSomaStats = new javax.swing.JPanel();
        lblTituloSoma = new javax.swing.JLabel();
        lblTentativasSoma = new javax.swing.JLabel();
        lblAcertosSoma = new javax.swing.JLabel();
        lblErrosSoma = new javax.swing.JLabel();
        lblNotaSoma = new javax.swing.JLabel();
        panelSomaStats1 = new javax.swing.JPanel();
        lblTituloSubtracao = new javax.swing.JLabel();
        lblTentativasSubtracao = new javax.swing.JLabel();
        lblAcertosSubtracao = new javax.swing.JLabel();
        lblErrosSubtracao = new javax.swing.JLabel();
        lblNotaSubtracao = new javax.swing.JLabel();
        panelSomaStats2 = new javax.swing.JPanel();
        lblTituloDivisao = new javax.swing.JLabel();
        lblTentativasDivisao = new javax.swing.JLabel();
        lblAcertosDivisao = new javax.swing.JLabel();
        lblErrosDivisao = new javax.swing.JLabel();
        lblNotaDivisao = new javax.swing.JLabel();
        panelSomaStats3 = new javax.swing.JPanel();
        lblTituloMultiplicacao = new javax.swing.JLabel();
        lblTentativasMultiplicacao = new javax.swing.JLabel();
        lblErrosMultiplicacao = new javax.swing.JLabel();
        lblAcertosMultiplicacao = new javax.swing.JLabel();
        lblNotaMultiplicacao = new javax.swing.JLabel();
        panelSomaStats4 = new javax.swing.JPanel();
        lblTituloGeral = new javax.swing.JLabel();
        lblTentativasGeral = new javax.swing.JLabel();
        lblErrosGeral = new javax.swing.JLabel();
        lblAcertosGeral = new javax.swing.JLabel();
        lblNotaGeral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rsultados");

        panelSomaStats.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloSoma.setText("Soma:");

        lblTentativasSoma.setText("Você tentou %d vez");

        lblAcertosSoma.setText("Você acertou %d conta");
        lblAcertosSoma.setToolTipText("");

        lblErrosSoma.setText("Você errou %d conta");
        lblErrosSoma.setToolTipText("");

        lblNotaSoma.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblNotaSoma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaSoma.setText("0");
        lblNotaSoma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNotaSoma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSomaStatsLayout = new javax.swing.GroupLayout(panelSomaStats);
        panelSomaStats.setLayout(panelSomaStatsLayout);
        panelSomaStatsLayout.setHorizontalGroup(
            panelSomaStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAcertosSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrosSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTentativasSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblNotaSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSomaStatsLayout.setVerticalGroup(
            panelSomaStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotaSoma)
                    .addGroup(panelSomaStatsLayout.createSequentialGroup()
                        .addComponent(lblTituloSoma)
                        .addGap(18, 18, 18)
                        .addComponent(lblTentativasSoma)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertosSoma)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrosSoma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSomaStats1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloSubtracao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloSubtracao.setText("Subtração:");

        lblTentativasSubtracao.setText("Você tentou %d vezes");

        lblAcertosSubtracao.setText("Você acertou %d contas");
        lblAcertosSubtracao.setToolTipText("");

        lblErrosSubtracao.setText("Você errou %d contas");
        lblErrosSubtracao.setToolTipText("");

        lblNotaSubtracao.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblNotaSubtracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaSubtracao.setText("0");
        lblNotaSubtracao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNotaSubtracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSomaStats1Layout = new javax.swing.GroupLayout(panelSomaStats1);
        panelSomaStats1.setLayout(panelSomaStats1Layout);
        panelSomaStats1Layout.setHorizontalGroup(
            panelSomaStats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTentativasSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAcertosSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrosSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNotaSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSomaStats1Layout.setVerticalGroup(
            panelSomaStats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotaSubtracao)
                    .addGroup(panelSomaStats1Layout.createSequentialGroup()
                        .addComponent(lblTituloSubtracao)
                        .addGap(18, 18, 18)
                        .addComponent(lblTentativasSubtracao)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertosSubtracao)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrosSubtracao)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelSomaStats2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloDivisao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloDivisao.setText("Divisão:");

        lblTentativasDivisao.setText("Você tentou %d vezes");

        lblAcertosDivisao.setText("Você acertou %d contas");
        lblAcertosDivisao.setToolTipText("");

        lblErrosDivisao.setText("Você errou %d contas");
        lblErrosDivisao.setToolTipText("");

        lblNotaDivisao.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblNotaDivisao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaDivisao.setText("0");
        lblNotaDivisao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNotaDivisao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSomaStats2Layout = new javax.swing.GroupLayout(panelSomaStats2);
        panelSomaStats2.setLayout(panelSomaStats2Layout);
        panelSomaStats2Layout.setHorizontalGroup(
            panelSomaStats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTentativasDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAcertosDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrosDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNotaDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSomaStats2Layout.setVerticalGroup(
            panelSomaStats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotaDivisao)
                    .addGroup(panelSomaStats2Layout.createSequentialGroup()
                        .addComponent(lblTituloDivisao)
                        .addGap(18, 18, 18)
                        .addComponent(lblTentativasDivisao)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertosDivisao)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrosDivisao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSomaStats3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloMultiplicacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloMultiplicacao.setText("Multiplicacao:");

        lblTentativasMultiplicacao.setText("Você tentou %d vezes");

        lblErrosMultiplicacao.setText("Você acertou %d contas");
        lblErrosMultiplicacao.setToolTipText("");

        lblAcertosMultiplicacao.setText("Você errou %d contas");
        lblAcertosMultiplicacao.setToolTipText("");

        lblNotaMultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblNotaMultiplicacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaMultiplicacao.setText("0");
        lblNotaMultiplicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNotaMultiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSomaStats3Layout = new javax.swing.GroupLayout(panelSomaStats3);
        panelSomaStats3.setLayout(panelSomaStats3Layout);
        panelSomaStats3Layout.setHorizontalGroup(
            panelSomaStats3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrosMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(lblAcertosMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTentativasMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblNotaMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSomaStats3Layout.setVerticalGroup(
            panelSomaStats3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotaMultiplicacao)
                    .addGroup(panelSomaStats3Layout.createSequentialGroup()
                        .addComponent(lblTituloMultiplicacao)
                        .addGap(18, 18, 18)
                        .addComponent(lblTentativasMultiplicacao)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrosMultiplicacao)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertosMultiplicacao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSomaStats4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloGeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloGeral.setText("Resultado Geral:");

        lblTentativasGeral.setText("Você tentou %d vezes");

        lblErrosGeral.setText("Você acertou %d contas");
        lblErrosGeral.setToolTipText("");

        lblAcertosGeral.setText("Você errou %d contas");
        lblAcertosGeral.setToolTipText("");

        lblNotaGeral.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        lblNotaGeral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaGeral.setText("0");
        lblNotaGeral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNotaGeral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSomaStats4Layout = new javax.swing.GroupLayout(panelSomaStats4);
        panelSomaStats4.setLayout(panelSomaStats4Layout);
        panelSomaStats4Layout.setHorizontalGroup(
            panelSomaStats4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelSomaStats4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblErrosGeral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTentativasGeral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloGeral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAcertosGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNotaGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSomaStats4Layout.setVerticalGroup(
            panelSomaStats4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSomaStats4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSomaStats4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNotaGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSomaStats4Layout.createSequentialGroup()
                        .addComponent(lblTituloGeral)
                        .addGap(22, 22, 22)
                        .addComponent(lblTentativasGeral)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrosGeral)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertosGeral)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSomaStats4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelSomaStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSomaStats1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelSomaStats3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSomaStats2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panelSomaStats4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSomaStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSomaStats3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSomaStats1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSomaStats2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDeEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeEstatisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAcertosDivisao;
    private javax.swing.JLabel lblAcertosGeral;
    private javax.swing.JLabel lblAcertosMultiplicacao;
    private javax.swing.JLabel lblAcertosSoma;
    private javax.swing.JLabel lblAcertosSubtracao;
    private javax.swing.JLabel lblErrosDivisao;
    private javax.swing.JLabel lblErrosGeral;
    private javax.swing.JLabel lblErrosMultiplicacao;
    private javax.swing.JLabel lblErrosSoma;
    private javax.swing.JLabel lblErrosSubtracao;
    private javax.swing.JLabel lblNotaDivisao;
    private javax.swing.JLabel lblNotaGeral;
    private javax.swing.JLabel lblNotaMultiplicacao;
    private javax.swing.JLabel lblNotaSoma;
    private javax.swing.JLabel lblNotaSubtracao;
    private javax.swing.JLabel lblTentativasDivisao;
    private javax.swing.JLabel lblTentativasGeral;
    private javax.swing.JLabel lblTentativasMultiplicacao;
    private javax.swing.JLabel lblTentativasSoma;
    private javax.swing.JLabel lblTentativasSubtracao;
    private javax.swing.JLabel lblTituloDivisao;
    private javax.swing.JLabel lblTituloGeral;
    private javax.swing.JLabel lblTituloMultiplicacao;
    private javax.swing.JLabel lblTituloSoma;
    private javax.swing.JLabel lblTituloSubtracao;
    private javax.swing.JPanel panelSomaStats;
    private javax.swing.JPanel panelSomaStats1;
    private javax.swing.JPanel panelSomaStats2;
    private javax.swing.JPanel panelSomaStats3;
    private javax.swing.JPanel panelSomaStats4;
    // End of variables declaration//GEN-END:variables
    private Soma soma;
    private Subtracao sub;
    private Multiplicacao mult;
    private Divisao div;
    
    private String msgTentou;
    private String msgAcertos;
    private String msgErros;

    private String msgSemTenativas;
    private String msgSemAcertos;
    private String msgSemErros;
}
