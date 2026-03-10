public class Pokemon {

    private String nom;
    private int pvMax;
    private int pv;
    private int attaque;
    private int defense;
    private int vitesse;

    private Type type1;
    private Type type2;

    private Attaque[] attaques = new Attaque[4];

    private Etat etat;

    public Pokemon(String nom) {
        this.nom = nom;
    }

    public Attaque getAttaqueByIndex(int index) {
        if (index >= 0 && index < attaques.length) {
            return attaques[index];
        }
        return null;
    }

    public int attaquer(Attaque attaque, Pokemon adversaire) {

        int degats = this.attaque - adversaire.defense;

        if (degats < 0) {
            degats = 0;
        }

        adversaire.pv -= degats;

        if (adversaire.pv < 0) {
            adversaire.pv = 0;
        }

        return degats;
    }
}