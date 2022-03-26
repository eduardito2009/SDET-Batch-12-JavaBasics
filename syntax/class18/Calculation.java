package syntax.class18;

public class Calculation {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
     public int SumOfArrays(int data[]){
         int answer =0;
         for (int i=0; i< data.length;i++){
             answer+=data[i];


         }
         return answer;
     }

    public static void main(String[] args) {
        Calculation cal=new Calculation();
        int data[]={10,20};
        System.out.println(cal.SumOfArrays(data));
    }
}
