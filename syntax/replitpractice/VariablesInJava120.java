package syntax.replitpractice;

public class VariablesInJava120 {
    String name;
    int year;
    int batch;

    public VariablesInJava120(String syntax, int year, int batch) {
    }

    public void school(String schoolName) {
        name = schoolName;

    }

    public int Year(int setYear) {
        year = setYear;
        return setYear;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public void printVariablesInJava120() {
        System.out.println("I am a student of batch " + batch + " studying at " + name + "in the year of " + year);
    }

    public static void main(String[] args) {
        VariablesInJava120 variablesInJava120 = new VariablesInJava120("Syntax", 2021, 9);
        variablesInJava120.printVariablesInJava120();
    }
}
    /*
Declare 3 instance variables to hold:

year, school name and batch #

Access variables from the main method and assign specific values to them

Print values of your variables in the following format:

Expected Output:

I am a student of batch

     */










