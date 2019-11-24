package encryptdecrypt;

import encryptdecrypt.algorithms.AlgorithmFactory;
import encryptdecrypt.algorithms.AlgorithmStrategy;
import encryptdecrypt.input.InputFromFile;
import encryptdecrypt.output.OutputFactory;
import encryptdecrypt.output.OutputStrategy;

public class EncryptDecrypt {
    Arguments arguments;
    AlgorithmStrategy algorithm;
    OutputStrategy output;
    String data;


    public EncryptDecrypt(Arguments arguments) {
        this.arguments = arguments;
        this.algorithm = AlgorithmFactory.getAlgorithm(arguments.getAlgorithm(),arguments.getKey());
        this.output = OutputFactory.getOutput(arguments.getFileOut());
        if (arguments.getFileIn() != null){
            data = new InputFromFile(arguments.getFileIn()).loud();
        } else {
            data = arguments.getData();
        }
    }

    public void start(){
        switch (arguments.getMode()){
            case ("dec") : {
                output.output(algorithm.decrypt(data));
                break;
            }
            case ("enc") : {
                output.output(algorithm.encrypt(data));
            }
        }
    }
}
