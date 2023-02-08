package Assignment;

//LIM TZE YANG //*
import java.util.Scanner;

public class ProductFunction {

    public static PhoneClass[] iphone = new PhoneClass[30];
    public static PhoneClass[] samsung = new PhoneClass[30];
    public static PhoneClass[] huawei = new PhoneClass[30];
    public static PhoneAccessoriesClass[] accessories = new PhoneAccessoriesClass[30];

    public static int counterI = 10;
    public static int counterS = 10;
    public static int counterH = 10;
    public static int counterA = 11;
    public static int counterHand = 30;

    public ProductFunction() {

    }

    public static void iniProducts() {
        iphone[0] = new PhoneClass("I001", "Iphone 12 128GB", "Black Colour", "Phone", 3599.0, 0);
        iphone[1] = new PhoneClass("I002", "Iphone 12 256GB", "Black Colour", "Phone", 4099.0, 1);
        iphone[2] = new PhoneClass("I003", "Iphone 12 128GB", "White Colour", "Phone", 3599.0, 5);
        iphone[3] = new PhoneClass("I004", "Iphone 12 256GB", "White Colour", "Phone", 4099.0, 5);
        iphone[4] = new PhoneClass("I005", "Iphone 12 Pro Max 128GB", "Black Colour", "Phone", 5299.0, 5);
        iphone[5] = new PhoneClass("I006", "Iphone 12 Pro Max 256GB", "Black Colour", "Phone", 5799.0, 5);
        iphone[6] = new PhoneClass("I007", "Iphone 12 Pro Max 128GB", "White Colour", "Phone", 5299.0, 5);
        iphone[7] = new PhoneClass("I008", "Iphone 12 Pro Max 256GB", "White Colour", "Phone", 5799.0, 5);
        iphone[8] = new PhoneClass("I009", "Iphone 12 Pro Max 128GB", "Gold Colour", "Phone", 5299.0, 5);
        iphone[9] = new PhoneClass("I010", "Iphone 12 Pro Max 256GB", "Gold Colour", "Phone", 5799.0, 5);

        samsung[0] = new PhoneClass("S001", "Samsung Note 10 128GB", "Black Colour", "Phone", 3299.0, 5);
        samsung[1] = new PhoneClass("S002", "Samsung Note 10 256GB", "Black Colour", "Phone", 3299.0, 5);
        samsung[2] = new PhoneClass("S003", "Samsung Note 10 128GB", "White Colour", "Phone", 3299.0, 5);
        samsung[3] = new PhoneClass("S004", "Samsung Note 10 256GB", "White Colour", "Phone", 3299.0, 5);
        samsung[4] = new PhoneClass("S005", "Samsung Note 10+ 128GB", "Black Colour", "Phone", 3299.0, 5);
        samsung[5] = new PhoneClass("S006", "Samsung Note 10+ 256GB", "Black Colour", "Phone", 3299.0, 5);
        samsung[6] = new PhoneClass("S007", "Samsung Note 10+ 128GB", "White Colour", "Phone", 3299.0, 5);
        samsung[7] = new PhoneClass("S008", "Samsung Note 10+ 256GB", "White Colour", "Phone", 3299.0, 5);
        samsung[8] = new PhoneClass("S009", "Samsung Note 20 Ultra 5G 256GB", "Black Colour", "Phone", 3299.0, 5);
        samsung[9] = new PhoneClass("S010", "Samsung Note 20 Ultra 5G 512GB", "Gold Colour", "Phone", 3299.0, 5);

        huawei[0] = new PhoneClass("H001", "Huawei P40 128GB", "Black Colour", "Phone", 3299.00, 5);
        huawei[1] = new PhoneClass("H002", "Huawei P40 256GB", "Black Colour", "Phone", 3799.00, 5);
        huawei[2] = new PhoneClass("H003", "Huawei P40 128GB", "White Colour", "Phone", 3299.00, 5);
        huawei[3] = new PhoneClass("H004", "Huawei P40 256GB", "White Colour", "Phone", 3799.00, 5);
        huawei[4] = new PhoneClass("H005", "Huawei P40 Pro 128GB", "Black Colour", "Phone", 3899.00, 5);
        huawei[5] = new PhoneClass("H006", "Huawei P40 Pro 256GB", "Black Colour", "Phone", 4399.00, 5);
        huawei[6] = new PhoneClass("H007", "Huawei P40 Pro 128GB", "White Colour", "Phone", 3899.00, 5);
        huawei[7] = new PhoneClass("H008", "Huawei P40 Pro 256GB", "White Colour", "Phone", 4399.00, 5);
        huawei[8] = new PhoneClass("H009", "Huawei Mate 40 Pro 256GB", "Black Colour", "Phone", 3899.00, 5);
        huawei[9] = new PhoneClass("H010", "Huawei Mate 40 Pro 256GB", "Silver Colour", "Phone", 3899.00, 5);

        accessories[0] = new PhoneAccessoriesClass("A001", "Iphone 12 Phone Case", "Transparent", "Accessories", 20.0, 5);
        accessories[1] = new PhoneAccessoriesClass("A002", "Iphone 12 Pro Max Phone Case", "Transparent", "Accessories", 25.0, 5);
        accessories[2] = new PhoneAccessoriesClass("A003", "Samsung Note 10 Phone Case", "Transparent", "Accessories", 20.0, 5);
        accessories[3] = new PhoneAccessoriesClass("A004", "Samsung Note 10+ Phone Case", "Transparent", "Accessories", 25.0, 5);
        accessories[4] = new PhoneAccessoriesClass("A005", "Samsung Note 20 Ultra 5G Phone Case", "Transparent", "Accessories", 30.0, 5);
        accessories[5] = new PhoneAccessoriesClass("A006", "Huawei P40 Phone Case", "Transparent", "Accessories", 15.0, 5);
        accessories[6] = new PhoneAccessoriesClass("A007", "Huawei P40 Pro Phone Case", "Transparent", "Accessories", 20.0, 5);
        accessories[7] = new PhoneAccessoriesClass("A008", "Huawei Mate 40 Pro Phone Case", "Transparent", "Accessories", 30.0, 5);
        accessories[8] = new PhoneAccessoriesClass("A009", "Iphone Charging Cable", "White Colour", "Accessories", 15.0, 5);
        accessories[9] = new PhoneAccessoriesClass("A010", "Samsung Charging Cable", "White Colour", "Accessories", 15.0, 5);
        accessories[10] = new PhoneAccessoriesClass("A011", "Huawei Charging Cable", "White Colour", "Accessories", 15.0, 5);

    }

