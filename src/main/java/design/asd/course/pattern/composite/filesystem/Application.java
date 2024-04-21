package design.asd.course.pattern.composite.filesystem;

public class Application {
    public static void main(String[] args) {
        Directory cdir = new Directory("C");
        Directory appdir = new Directory("applications");
        Directory datadir = new Directory("my data");
        Directory coursedir = new Directory("cs525");
        File excelFile = new File("msexcel.exe", 100000);
        File wordFile = new File("msword.doc", 90000);
        File studentsFile = new File("students.docx", 5555555);

        cdir.addComponent(appdir);
        cdir.addComponent(datadir);

        datadir.addComponent(coursedir);
        appdir.addComponent(excelFile);
        appdir.addComponent(wordFile);

        coursedir.addComponent(studentsFile);
        cdir.print();
    }
}
