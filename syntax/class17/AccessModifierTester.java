package syntax.class17;

import syntax.class18.AccessModifiers;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        /*Can't access name because it has private access
        Can't age because it has default access
        Can't access weight because it has protected access
        can only access color because it has a public
        access which can be accessed from anywhere inside
        the same project

         */
       // System.out.println(am.name);
        //System.out.println(am.age);
        //System.out.println(am.weight);
        System.out.println(am.color);
    }
}
