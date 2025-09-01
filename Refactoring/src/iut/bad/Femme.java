package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Martin", "Jean", 25);
        Femme femme = new Femme("Dupont", "Alice", 23);

        homme.details();
        femme.details();

        femme.ami(homme);
    }
}
