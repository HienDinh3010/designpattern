package design.asd.course.pattern.decorator.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LineCountInputStream extends FilterInputStream {

    private int lineCount = 1;

    protected LineCountInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int character = super.read();
        if (character != -1 && character == 10) {
            lineCount++;
        }
        return character;
    }

    public int getLineCount() {
        return lineCount;
    }
}
