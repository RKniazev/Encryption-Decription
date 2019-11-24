package encryptdecrypt.input;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFile implements InputStrategy {
    File file;

    public InputFromFile(String s) {
        this.file = new File(s);
    }

    @Override
    public String loud() {
        String s = "";
        try {
            FileReader fr = new FileReader(file);
            while (fr.ready()){
                s += (char) fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
