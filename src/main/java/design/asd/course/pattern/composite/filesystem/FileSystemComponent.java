package design.asd.course.pattern.composite.filesystem;

public abstract class FileSystemComponent {

    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract int getSizeInBytes();
    public abstract void print();
}
