public class App {
    public static void main(String[] args) {
        Mensageiro rodrigo = new Mensageiro("Rodrigo");
        Mensageiro joao = new Mensageiro("João");
        Mensageiro ana = new Mensageiro("Ana");

        ana.setDestino(joao);
        joao.setDestino(rodrigo);

        ana.receberMensagem("ola mundo!");
        ana.enviarMensagem();
        joao.enviarMensagem();
        rodrigo.enviarMensagem();
    }

}