    public static void display(int choice) {
        //Scanner input = new Scanner(System.in);
        
//        System.out.print("\n\n=================\nHandphone Category\n=================\n");
//        System.out.print("\n\n1. iPhone\n2. Samsung\n3. Huawei\n4. Exit");
//
//        do {
//            try {
//                System.out.print("\nPlease choose the number(1-4) :");
//                choice = input.nextInt();
//                if (choice >= 1 && choice <= 4) {
//                    break;
//                }
//            } catch (Exception e) {
//            } finally {
//
//                input.nextLine();
//            }
//
//            System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
//
//        } while (true);

        if (choice == 1) {
            System.out.print("\nCategory: Iphone\n");
        } else if (choice == 2) {
            System.out.print("\nCategory: Samsung\n");
        } else if (choice == 3) {
            System.out.print("\nCategory: Huawei\n");
        } else if (choice == 4) {
//            System.out.print("\nCategory: Accessories\n");
            ProductCategory.displayProductMenu();
        }

        System.out.println("==========================================================================================================");
        System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
        System.out.println("==========================================================================================================");
        switch (choice) {
            case 1:
                for (int i = 0; i < counterI; i++) {
                    System.out.println(String.format("%2d", i + 1) + "  " + iphone[i]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");

                }
                break;
            case 2:
                for (int i = 0; i < counterS; i++) {
                    System.out.println(String.format("%2d", i + 1) + "  " + samsung[i]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");

                }
                break;
            case 3:
                for (int i = 0; i < counterH; i++) {
                    System.out.println(String.format("%2d", i + 1) + "  " + huawei[i]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");

                }
                break;
//                case 4:
//                    for (int i = 0; i < counterA; i++) {
//                        System.out.println(String.format("%2d", i + 1) + "  " + accessories[i]);
//                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
//
//                    }
//                    break;

        }

    }
}
