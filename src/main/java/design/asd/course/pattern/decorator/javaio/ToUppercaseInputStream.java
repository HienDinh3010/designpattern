package design.asd.course.pattern.decorator.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ToUppercaseInputStream extends FilterInputStream {

    protected ToUppercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int character = super.read();
        if (character != -1) {
            character = Character.toUpperCase((char) character);
        }
        return character;
    }
}
