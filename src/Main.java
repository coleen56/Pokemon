public class Main {
    public static void main(String[] lulu) {
        Pokemon aspicot = new TypePlante("Aspicot", 50, 20, "Plante");
        Pokemon salameche = new TypeFeu("Salamèche", 60, 30, "Feu");
        Pokemon carapuce = new TypeEau("Carapuce", 60, 20, "Eau");
        System.out.println("AVANT COMBAT :");
        System.out.println(aspicot);
        System.out.println(salameche);
        salameche.attaquer(aspicot);
        System.out.println();
        System.out.println("APRES COMBAT :");
        System.out.println(aspicot);
        System.out.println(salameche);
        if (aspicot.isDead()) {
            System.out.println("Salamèche a tué Aspicot ! ");
        }
    }
}
