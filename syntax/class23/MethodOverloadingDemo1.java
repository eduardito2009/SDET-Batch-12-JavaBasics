package syntax.class23;

public class MethodOverloadingDemo1 {
    public static void main(String[] args) {
        add(10);
        add(10, 10);
        add(10, 20, 30);



    }

    static void add(int... numArray) {
        int sum = 0;
        for (int num : numArray) {
            sum = sum + num;
        }
        System.out.println(sum);

    }
}
