abstract class Funcionario {
    private String nome;
    private String endereco;
    private char sexo;
    private String dataContratacao;
    //construtor
    public Funcionario (String nome, String endereco, char sexo, String dataContratacao){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataContratacao = dataContratacao;
    }
    // getters e setters 

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        if (sexo == 'M' || sexo == 'F'){
            this.sexo = sexo;
        }
        else{
            System.out.println("***Sexo invalido***/nSexo deve ser M ou F.");
        }
    }

    public String getDataContratacao(){
        return dataContratacao;
    }

    public void setDataContratacao(String datacontratacao){
            this.dataContratacao = datacontratacao;
    }
    /*sobrescrevo o metodo toString para ter um metodo que fornece uma
   representação textual de cada tipo do objeto.*/ 
    @Override
    public String toString() {
        return String.format("Assistente: %s, Endereço: %s, Sexo: %s, Data de Contratação: %s, Especialização: %s",
                getNome(), getEndereco(), getSexo(), getDataContratacao());
    }
}