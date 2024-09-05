import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Painel extends JPanel{
    ArrayList<Linha> linhas = new ArrayList<>();
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

       for (Linha linha : linhas) {
        g.drawLine(linha.getX1(), linha.getY1(), linha.x2, linha.getY2());
       }
        
    }

    public void addLine(int x1, int y1, int x2, int y2){
        Linha linha = new Linha(x1, y1, x2, y2);
        linhas.add(linha);
    }

    class Linha{
        int x1;
        int y1;
        int x2;
        int y2;

        public Linha(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public int getX1() {
            return x1;
        }

        public int getY1() {
            return y1;
        }

        public int getX2() {
            return x2;
        }

        public int getY2() {
            return y2;
        }

        
        
    }
    
}
