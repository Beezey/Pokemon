public class Type {

    public String nom;

    public Type(String nom) {
        this.nom = nom;
    }

    public boolean havePenaltyVs(Type typeAdverse) {
        return false;
    }

    public boolean haveBonusVs(Type typeAdverse) {
        return false;
    }

    public boolean isEfficient(Type typeAdverse) {
        return haveBonusVs(typeAdverse);
    }

    public boolean isSameAs(Pokemon attacker) {
        if (attacker == null) {
            return false;
        }
        return this.equals(attacker.getType1()) || this.equals(attacker.getType2());
    }
}