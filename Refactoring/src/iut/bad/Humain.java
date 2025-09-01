package iut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public void details() {
        System.out.println(this.toString());
    }

    @Override
    public void manger() {
        System.out.println(prenom + " " + nom + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(prenom + " " + nom + " est en train de boire.");
    }

    public void ami(Humain autre) {
        ami(autre, 100); // valeur par défaut
    }

    public void ami(Humain autre, int duree) {
        System.out.println(this.prenom + " " + this.nom + " est ami(e) avec " 
                           + autre.prenom + " " + autre.nom
                           + " pour " + duree + " jours.");
    }
}

/*
 * Reponse de la Question 9 :
 * Si on déplace la méthode toString() dans les sous-classes (Homme, Femme),
 * cela entraîne une duplication de code car les attributs (nom, prénom, âge)
 * sont déjà définis dans la classe parente Humain.
 * Ainsi, chaque sous-classe devrait réimplémenter toString(), ce qui complique
 * la maintenance. 
 * Il est donc préférable de garder toString() dans Humain,
 * sauf si on veut un affichage spécifique à chaque sous-classe.
 */