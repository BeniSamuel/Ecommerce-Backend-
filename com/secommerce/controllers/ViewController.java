package controllers;

import java.util.Scanner;

public class ViewController {
    public void view() {

        while (true) {
            System.out.println(
                    "1. View Products\n2. Search Product\n3. View Favourites\n4. View Cart\n5. View Profile\n6. Quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Choice: ");
            int choice = sc.nextInt();

            // Switching case for choicing

            ProductController productControl = new ProductController();

            switch (choice) {
                case 1:
                    productControl.getItems();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    break;
            }
        }

    }
}
