package encryptdecrypt.algorithms;

public interface AlgorithmStrategy {
    String encrypt(String inp);
    String decrypt(String inp);
    void setKey(int key);
}