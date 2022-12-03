public class Main {
//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        InputString inputString = new InputString();
        inputString.output("Введите любую строку, кроме пустой");
        inputString.input();
        inputString.output(String.format("Вы ввели %s", inputString.getString()));
    }
}