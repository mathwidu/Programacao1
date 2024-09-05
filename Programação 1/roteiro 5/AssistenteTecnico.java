public class AssistenteTecnico extends Assistente{
    private int bonusSalarial;
    //construtor
    public AssistenteTecnico(String nome, String endereco, char sexo, String dataContratacao, String especializacao, int bonusSalarial){
        super(nome, endereco, sexo, dataContratacao, especializacao);
        this.bonusSalarial = bonusSalarial;
    }
    //getters e setters
    public int getBonusSalarial(){
        return bonusSalarial;
    }

    public void setBonusSalarial(int bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }
    /*sobrescrevo o metodo toString para ter um metodo que fornece uma
   representação textual de cada tipo do objeto.*/ 
    @Override
    public String toString(){
        return String.format("Assistente Técnico: %s, Endereço: %s, Sexo: %s, Data de Contratação: %s, Especialização: %s, Bônus Salarial: %.2f",
                getNome(), getEndereco(), getSexo(), getDataContratacao(), getEspecializacao(), getBonusSalarial());
    } 
}