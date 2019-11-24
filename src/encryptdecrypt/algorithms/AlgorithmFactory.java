package encryptdecrypt.algorithms;

import encryptdecrypt.Arguments;

public class AlgorithmFactory {
    public static AlgorithmStrategy getAlgorithm(String nameAlgorithm,int key){
        switch (nameAlgorithm) {
            case "unicode" : {
                AlgorithmUnicode algorithmUnicode = new AlgorithmUnicode();
                algorithmUnicode.setKey(key);
                return algorithmUnicode;
            }
            case "shift" : {
                AlgorithmShift algorithmShift = new AlgorithmShift();
                algorithmShift.setKey(key);
                return algorithmShift;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + nameAlgorithm);
        }
    }
}
