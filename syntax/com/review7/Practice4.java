package syntax.com.review7;

import java.sql.SQLOutput;

public class Practice4 {
    void verifyBatch12IsGoodEnough(boolean isGood) {
        if (isGood) {
            System.out.println("Yessss!!!!");
        } else {
            System.out.println("NO!!!!!!!");
        }
    }
    public static void main(String[] args) {
        Practice4 p = new Practice4();
        p.verifyBatch12IsGoodEnough(true);
    }

}
