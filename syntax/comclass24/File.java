package syntax.comclass24;
/*
Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
 while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
  of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft
   Word to be installed etc
 */
public abstract class File {
    void edit(){
        System.out.println("Edit file");
    }
    void close(){
        System.out.println("Close file");
    }
    abstract void open();

    }
    class JavaFile extends File{
    @Override
        void open(){
        System.out.println("To open .java file we need notepad++ or sublime text");
    }
}
class WorldFile extends File{
    @Override
    void open(){
        System.out.println("To open .Worldfile we need .doc file");
    }
}
class PdfFile extends File{
    @Override
    void open(){
        System.out.println("To open Pdf we need microsoft word installed");
    }
}
