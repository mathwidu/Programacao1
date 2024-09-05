public class Circulo extends FomaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI * raio * raio;
    }

    @Override
    String obterDescricao() {
        return "Círculo com raio " + raio + ", área: " + area();
    }
}
