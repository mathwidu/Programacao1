import java.awt.Graphics;
import java.util.Random;

public abstract class Forma {
    protected int x, y;
    protected Random random;

    public Forma() {
        random = new Random();
        x = random.nextInt(500); 
        y = random.nextInt(500); 
    }

    public abstract double calcularArea();

    public abstract void desenhar(Graphics g);
}
