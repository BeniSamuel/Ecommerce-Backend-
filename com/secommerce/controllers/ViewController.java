package controllers;

import java.util.Scanner;

public class ViewController {
    public void view() {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. View Products\n2. Search Product\n3. View Favourites\n4. View Cart\n5. View Profile\n6. Quit");

            
            System.out.println("Enter a Choice: ");
            int choice = sc.nextInt();

            // Switching case for choicing

            ProductController productControl = new ProductController();

            switch (choice) {
                case 1:
                    productControl.getItems();
                    break;
                case 2:

                    System.out.println("Enter product name: ");
                    String name = sc.next();
                    productControl.searchProduct(name);
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

            if (choice == 6) {
                break;
            }
        }

        sc.close();
    }
}
