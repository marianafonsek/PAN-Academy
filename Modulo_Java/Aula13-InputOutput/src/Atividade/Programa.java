package Atividade;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

			JOptionPane.showMessageDialog(null,  "Informa��es do produto");
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o cod do produto?"));
			double valorLivro = Double.parseDouble(JOptionPane.showInputDialog("Qual � o valor do livro?"));
			JOptionPane.showInputDialog("Descri��o livro");
			
			
			JOptionPane.showMessageDialog(null,  "Informa��es do livro" + livro, codigo, valorLivro, descricao);	
			
	
	}
}