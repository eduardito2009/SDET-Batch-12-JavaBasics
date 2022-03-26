package syntax.comclass24;

public class FileTester {
    public static void main(String[] args) {
        File javafile=new JavaFile();
        javafile.open();
        javafile.edit();
        javafile.close();

        File worldfile=new WorldFile();
        worldfile.open();
        worldfile.edit();
        worldfile.close();

        File pdffile=new PdfFile();
        pdffile.open();
        pdffile.edit();
        pdffile.close();

    }
}
