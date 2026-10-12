public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("myZoo", "Paris", 25);
        Animal lex = new Animal("Felide", "Lex", 5, true);
        Animal simba = new Animal("Felide", "Simba", 3, true);
        Animal kaa = new Animal("Reptile", "Kaa", 10, false);

        System.out.println("Ajout Lex : " + myZoo.addAnimal(lex));
        System.out.println("Ajout Simba : " + myZoo.addAnimal(simba));
        System.out.println("Ajout Kaa : " + myZoo.addAnimal(kaa));
        System.out.println("Recherche de Lex : " + myZoo.searchAnimal("Lex"));
        System.out.println("Ajout d'un doublon : "
                + myZoo.addAnimal(new Animal("Felide", "Lex", 5, true)));

        for (int i = 1; i <= 23; i++) {
            myZoo.addAnimal(new Animal("Inconnu", "Animal" + i, 1, false));
        }
        System.out.println("Zoo plein : " + myZoo.isZooFull());
        System.out.println("Ajout au-delà de la capacité : "
                + myZoo.addAnimal(new Animal("Oiseau", "Titi", 2, false)));

        System.out.println("Suppression de Simba : " + myZoo.removeAnimal(simba));
        myZoo.displayAnimals();

        Zoo secondZoo = new Zoo("secondZoo", "Tunis", 25);
        secondZoo.addAnimal(new Animal("Felide", "Milo", 4, true));
        System.out.println("Zoo avec le plus d'animaux : "
                + Zoo.compareZoo(myZoo, secondZoo).name);
    }
}
