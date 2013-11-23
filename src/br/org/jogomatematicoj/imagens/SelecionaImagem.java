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
        private static final String EXTENSION_FILE_PNG = ".png";
        
        public SelecionaImagem(){
            imagensNumeroPath[0]="/000" + EXTENSION_FILE_PNG;
            imagensNumeroPath[1]="/001" + EXTENSION_FILE_PNG;
            imagensNumeroPath[2]="/002" + EXTENSION_FILE_PNG;
            imagensNumeroPath[3]="/003" + EXTENSION_FILE_PNG;
            imagensNumeroPath[4]="/004" + EXTENSION_FILE_PNG;
            imagensNumeroPath[5]="/005" + EXTENSION_FILE_PNG;
            imagensNumeroPath[6]="/006" + EXTENSION_FILE_PNG;
            imagensNumeroPath[7]="/007" + EXTENSION_FILE_PNG;
            imagensNumeroPath[8]="/008" + EXTENSION_FILE_PNG;
            imagensNumeroPath[9]="/009" + EXTENSION_FILE_PNG;
            
            imagensOperacaoPath[0]="/soma" + EXTENSION_FILE_PNG;
            imagensOperacaoPath[1]="/subtracao" + EXTENSION_FILE_PNG;
            imagensOperacaoPath[2]="/multiplicacao" + EXTENSION_FILE_PNG;
            imagensOperacaoPath[3]="/divisao" + EXTENSION_FILE_PNG;
            
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
