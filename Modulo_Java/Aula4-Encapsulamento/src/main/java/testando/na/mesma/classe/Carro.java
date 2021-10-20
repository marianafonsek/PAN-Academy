package testando.na.mesma.classe;

public class Carro {

    private String nome;

    private void setNome(nome) {
        this.nome = nome;
    }

    private void exibeVelocidade() {
        System.out.println("A velocidade de um(a)" + nome + " é de 380km");
    }

public static void main(String[] args) {
    Carro c = new Carro();
    c.setNome();
    c.exibeVelocidade();
}

}
