public class LinguagemProgramacao {
    private String nome;
    private int experiencia;
    private String preferencia;

    public LinguagemProgramacao(String nome, int experiencia, String preferencia) {
        this.nome = nome;
        this.experiencia = experiencia;
        this.preferencia = preferencia;
    }

    @Override
    public String toString() {
        return nome + " (Experiência: " + experiencia + " anos, Preferência: " + preferencia + ")";
    }
}
