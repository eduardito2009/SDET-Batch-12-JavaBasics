package syntax.class22;



public class ClassAA {
    void method(){
        System.out.println("A");
    }


        }
        class ClassBB extends ClassAA{
    void method(){
        System.out.println("B");
    }

        void test(){
    method();//call the same class method
    this.method();//calls the same class method
    super.method();//calls the parent class method
        }
        }
        class Tester{
            public static void main(String[] args) {
                ClassBB classBB=new ClassBB();
                classBB.test();
            }
        }




