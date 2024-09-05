import javax.swing.JOptionPane;

public class App {
    public static void main(String args[]) {
        // variáveis
        int idade;
        String nome;
        String endereco;
        double salario;

        // leitura
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        endereco = JOptionPane.showInputDialog("Qual seu endereço?");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario:"));

        // Verificando...
        String mensagem = String.format("Dados lidos: %s tem %d anos, ganha %.2f, e mora em:  %s.\n", nome, idade, salario, endereco);
        System.out.println(mensagem);

        // Criando objeto
        Atleta a = new Atleta(nome, idade);
        System.out.printf("Dados do Atleta: %s tem %d anos.\n", a.getNome(), a.getIdade());
    }
}
