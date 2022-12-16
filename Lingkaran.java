public class Lingkaran {
    private double diameter;
    private double jari2;

    // CONSTRUTOR
    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // GETTER-SETTER
    public void setjari2(double jari2) {
        this.jari2 = jari2 * 2;
    }

    public double getJari2() {
        return this.diameter / 2;
    }

    public double getLuas() {
        return 3.14 * this.diameter * this.diameter / 4;
    }
}
