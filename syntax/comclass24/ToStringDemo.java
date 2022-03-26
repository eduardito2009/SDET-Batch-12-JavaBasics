package syntax.comclass24;

public class ToStringDemo {
    String name;
    int age;

    ToStringDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mr A please show us your face";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("Mr.a", 10);
        System.out.println(toStringDemo);


    }
}

