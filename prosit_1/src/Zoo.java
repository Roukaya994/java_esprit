public class Zoo {
    private static final int MAX_CAGES = 25;

    public final Animal[] animals;
    public String name;
    public String city;
    public final int nbCages;
    private int animalCount;

    public Zoo(String name, String city, int nbCages) {
        this.name = name;
        this.city = city;
        this.nbCages = Math.clamp(nbCages, 0, MAX_CAGES);
        this.animals = new Animal[this.nbCages];
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull() || searchAnimal(animal.getNom()) != -1) {
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }

    public int searchAnimal(String animalName) {
        if (animalName == null) {
            return -1;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getNom().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }

    public int searchAnimal(Animal animal) {
        return animal == null ? -1 : searchAnimal(animal.getNom());
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean isZooFull() {
        return animalCount >= nbCages;
    }

    public static Zoo compareZoo(Zoo first, Zoo second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        return first.animalCount >= second.animalCount ? first : second;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbCages);
        System.out.println("Nombre d'animaux : " + this.animalCount);
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbCages=" + nbCages + "]";
    }
}
