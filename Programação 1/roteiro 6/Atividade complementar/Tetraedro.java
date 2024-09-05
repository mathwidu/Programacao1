public class Tetraedro extends FormaTridimensional{
    private double aresta;

    public Tetraedro(double aresta){
        this.aresta = aresta;
    }

    public double area(){
        return Math.sqrt(3*(aresta*aresta));
    }

    public double volume (){
        return (aresta*aresta*aresta)/6*(Math.sqrt(2));
    }
    @Override
    String obterDescricao() {
        return "Tetraedro com aresta " + aresta + ", área: " + area() + ", volume: " + volume();
    }
}
