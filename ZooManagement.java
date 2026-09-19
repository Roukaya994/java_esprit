import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public void afficher() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
    public void saisir() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Donner le nom du zoo : ");
            zooName = sc.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne doit pas être vide.");
            }
        } while (zooName.isEmpty());
        do {
            System.out.print("Donner le nombre de cages : ");
            while (!sc.hasNextInt()) {                 // l'utilisateur n'a pas tapé un entier
                System.out.println("Erreur : veuillez saisir un entier.");
                sc.next();                              // vider le buffer
                System.out.print("Donner le nombre de cages : ");
            }
            nbrCages = sc.nextInt();
            if (nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif.");
            }
        } while (nbrCages <= 0);

        sc.close();
    }
    public void afficherApresSaisie() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
    public static void main(String[] args) {
        ZooManagement z = new ZooManagement();
        z.afficher();
        z.saisir();
        z.afficherApresSaisie();
    }
}
