package encryptdecrypt.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputToFile implements OutputStrategy {
    File file;

    @Override
    public void output(String s) {
        try {
            FileWriter fileWriter = new FileWriter(this.file,false);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Error - can't write to file");
        }

    }

    public OutputStrategy setFile(String path){
        file = new File(path);
        return null;
    }
}
