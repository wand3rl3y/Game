package pacote.Janelas;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Frames extends Canvas
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame jfram;
	private final int largura = 160;
	private final int altura = 120;
	private final int escala = 3;
	
	public  Frames() 
	{
		this.setPreferredSize(new Dimension(largura*escala,altura*escala));
		jfram = new JFrame("Game Jframe");
		jfram.add(this);// do Canvas
		jfram.setResizable(false);// não permite o jogador mudar o tamanho da tela 
		jfram.pack();// Metodo do Canvas para calcular as janela 
		jfram.setLocationRelativeTo(null);// Tela no meio do monitor
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando clickar em fechar para o prgrama e fecha a janela
		jfram.setVisible(true);// coloca a tela visivel 
	}	

}
