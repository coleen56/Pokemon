public class Pokemon {
    private String nom;
    private double hp;
    private double atk;
    private String type;


    public Pokemon(String nom, double hp, double atk, String type) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", HP : " + hp + ", Force d'attaque de base : " + atk + ", Type : " + type;
    }

    public boolean isDead() {
        boolean dead;
        double hp = getHp();
        dead = hp <= 0;
        if (dead) {
            setHp(0);
        }
        return dead;
    }

    public void attaquer(Pokemon p) {
        double oldHp = p.getHp();
        double newHp = oldHp - atk;
        p.setHp(newHp);
    }
}
