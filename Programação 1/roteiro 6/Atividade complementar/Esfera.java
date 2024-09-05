public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI * 4 * (raio *raio);
    }

    public double volume(){
        return (Math.PI * 4 * (raio*raio*raio))/3;
    }
    @Override
    String obterDescricao() {
        return "Esfera com raio " + raio + ", área: " + area() + ", volume: " + volume();
    }
}
