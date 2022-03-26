package syntax.comclass24;
abstract class File1{
    abstract void open ();
    void edit(){
        System.out.println("Editing a class");
    }
    void close(){
        System.out.println("closing the file");

    }

}
class javaFile extends File1{
    @Override
    void open(){
        System.out.println("Use intellij to open java files");
    }
}
class WordFile extends File1{
    @Override
    void open(){
        System.out.println("Use microsoft word to open this file");
    }
}
class PDFFile extends File1{
    @Override
    void open(){
        System.out.println("Use adobe reader to open the file");
    }
}

public class Task2 {
    public static void main(String[] args) {
        /*
        if a method is not present inside the parent class we can't call that method using polymorphism
        Object[] files={new javaFile(),new PDFFile(), new WordFile()};
        Object[0]; */
        File1[] files={new javaFile(),new WordFile(),new PDFFile()};
        for (int i=0; i< files.length;i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }

}
