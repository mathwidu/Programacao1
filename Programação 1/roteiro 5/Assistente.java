public class Assistente extends Funcionario {
    private String especializacao;
    //construtor
    public Assistente (String nome, String endereco, char sexo, String dataContratacao, String especializacao){
        super(nome, endereco, sexo, dataContratacao);
        this.especializacao = especializacao;
    }
    //getters e setters
    public String getEspecializacao(){
        return especializacao;
    }

    public void setEspecializacao(String especializacao){
        if (especializacao.equals("A") || especializacao.equals("B") || especializacao.equals("C")){
            this.especializacao = especializacao;
        }
        else{
            System.out.println("***Especialização invalida***\nUse A, B ou C para especialização.");
        }
    }
   /*sobrescrevo o metodo toString para ter um metodo que fornece uma
   representação textual de cada tipo do objeto.*/ 
    @Override
    public String toString(){
        return String.format("Assistente: %s, Endereço: %s, Sexo: %s, Data de Contratação: %s, Especialização: %s",
                getNome(), getEndereco(), getSexo(), getDataContratacao(), getEspecializacao());
    }
    
}
