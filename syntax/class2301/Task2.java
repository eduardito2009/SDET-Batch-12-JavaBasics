package syntax.class2301;

public class Task2 {
    public static void method(String name) {
        System.out.println("1");
    }

    public static void method(boolean bol) {
        System.out.println("2");

    }

    public static void method(int number) {
        System.out.println("3");
    }

    public static void main(String[] args) {
        method(true);
        method(15);
    }
}