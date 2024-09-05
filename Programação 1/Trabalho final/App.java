import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        Painel painel = new Painel();
        JButton botaoLinha = new JButton ("linha");
        Random rand = new Random();

        Box box = Box.createVerticalBox();
        box.add(painel);
        box.add(botaoLinha);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        painel.addLine(12,12,50, 50);
        painel.addLine(21, 012, 5, 50);

       //frame.setLayout (new FlowLayout()); coloca um ao lado do outro

        //frame.add(painel);
        //frame.add(botaoLinha); assim se cria um de cada vez
        frame.add(box); //cria todos de uma vez através de box

        botaoLinha.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicado");
                painel.addLine(rand.nextInt(frame.getWidth()), rand.nextInt(frame.getHeight()), rand.nextInt(frame.getWidth()), rand.nextInt(frame.getWidth()));
                frame.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressionado");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });




        

    }
}