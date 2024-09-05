public class Funcionario {
    private String nome;
    private int ID;
    private float salario;
    

   public Funcionario(String nome, int ID, int salario){
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public String GetNome(){
        return this.nome;
    }

    public int GetId(){
        return this.ID;
    }

    public float GetSalario(){
        return this.salario;
    }

    public void MostraTudo(){
        System.out.println("O nome do funcionario é: " + GetNome() + "seu ID é: " + GetId() + " seu salario é: " + GetSalario());
    }

}