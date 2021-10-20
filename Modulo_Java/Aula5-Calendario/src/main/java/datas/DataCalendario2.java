package datas;


import java.util.Calendar;
import javax.swing.JOptionPane;

public class DataCalendario2 {
	
	public static void main(String[] args) {
		Calendar calendario = (Calendar) Calendar.getInstance();
		
		//JoptionPane trabalha só com String
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));
		
		int ano_atual = calendario.get(Calendar.YEAR);
		
		int idade = ano_atual - ano;
		
		System.out.println(idade);
	
	}
}
