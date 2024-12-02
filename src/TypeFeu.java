public class TypeFeu extends Pokemon{

    public TypeFeu(String nom, int hp, double atk, String type) {
        super(nom, hp, atk, type);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof TypePlante) {
            super.setAtk(2*super.getAtk());
        } else if (p instanceof TypeFeu || p instanceof TypeEau) {
            super.setAtk(0.5*super.getAtk());
        }
        super.attaquer(p);
        if (p instanceof TypePlante) {
            super.setAtk(0.5*super.getAtk());
        } else if (p instanceof TypeFeu || p instanceof TypeEau) {
            super.setAtk(2*super.getAtk());
        }
    }
}
