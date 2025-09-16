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
                stringCode.showAllStringCodeMenuAndProcess();
                break;
            }

            case breakCase -> {
                System.out.println("Exiting the Code flow.");
                break;
            }
            default -> System.out.println("Invalid option");
        }
        return option;
    }
}
