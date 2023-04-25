public class Snack {
    private int artikelcode;
    private String naam;
    private double prijs;

    public Snack(int artikelcode, String naam, double prijs) {
        this.artikelcode = artikelcode;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getArtikelcode() {
        return artikelcode;
    }

    public void setArtikelcode(int artikelcode) {
        this.artikelcode = artikelcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "artikelcode=" + artikelcode +
                ", naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}

