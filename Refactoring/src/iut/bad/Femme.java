package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Martin", "Jean", 25);
        Femme femme = new Femme("Dupont", "Alice", 23);

        // Test affichage normal
        femme.ami(homme); // durée par défaut = 100

        // Test avec durée personnalisée
        homme.ami(femme, 365); 
    }
}
