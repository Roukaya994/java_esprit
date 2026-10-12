// TestToString.java

public class TestToString {
    public static void main(String[] args) {
        // Create objects
        Animal lex = new Animal("Félidé", "Lex", 5, true);
        Zoo myZoo = new Zoo("myZoo", "Paris", 15);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
  ;
        System.out.println("Affichage direct de l'objet Zoo:");
        System.out.println(myZoo);
        System.out.println("\nAffichage direct d'un objet Animal:");
        System.out.println(lex);
    }
}