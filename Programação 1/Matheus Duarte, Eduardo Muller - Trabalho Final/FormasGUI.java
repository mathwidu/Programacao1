import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormasGUI extends JFrame {
    private PainelFormas painelFormas;

    public FormasGUI() {
        setTitle("Desenho de Formas");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        painelFormas = new PainelFormas();
        add(painelFormas, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());

        JButton botaoCirculo = new JButton("Círculo");
        JButton botaoQuadrado = new JButton("Quadrado");
        JButton botaoTriangulo = new JButton("Triângulo");
        JButton botaoReset = new JButton("Limpar");

        painelBotoes.add(botaoCirculo);
        painelBotoes.add(botaoQuadrado);
        painelBotoes.add(botaoTriangulo);
        painelBotoes.add(botaoReset);

        add(painelBotoes, BorderLayout.SOUTH);

        botaoCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelFormas.addForma(new Circulo());
                painelFormas.repaint();
            }
        });

        botaoQuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelFormas.addForma(new Quadrado());
                painelFormas.repaint();
            }
        });

        botaoTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelFormas.addForma(new Triangulo());
                painelFormas.repaint();
            }
        });
        botaoReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelFormas.limparFormas();
                painelFormas.repaint();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {//pelo que eu entendi serve para colocar a execução da GUI em um thread especifica só para isso assim resolvendo alguns erros que estavam acontecendo no meu codigo
            @Override
            public void run() {
                new FormasGUI().setVisible(true);
            }
        });
    }
}


