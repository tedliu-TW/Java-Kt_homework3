package mailbox;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        int height = scanner.nextInt();
        Box3 box3 = new Box3();
        box3.validate(length,width,height);

        Box5 box5 = new Box5();
        box5.validate(length,width,height);

    }
}
