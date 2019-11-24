package encryptdecrypt.algorithms;

public class AlgorithmUnicode implements AlgorithmStrategy {
    private int key;

    @Override
    public String encrypt(String inp) {
        char[] chars = inp.toCharArray();
        String result = "";
        for (char ch : chars){
            result += changeChar(ch);
        }
        return result;
    }

    @Override
    public String decrypt(String inp) {
        char[] chars = inp.toCharArray();
        key *= -1;
        String result = "";
        for (char ch : chars){
            result += changeChar(ch);
        }
        key *= -1;
        return result;
    }

    private char changeChar(char inp){
        return (char) (inp + key);
    }

    public void setKey(int key) {
        this.key = key;
    }
}
