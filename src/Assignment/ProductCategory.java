package Assignment;

//LIM TZE YANG //*
import java.util.Scanner;

public class ProductCategory {

    public ProductCategory() {
    }

    public static void displayProductMenu() {
        Scanner input = new Scanner(System.in);
        int choice; //Selection from books category

        System.out.print("\n\n=================\nProducts Category\n=================\n");
        System.out.print("1. Handhone\n2. Accessories\n3. Exit");

        do {
            try {
                System.out.print("\nPlease choose the number(1-3) :");
                choice = input.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                }
            } catch (Exception e) {
            } finally {

                input.nextLine();
            }

            System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 3\n");

        } while (true);

        switch (choice) {
            case 1:
                System.out.print("\n\n=================\nHandphone Category\n=================");
                System.out.print("\n1. iPhone\n2. Samsung\n3. Huawei\n4. Exit");

                do {
                    try {
                        System.out.print("\nPlease choose the number(1-4) :");
                        choice = input.nextInt();
                        if (choice >= 1 && choice <= 4) {
                            break;
                        }
                    } catch (Exception e) {
                    } finally {

                        input.nextLine();
                    }

                    System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");

                } while (true);
                ProductFunction.display(choice);
                break;
            case 2:
//                ProductFunction.display(4);
                System.out.println("==========================================================================================================");
                System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
                System.out.println("==========================================================================================================");
                for (int i = 0; i < ProductFunction.counterA; i++) {
                    System.out.println(String.format("%2d", i + 1) + "  " + ProductFunction.accessories[i]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
                break;
            case 3:
                Afirstpage.Menu();
                break;

            default:
                System.out.println("\n*****Incorrect input please choose again!*****\n");
        }

        /*System.out.print("Are you want to continue? (Y/N) : ");
    		char select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			MenuBook.menuBook();*/
    }

}
