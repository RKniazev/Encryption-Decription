package encryptdecrypt;

public class Arguments {
    private String data;
    private String mode;
    private String fileIn;
    private String fileOut;
    private int key;
    private String algorithm = "shift";

    public Arguments(String...args) {
        int indexKey = 0;
        int indexValue;

        while (indexKey < args.length){
            indexValue = indexKey + 1 < args.length ? indexKey + 1 : -1;
            if (indexValue!=-1){
                setupArg(args[indexKey], args[indexValue]);
            }
            indexKey += 2;
        }
    }

    private void setupArg(String key, String value){
        switch (key) {
            case "-mode" : {
                this.mode = value;
                break;
            }
            case "-in" : {
                this.fileIn = value;
                break;
            }
            case "-out" : {
                this.fileOut = value;
                break;
            }
            case "-key" : {
                this.key = Integer.parseInt(value);
                break;
            }
            case "-alg" : {
                this.algorithm = value;
                break;
            }
            case "-data" : {
                this.data = value;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Data - " +  data + System.lineSeparator() +
                "Mode - " +  mode + System.lineSeparator() +
                "In - " + fileIn + System.lineSeparator() +
                "Out - " + fileOut + System.lineSeparator() +
                "Key - " + key + System.lineSeparator() +
                "Alg - " + algorithm;
    }

    public String getData() {
        return data;
    }

    public String getMode() {
        return mode;
    }

    public String getFileIn() {
        return fileIn;
    }

    public String getFileOut() {
        return fileOut;
    }

    public int getKey() {
        return key;
    }

    public String getAlgorithm() {
        return algorithm;
    }
}

