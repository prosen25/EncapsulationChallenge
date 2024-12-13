//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Printer printer = new Printer(80, true);
        System.out.println("Toner level: " + printer.addToner(10));
        System.out.println("Number of pages printed: " + printer.printPages(27));
    }
}