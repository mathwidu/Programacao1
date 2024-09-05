import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class PainelFormas extends JPanel {
    private ArrayList<Forma> formas;

    public PainelFormas() {
        formas = new ArrayList<>();
    }

    public void addForma(Forma forma) {
        formas.add(forma);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Forma forma : formas) {
            forma.desenhar(g);
        }
    }
    public void limparFormas() {
        formas.clear();
        repaint(); 
    }
}
