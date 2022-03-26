package syntax.com.replits;
//Create an Interface with name as MyInterface
//
//Create two undefined methods method1 and method2
//
//Inherit the MyInterface to Main Class.
//
//Execute both methods
//
//Expected Output:
//
//implementation of method1
//
//implementation of method2

public interface MyInterface {
    void m1();

    void m2();

    class Main implements MyInterface {

        @Override
        public void m1() {
            System.out.println("implementation of method1");
        }

        @Override
        public void m2() {
            System.out.println("implementation of method2");
        }

        public static void main(String[] args) {
            MyInterface myInterface = new Main();
            myInterface.m1();
            myInterface.m2();
        }
    }
}
