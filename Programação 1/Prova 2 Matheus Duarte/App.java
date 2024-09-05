import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        Automovel carro = new Automovel("Carro", "nnnn4444", 10000, "2012");
        veiculos.add(carro);

        Motocicleta moto = new Motocicleta("Moto", "mmmm5555", 10000, "2012");
        veiculos.add(moto);

        Pesado caminhao = new Pesado("Caminhão", "oooo6666", 10000, "2011");
        veiculos.add(caminhao);

        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo);
        }


    }
}
