public class Segitiga {
    private double alas;
    private double tinggi;

    // CONSTRUTOR
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // GETTER-SETTER
    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getLuass() {
        return this.alas * this.tinggi / 2;
    }
}
