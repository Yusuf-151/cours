package Animals;

public class test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        dog dog =new dog();
        cat cat =new cat();
    test(dog);
    test(cat);
    test(animal);
    }
public static void test(Animal animal){
    animal.eat();
}
}
