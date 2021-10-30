package Polimorfismo;

public class Colaborador {
	
	public String nome;
	public String cpf;
	public double salario;
	
	public Colaborador(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calculoPremio() {
		return salario += 100;
	}
	
}
