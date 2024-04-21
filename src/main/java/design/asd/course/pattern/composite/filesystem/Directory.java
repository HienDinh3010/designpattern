package design.asd.course.pattern.composite.filesystem;

import java.util.ArrayList;
import java.util.Collection;

public class Directory extends FileSystemComponent {

    protected Collection<FileSystemComponent> fileSystemComponents = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        fileSystemComponents.add(component);
    }

    @Override
    public int getSizeInBytes() {
        return fileSystemComponents.stream().mapToInt(FileSystemComponent::getSizeInBytes).sum();
    }

    @Override
    public void print() {
        System.out.println("-- dir " + name + " size=" + getSizeInBytes() + " bytes");
        fileSystemComponents.forEach(component -> component.print());
    }
}
