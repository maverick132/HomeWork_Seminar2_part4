import java.io.IOException;
import java.util.Scanner;

public class InputString implements InputTerminal, OutputTerminal{
    private String string;


    @Override
    public String input() {
        Scanner scanner = new Scanner(System.in);
            try {
                    this.string = scanner.nextLine();
                    if (this.string.equals(null)) throw new RuntimeException();
            }
            catch (RuntimeException e) {
                this.output("Пустую строку вводить нельзя");
            }
        scanner.close();
        return this.string;
    }

    @Override
    public void output(String s) {
        System.out.println(s);
    }

    public String getString() {
        return this.string;
    }
}
