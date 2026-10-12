public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }

    public int getAge() {
        return age;
    }
    public String getNom(){
        return name;
    }

    public String getFamily() {
        return family;
    }
    public boolean isMammal() {
        return isMammal;
    }
}