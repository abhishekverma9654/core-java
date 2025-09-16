package program;

import static Constants.Constant.breakCase;

public class CodeMenu {
    public void showAllCodeMenu() {
        System.out.println("1. String Programs.");
        System.out.println(breakCase +". Exit.");
    }

    public int selectOptionAndProcess(int option) {
        switch (option) {
            case 1 -> {
                StringCode stringCode = new StringCode();
                stringCode.hello();
                break;
            }

            case breakCase -> {
                System.out.println("Program Break");
                break;
            }
            default -> System.out.println("Invalid option");
        }
        return option;
    }
}
