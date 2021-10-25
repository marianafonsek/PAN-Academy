package p1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {
	
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	
	public void inserirdados() {
		this.codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
		this.nome=JOptionPane.showInputDialog("Digite o nome");
		this.esporte=JOptionPane.showInputDialog("Digite o esporte praticado");
		this.valorPatrocinio=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		String mensagem = "Objeto atleta criado a partir da classe Atleta";
		mensagem += "\n codigo" + this.codigo;
		mensagem += "\n nome" + this.nome;
		mensagem += "\n  Esporte" + this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\n Valor de patrocinio: " + formatar.format(this.valorPatrocinio);
		JOptionPane.showMessageDialog(null, mensagem);
		}
	
	public double atualizarValor(double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + taxa;
		return this.valorPatrocinio;
	}

}
