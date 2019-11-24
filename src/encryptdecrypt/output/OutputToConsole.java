package encryptdecrypt.output;

public class OutputToConsole implements OutputStrategy {
    @Override
    public void output(String s) {
        System.out.print(s);
    }
}
