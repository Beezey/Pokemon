public class Partie {

    private Joueur j1;
    private Joueur j2;
    private boolean enCours;

    public Partie(Joueur j1, Joueur j2) {
        this.j1 = j1;
        this.j2 = j2;
        this.enCours = true;
    }

    public void lancerPartie() {
        int tour = 1;

        while (enCours) {

            System.out.println("=== Tour " + tour + " ===");

            realiserActions(j1, j2);

            if (!j2.getPokemonActif().estVivant()) {
                enCours = false;
                break;
            }

            realiserActions(j2, j1);

            if (!j1.getPokemonActif().estVivant()) {
                enCours = false;
            }

            tour++;
        }

        afficherGagnant();
    }

    private void realiserActions(Joueur attaquant, Joueur defenseur) {
        Pokemon p1 = attaquant.getPokemonActif();
        Pokemon p2 = defenseur.getPokemonActif();

        Attaque[] attaques = p1.getAttaques();

        int choix = (int)(Math.random() * 4);
        Attaque attaqueChoisie = attaques[choix];

        System.out.println(p1.getNom() + " utilise " + attaqueChoisie.getNom());

        int degats = p1.attaquer(attaqueChoisie, p2);

        System.out.println("Dégâts infligés : " + degats);
    }

    private void afficherGagnant() {
        if (j1.getPokemonActif().estVivant()) {
            System.out.println(j1.getNom() + " gagne !");
        } else {
            System.out.println(j2.getNom() + " gagne !");
        }
    }
}