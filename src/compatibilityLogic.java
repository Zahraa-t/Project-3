import java.util.Scanner;

public class compatibilityLogic {
    private final Scanner scanner;
    private final int testNum;

    public compatibilityLogic(int testNum) {
        scanner = new Scanner(System.in);
        this.testNum = testNum;
    }

    public void start() {
        System.out.println("Welcome to the compatibility test. You must take at least " + testNum + " out of 2 tests. ");
        test();
        System.out.println("Would you like to take a different test?\nyes/no");
        String extraTest = scanner.nextLine();
        System.out.println();
        if (extraTest.equals("yes")) {
            System.out.println("The second method is similar to the game ___ loves me, ___ loves me. How many times would you like to play?");
            int repeats = scanner.nextInt();
            test(repeats);
        }
        System.out.println("Thank you for using this test!");
    }

    private void test() {
        System.out.println("The first method will calculate your compatibility based on your names");
        int done = 0;
        while (done == 0) {
            System.out.print("Please write names in lower case.\nEnter the first name: ");
            String nameOne = scanner.nextLine();
            System.out.print("Enter the second name: ");
            String nameTwo = scanner.nextLine();
            String nameOneCheck = nameOne.toLowerCase();
            String nameTwoCheck = nameTwo.toLowerCase();
            if (nameOne.equals(nameOneCheck) && (!nameOne.equals("")) && nameTwo.equals(nameTwoCheck) && (!nameTwo.equals(""))) {
                compatibility compatible = new compatibility(nameOne,nameTwo);
                System.out.println(compatible.nameCompat());
                System.out.println();
                done++;
            }
        }
    }

    private void test(int answer) {
        for (int i = 1; i <= answer; i++) {
            System.out.println("Choose between the starting on a\n(1) high compatibility\n(2) low compatibility");
            System.out.println();
            int flowerNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            compatibility compatible2 = new compatibility(flowerNum);
            System.out.println(compatible2.flowerResults());
        }
    }
}