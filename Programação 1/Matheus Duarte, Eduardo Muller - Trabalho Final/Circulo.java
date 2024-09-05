import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Forma {
    private int raio;

    public Circulo() {
        super();
        raio = random.nextInt(50) + 10;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(x, y, raio * 2, raio * 2);
        //g.fillOval(x, y, raio * 2, raio * 2);
    }
}

