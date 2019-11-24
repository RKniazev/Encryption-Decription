package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt(new Arguments(args));
        encryptDecrypt.start();
    }
}