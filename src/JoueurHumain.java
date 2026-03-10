public class JoueurHumain extends Joueur {

    private int nbBadge = 0;
    private Boolean[] badges = new Boolean[8];
    private int nbVictoire = 0;

    public JoueurHumain(String nom) {
        super(nom);
    }

    public int getNbBadge() {
        return nbBadge;
    }

    public void setNbBadge(int nbBadge) {
        this.nbBadge = nbBadge;
    }

    public Boolean[] getBadges() {
        return badges;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }
}