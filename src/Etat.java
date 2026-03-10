public class Etat {

    private String nom;
    private int nbTour;

    public Etat(String nom, int nbTour) {
        this.nom = nom;
        this.nbTour = nbTour;
    }

    public void effet(Pokemon p) {

        if(nom.equals("poison")) {
            int degats = p.getPvMax() / 8;
            p.setPv(p.getPv() - degats);
            System.out.println(p.getNom() + " est empoisonné !");
        }

        if(nom.equals("brulure")) {
            int degats = p.getPvMax() / 16;
            p.setPv(p.getPv() - degats);
            System.out.println(p.getNom() + " est brûlé !");
        }

        nbTour--;
    }

    public boolean estFini() {
        return nbTour <= 0;
    }

    public String getNom() {
        return nom;
    }
}