package program;

import java.util.Scanner;

import static Constants.Constant.breakCase;

public class StringCode {
    public void showAllStringCodeMenuAndProcess(){
        System.out.println("==Hello these are String programs==");
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1. Get String in Literal.");
            System.out.println("2. Get String with new keyword.");
            System.out.println("3. Escaped characters.");
            System.out.println("4. Text block.");

            System.out.println(breakCase +". Exit.");
            option = selectOptionAndProcess(sc.nextInt(), sc);
        } while (option != 100);
    }

    public int selectOptionAndProcess(int option, Scanner sc) {
        switch (option) {
            case 1 -> {
                stringProgram1(sc);
                break;
            }

            case 2 -> {
                stringProgram2();
                break;
            }

            case 3 -> {
                stringProgram3();
                break;
            }

            case 4 -> {
                stringProgram4();
                break;
            }

            case breakCase -> {
                System.out.println("Out from String operations");
                break;
            }
            default -> System.out.println("Invalid option");
        }
        return option;
    }

    // String Programs functions.

    private void stringProgram1(Scanner sc) {
        /* Reason of Using extra sc.nextLine(); in above code
         * Before calling nextLine(), add an extra sc.nextLine(); to consume the newline left by previous input (such as nextInt(), nextDouble(), etc.).
         */

        /* Note
         * If you use only nextLine() everywhere, this issue will not occur.
         * Always be cautious mixing nextInt(), nextDouble(), etc., with nextLine().
         */

        sc.nextLine();
        String input = sc.nextLine();
        System.out.println("==Input String== " + input);
    }

    private void stringProgram2() {
        String input = new String("Hello World");
        System.out.println("==Input String by new keyword== " + input);
    }

    private void stringProgram3() {
        String text = "\tThis text is one tab in.\r\n";
        System.out.println("==escaped String== " + text);
    }

    private void stringProgram4() {
        String textblock = """
                    This is a text inside a text block.
                    You can use "quotes" in here
                    without escaping them.
                """;
        System.out.println("==text block== " + textblock);
    }
}
