import java.util.Scanner;

public class compatibility {
    private String name1;
    private String name2;
    private int whichFlower;

    public compatibility(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
        Scanner scan = new Scanner(System.in);
    }

    public compatibility(int whichFlower) {
        this.whichFlower = whichFlower;
        Scanner scan = new Scanner(System.in);
    }

    //Game 1
    public String nameCompat() {
        int percentage = 15;
        if(!name1.equals(name2)) {
            percentage = 30;
        }
        if (name2.indexOf(name1.substring(0,1)) != -1){
            percentage += 27;
        }
        if (name1.indexOf(name2.substring(0,1)) != -1){
            percentage -= 12;
        }
        if (name1.length() < name2.length()) {
            percentage += 7;
        } else if (name2.length() < name1.length()) {
            percentage += 13;
        } else {
            percentage += 11;
        }
        int finalPoints = Math.abs(name1.compareTo(name2));
        percentage += finalPoints;
        return percentage + "%!";
    }

    //Game 2
    public String flowerResults() {
        //Allows you to choose from starting with a low or high compatibility and will alternate
        boolean results = whichFlower == 1;
        int startingNum = (int) (Math.random() * 15) + 1;
        System.out.println("You pick up a " + startingNum + "-petalled flower.");
        for (int i = 2; i <= startingNum; i++) {
            if (results == true) {
                results = false;
            } else {
                results = true;
            }
        }
        flowerDisplay(startingNum);
        if (results == true) {
            return "Loading results.... \nCompatibility: High \n";
        } else {
            return "Loading results.... \nCompatibility: Low \n";
        }
    }

    private void flowerDisplay(int starter) {
        for (int i = 1; i <= starter; i++)
        {
            for (int j = 1; j < i; j++)
            {
                if (j%2==1){
                    System.out.print("  ");
                }
            }
            System.out.println(",");
        }
        System.out.println("The last petal falls to the ground. ");
    }
}


