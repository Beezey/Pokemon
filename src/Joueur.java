public class Joueur {

    protected String nom;
    protected Pokemon[] pokemon = new Pokemon[6];
    protected int pokemonKO = 0;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public int getPokemonKO() {
        return pokemonKO;
    }

    public void setPokemonKO(int pokemonKO) {
        this.pokemonKO = pokemonKO;
    }
}