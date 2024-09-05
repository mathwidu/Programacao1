public class AssistenteAdministrativo extends Assistente{
    private String turno;
    private int adicionalNoturno;
    //construtor
    public AssistenteAdministrativo(String nome, String endereco, char sexo, String dataContratacao, String especializacao, String turno, int adicionalNoturno){
        super(nome, endereco, sexo, dataContratacao, especializacao);
        this.adicionalNoturno = adicionalNoturno;
    }
    //getters e setters
    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public int getAdicionalTurno(){
        return adicionalNoturno;
    }

    public void setAdicionalTurno(int adicionalNoturno){
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public String toString() {
    return String.format("Assistente Administrativo: %s, Endereço: %s, Sexo: %s, Data de Contratação: %s, Especialização: %s, Turno: %s, Adicional Noturno: %.2f",
            getNome(), getEndereco(), getSexo(), getDataContratacao(), getEspecializacao(), turno, adicionalNoturno);
}
}