package Atividade;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

			JOptionPane.showMessageDialog(null,  "Informações do produto");
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o cod do produto?"));
			double valorLivro = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do livro?"));
			JOptionPane.showInputDialog("Descrição livro");
			
			
			JOptionPane.showMessageDialog(null,  "Informações do livro" + livro, codigo, valorLivro, descricao);	
			
	
	}
}