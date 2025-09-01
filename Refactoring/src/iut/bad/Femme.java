package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Mahefa", "Mickael", 25);
        Femme femme = new Femme("Liantsoa", "Shania", 23);

        homme.details();
        femme.details();
        
        homme.boire();
        femme.manger(); 

        homme.ami(femme);
    }
}
