import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario {
    private List<LinguagemProgramacao> linguagens;

    public Programador(String nome, int ID, float salario) {
        super(nome, ID, salario);
        this.linguagens = new ArrayList<>();
    }

    public List<LinguagemProgramacao> getLinguagens() {
        return this.linguagens;
    }

    public void mostrarTudo() {
        System.out.println("O nome do Programador é: " + getNome() + ", seu ID é: " + getId() + ", seu salario é: " + getSalario());
        System.out.println("Linguagens de Programação:");
        for (LinguagemProgramacao linguagem : linguagens) {
            System.out.println("- " + linguagem);
        }
    }

    public void adicionarLinguagem(LinguagemProgramacao linguagem) {
        if (linguagens.size() < 3) {
            this.linguagens.add(linguagem);
        } else {
            System.out.println("Limite de número de linguagens alcançado");
        }
    }

    public void removerLinguagem(LinguagemProgramacao linguagem) {
        this.linguagens.remove(linguagem);
    }
}
