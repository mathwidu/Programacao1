import java.awt.Color;
import java.awt.Graphics;

public class Quadrado extends Forma {
    private int lado;

    public Quadrado() {
        super();
        lado = random.nextInt(50) + 10;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(x, y, lado, lado);
        //g.fillRect(x, y, lado, lado);
    }
}

