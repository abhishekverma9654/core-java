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
            System.out.println("5. Default Concatenating by + operator.");
            System.out.println("6. Default Concatenating by method.");
            System.out.println("7. Length of String");
            System.out.println("8. Get substring of a given string");

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

            case 5 -> {
                stringProgram5();
                break;
            }

            case 6 -> {
                stringProgram6();
                break;
            }

            case 7 -> {
                // Adding next for avoiding the type change in scanner object, Description is in stringProgram1 method.
                sc.nextLine();
                stringProgram7(sc);
                break;
            }

            case 8 -> {
                sc.nextLine();
                stringProgram8(sc);
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

    private void stringProgram5() {
        String one = "Hello";
        String two = "World";
        String three = one + " " + two;

        String[] strings =
                new String[]{"one", "two", "three", "four", "five"};

        String result = null;
        for(String string : strings) {
            result = result + string;
        }

        System.out.println("==Concatenating String== " + three);
        System.out.println("==Concatenating by String builder== " + result);
    }

    private void stringProgram6() {
        String one = "Hello";
        String two = " World";

        String three = new StringBuilder(one)
                .append(two).toString();

        String[] strings =
                new String[]{"one", "two", "three", "four", "five"};

        String result = null;
        for(String string : strings) {
            result = new StringBuilder(result).append(string).toString();
        }

        String conResult = null;
        conResult = one.concat(two);

        System.out.println("==Concatenating String== " + three);
        System.out.println("==Concatenating by String concat method== " + conResult);
        System.out.println("==Concatenating by String builder== " + result);
    }

    private void stringProgram7(Scanner sc) {
        String string = sc.nextLine();
        int length = string.length();
        System.out.println("==Length of String is == " + length);
    }

    private void stringProgram8(Scanner sc) {
        System.out.println("==Enter String==\n");
        String string = sc.nextLine();
        System.out.println("==Enter Inital Index==\n");
        int initalIndex = sc.nextInt();
        System.out.println("==Enter End Index==\n");
        int endIndex = sc.nextInt();
        if (initalIndex > 0 && endIndex < string.length()) {
            String substring = string.substring(initalIndex, endIndex);
            System.out.println("==Substring of String with the given index is ==" + substring);
        } else if (initalIndex < 0) {
            System.out.println("==Initial index is can not be less than 0 == "+ initalIndex);
        } else if (endIndex > string.length()) {
            System.out.println("==end index is can not be grater than length of string == "+ string.length());
        }
    }
}
