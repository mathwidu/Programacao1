public class Gerente extends Funcionario{
    private int nivel;
    //construtor
    public Gerente (String nome, String endereco, char sexo, String dataContratacao, int nivel){
            super(nome, endereco, sexo, dataContratacao);
            this.nivel = nivel;
    }
    //getters e setters
    public int getNivel (){
        return nivel;
    }

    public void setNivel(int nivel){
        if (nivel == 1 || nivel == 2 || nivel ==3){
            this.nivel = nivel;
        }
        else {
            System.out.println("***Nivel invalido***\nUse 1, 2 ou 3 para o nivel de gerente");
        }
    }
    /*sobrescrevo o metodo toString para ter um metodo que fornece uma
   representação textual de cada tipo do objeto.*/ 
    @Override
    public String toString(){
        return String.format("Gerente: %s, Endereço: %s, Sexo: %s, Data de Contratação: %s, Nível: %d", 
        getNome(), getEndereco(), getSexo(), getDataContratacao(), nivel);
    }
}
