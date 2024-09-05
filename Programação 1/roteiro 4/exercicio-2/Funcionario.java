public class Funcionario {
    private String nome;
    private int ID;
    private float salario;

    public Funcionario(String nome, int ID, float salario) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.ID;
    }

    public float getSalario() {
        return this.salario;
    }

    public void mostrarTudo() {
        System.out.println("O nome do funcionario é: " + getNome() + ", seu ID é: " + getId() + ", seu salario é: " + getSalario());
    }
}
