package encryptdecrypt.algorithms;

import java.util.Locale;

public class AlgorithmShift implements AlgorithmStrategy{
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] alphabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase(Locale.ENGLISH).toCharArray();
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
        for(int a = 0 ; a < alphabet.length ; a++){
            int newIndex = (a + key) % alphabet.length;
            if (newIndex<0){
                newIndex += alphabet.length;
            }

            if (inp == alphabet[a]){
               return alphabet[newIndex];
            }
            if (inp == alphabetUpper[a]){
                return alphabetUpper[newIndex];
            }
        }
        return inp;
    }

    public void setKey(int key) {
        this.key = key;
    }
}