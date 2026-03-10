public class Combat {

    private Joueur joueur1;
    private Joueur joueur2;

    public Combat(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public Joueur victoire() {
        if (joueur1.pokemonKO == 6) {
            return joueur2;
        }
        if (joueur2.pokemonKO == 6) {
            return joueur1;
        }
        return null;
    }

    public int sauvegarder() {
        return 1;
    }

    public void charger(int numeroSauvegarde) {

    }
}