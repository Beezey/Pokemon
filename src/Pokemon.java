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

    public Pokemon(String nom, int pvMax, int attaque, int defense, int vitesse) {
        this.nom = nom;
        this.pvMax = pvMax;
        this.pv = pvMax;
        this.attaque = attaque;
        this.defense = defense;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
        if (this.pv < 0) {
            this.pv = 0;
        }
        if (this.pv > this.pvMax) {
            this.pv = this.pvMax;
        }
    }

    public int getVitesse() {
        return vitesse;
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Etat getEtat() {
        return etat;
    }

    public void appliquerEtat() {
        if (etat != null) {
            etat.effet(this);
            if (etat.estFini()) {
                etat = null;
            }
        }
    }

    public Attaque getAttaqueByIndex(int index) {
        if (index >= 0 && index < attaques.length) {
            return attaques[index];
        }
        return null;
    }

    public int attaquer(Attaque attaque, Pokemon adversaire) {
        int degats;

        if (this.vitesse >= adversaire.vitesse) {
            degats = this.attaque - adversaire.defense;
        } else {
            degats = (this.attaque - adversaire.defense) / 2;
        }

        if (degats < 0) {
            degats = 0;
        }

        adversaire.setPv(adversaire.getPv() - degats);

        return degats;
    }
}