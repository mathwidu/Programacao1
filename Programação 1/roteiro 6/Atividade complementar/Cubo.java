public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double area(){
        return lado * lado * lado;
    }

    public double volume(){
        return 6 * (lado*lado*lado);
    }
    @Override
    String obterDescricao() {
        return "Cubo com lado " + lado + ", área: " + area() + ", volume: " + volume();
    }
}
