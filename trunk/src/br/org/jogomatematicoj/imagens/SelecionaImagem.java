package br.org.jogomatematicoj.imagens;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Ricardo
 */
public class SelecionaImagem {

        private String[] imagensNumeroPath = new String[10];
        private String[] imagensOperacaoPath = new String[4];
        private String imagesRoot = null;
        
        public SelecionaImagem(){
            imagensNumeroPath[0]="/000.jpg";
            imagensNumeroPath[1]="/001.jpg";
            imagensNumeroPath[2]="/002.jpg";
            imagensNumeroPath[3]="/003.jpg";
            imagensNumeroPath[4]="/004.jpg";
            imagensNumeroPath[5]="/005.jpg";
            imagensNumeroPath[6]="/006.jpg";
            imagensNumeroPath[7]="/007.jpg";
            imagensNumeroPath[8]="/008.jpg";
            imagensNumeroPath[9]="/009.jpg";
            
            imagensOperacaoPath[0]="/soma.jpg";
            imagensOperacaoPath[1]="/subtracao.jpg";
            imagensOperacaoPath[2]="/multiplicacao.jpg";
            imagensOperacaoPath[3]="/divisao.jpg";
            
            imagesRoot = "/br/org/jogomatematicoj/imagens";
        }
        
        public ImageIcon getNumeroIcon(int numero){
            //numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            String path =  imagesRoot + imagensNumeroPath[numero];
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            return icon;
        }

        public ImageIcon getOperacaoIcon(int numero){
            String path = imagesRoot + imagensOperacaoPath[numero];
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            return icon;
        }

        public ImageIcon getBlankIcon(){
            String path = imagesRoot + "/blank.jpg";
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            return icon;
        }
}
