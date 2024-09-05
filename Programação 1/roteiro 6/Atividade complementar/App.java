import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(2));
        formas.add(new Circulo(4));

        formas.add(new Quadrado(2));
        formas.add(new Quadrado(4));

        formas.add(new Triangulo(2, 2));
        formas.add(new Triangulo(4, 4));

        formas.add(new Esfera(2));
        formas.add(new Esfera(4));

        formas.add(new Cubo(2));
        formas.add(new Cubo(4));

        formas.add(new Tetraedro(2));
        formas.add(new Tetraedro(4));

        System.out.println(formas);

        Collections.sort(formas);
        
        System.out.println(formas);

        List<String> resultados = new ArrayList<>();

        for (Forma forma : formas) {
            resultados.add(forma.obterDescricao());
        }

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
