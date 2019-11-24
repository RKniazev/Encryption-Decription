package encryptdecrypt.output;

import encryptdecrypt.Arguments;

public class OutputFactory {
    public static OutputStrategy getOutput(String s){
        OutputStrategy outputStrategy = null;
        if (s != null){
            OutputToFile outputToFile = new OutputToFile();
            outputToFile.setFile(s);
            outputStrategy = outputToFile;
        } else {
            outputStrategy = new OutputToConsole();
        }

        return outputStrategy;
    }
}
