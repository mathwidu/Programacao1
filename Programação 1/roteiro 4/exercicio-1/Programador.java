public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, int ID, int salario, String linguagem){
        super(nome, ID, salario);
        this.linguagem = linguagem;
    }

    public String GetLinguagem(){
        return this.linguagem;
    }
    public void MostraTudo(){
        System.out.println("O nome do Programador é: " + GetNome() + " seu ID é: " + GetId() + " seu salario é: " + GetSalario() + " sua linguagem de programação é: " + GetLinguagem());
    }
}
