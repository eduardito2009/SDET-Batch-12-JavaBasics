package syntax.class2301;

public class DogTester {
    Dog dog=new Dog();

    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog);
        Dog dog2=new Dog("Tommy","Green","RedBull", 12,25.5);
        System.out.println(dog2);
        dog2.changeInfo("Rocky","Black","BullDog");
        System.out.println(dog2);
    }

}
