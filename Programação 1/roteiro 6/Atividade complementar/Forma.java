abstract class Forma implements Comparable<Forma> {
    abstract double area();
    abstract String obterDescricao();

    @Override
    public int compareTo(Forma outraForma) {
        return Double.compare(this.area(), outraForma.area());
    }
}