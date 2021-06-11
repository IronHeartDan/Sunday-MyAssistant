import java.util.Random;
import java.util.Scanner;

public class Sunday {
    public static void main(String[] args) {
        setUser();
    }

    private static void setUser() {
        User user = new User();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!! I am Sunday");
        System.out.println("What Is Your Good Name");
        user.setName(sc.nextLine());
        System.out.println("Welcome " + user.getName());
        System.out.println("Enter Your Age");
        user.setAge(sc.nextInt());


        setSex(user, sc);
    }

    private static void setSex(User user, Scanner sc) {
        System.out.println("What Is Your Sex(Gender)");
        System.out.println("For Male Press 1");
        System.out.println("For Female Press 2");
        System.out.println("For Other Press 3");
        switch (sc.nextInt()) {
            case 1 -> {
                user.setSex("Male");
                show(user, sc);
            }
            case 2 -> {
                user.setSex("Female");
                show(user, sc);
            }
            case 3 -> {
                user.setSex("Other");
                show(user, sc);
            }
            default -> {
                System.out.println("Wrong Input");
                setSex(user, sc);
            }
        }

    }

    private static void show(User user, Scanner sc) {
        System.out.println("A User Is Set For Sunday");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Sex: " + user.getSex());
        init(sc);
    }

    private static void init(Scanner sc) {
        System.out.println("...................");
        System.out.println("...................");
        System.out.println("...................");
        System.out.println("...................");


        System.out.println("Let's Have Fun");
        System.out.println("Stuff I Can Do!");
        System.out.println("Press 1 To Toss A Coin");
        System.out.println("Press 2 To Roll A Dice");
        System.out.println("Press 3 To Update User");

        switch (sc.nextInt()) {
            case 1 -> {
                //Toss A Coin
                if (new Random().nextInt((1) + 1) == 1) {
                    System.out.println("It's Head");
                } else {
                    System.out.println("It's Tails");
                }
                init(sc);
            }

            case 2 -> {
                System.out.println("Rolling Dice");
                int d = new Random().nextInt((6 - 2) + 1);
                if (d == 0) {
                    System.out.println("Dice Result Is 1");
                } else {
                    System.out.println("Dice Result Is " + d);
                }
                init(sc);
            }

            case 3 -> setUser();

            default -> init(sc);


        }

    }
}
