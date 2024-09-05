import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Forma {
    private int base;
    private int altura;

    public Triangulo() {
        super();
        base = random.nextInt(50) + 10;
        altura = random.nextInt(50) + 10;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public void desenhar(Graphics g) {
        int[] xPoints = {x, x + base / 2, x - base / 2};
        int[] yPoints = {y, y + altura, y + altura};
        g.setColor(Color.GREEN);
        g.drawPolygon(xPoints, yPoints, 3);
        //g.fillPolygon(xPoints, yPoints, 3);
    }
}
