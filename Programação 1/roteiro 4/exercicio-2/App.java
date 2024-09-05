public class App {
    public static void main(String[] args) {
        // Criando um funcionário
        Funcionario jorge = new Funcionario("Jorge", 101010, 10000);
        jorge.mostrarTudo();
        
        // Criando um programador
        Programador matheus = new Programador("Matheus Duarte", 101203, 3000);
        
        // Adicionando linguagens de programação para o programador
        matheus.adicionarLinguagem(new LinguagemProgramacao("Java", 3, "Alta"));
        matheus.adicionarLinguagem(new LinguagemProgramacao("Python", 2, "Média"));
        matheus.adicionarLinguagem(new LinguagemProgramacao("JavaScript", 1, "Baixa"));

        // Mostrando todas as informações do programador
        matheus.mostrarTudo();

        // Removendo uma linguagem de programação do programador
        matheus.removerLinguagem(new LinguagemProgramacao("Python", 2, "Média"));

        // Mostrando todas as informações do programador novamente
        matheus.mostrarTudo();
    }
}

