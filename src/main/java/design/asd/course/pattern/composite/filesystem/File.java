package design.asd.course.pattern.composite.filesystem;

public class File extends FileSystemComponent {

    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        super(name);
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public int getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public void print() {
        System.out.println("--- file " + name + " size=" + getSizeInBytes() + " bytes");
    }
}
