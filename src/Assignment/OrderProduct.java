package Assignment;

//CHIN JOEL FEI, LIM TZE YANG, SOH ZHI YING, TAN YIH YEN //*

import java.util.Scanner;

public class OrderProduct extends ProductFunction {

    public static int[] buyiphone = new int[50];
    public static int[] buysamsung = new int[50];
    public static int[] buyhuawei = new int[50];
    public static int[] buyaccessories = new int[50];
    public static double salesI = 0;
    public static double salesS = 0;
    public static double salesH = 0;
    public static double salesA = 0;
    public static int countI = 0;
    public static int countS = 0;
    public static int countH = 0;
    public static int countA = 0;
    public static double x = 0;
    public static double tp = 0;
    char select;
    public static int counterOrder = 0;
    public static CustDeliveryDetails[] cust = new CustDeliveryDetails[100];

    public OrderProduct() {
    }

    public static void sellProduct() {
        Scanner input = new Scanner(System.in);
        int choice;
        char select;

        System.out.println("\n\t\t\t\t\t!REMINDER!");
        System.out.println("You will be only able to purchase 1 product per payment due to protected policy of each brand/company !!");
        System.out.println("\n*****Buying Product******");
        System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n5. Exit\n");

        do {
            try {
                System.out.print("\nPlease choose the category(1-5) :");
                choice = input.nextInt();
                if (choice >= 1 && choice <= 6) {
                    break;
                }
            } catch (Exception e) {
            } finally {

                input.nextLine();
            }

            System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 5\n");

        } while (true);

        switch (choice) {
            case 1:
                buyiphone();
                break;
            case 2:
                buysamsung();
                break;
            case 3:
                buyhuawei();
                break;
            case 4:
                buyaccessories();
                break;
            case 5:
                Afirstpage.Menu();
                break;

        }
        do {
            System.out.println("Do you want to buy another product? (Y/N): ");
            select = input.next().charAt(0);
            if (select == 'Y' || select == 'y') {
                sellProduct();
            } else if (select == 'n' || select == 'N') {
                Afirstpage.Menu();// +++++++++++++++++++
            } else {
                System.out.println("Invalid input please choose again!");
            }
        } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

    }

    public static void buyiphone() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choose = 0;
        double totalprice;
        double privilege = 0.02;
        String Sid;
        String Cid;
        boolean continueInput = true;
        char select;

        ProductFunction.display(1);  //   display

        do {
            do {
                try {
                    System.out.print("Enter the number of product customer want to buy : ");
                    choose = input.nextInt();
                    continueInput = false;
                } catch (Exception e) {
                    System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                    System.out.print("Enter the number of product customer want to buy : ");
                    input.nextLine();
                }
            } while (continueInput);
        } while (choose < 1 || choose > counterI);

        boolean confirm = false;
        do {
            if (iphone[choose - 1].getphoneQty() == 0) {
                System.out.print("\n\t\t\t\t\t\tWARNING!");
                System.out.print("\n\t\t\t\t\tThis product has out of stock!");
                confirm = false;
                System.out.print("\nDo you want to continue purchase another product? (Y/N): ");
                char resume = input.next().charAt(0);

                if (resume == 'Y' || resume == 'y') {
                    ProductCategory.displayProductMenu();
                    do {
                        do {
                            try {
                                System.out.print("Enter the number of product customer want to buy : ");
                                choose = input.nextInt();
                                continueInput = false;
                            } catch (Exception e) {
                                System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                                System.out.print("Enter the number of product customer want to buy : ");
                                input.nextLine();
                            }
                        } while (continueInput);
                    } while (choose < 1 || choose > counterI);
                } else if (resume == 'n' || resume == 'N') {
                    Afirstpage.Menu();

                } else {
                    System.out.println("Invalid input please choose again!");
                    confirm = true;
                }
            }
        } while (confirm);

        System.out.println("\n=============================================================================================================");
        System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
        System.out.println("=============================================================================================================");
        System.out.println(String.format("%2d", choose) + "  " + iphone[choose - 1]);                        //edit
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Select Delivery Company
        selectDeliveryCom();

        do {
            System.out.print("\nAny Membership? (Y/N)");
            select = input.next().charAt(0);
            if (select == 'Y' || select == 'y') {
                totalprice = ((x + iphone[choose - 1].getphonePrice())) * (1 - privilege);
                membership(totalprice);
                System.out.println("------------------------------------------");
                System.out.println("   2%s discount Member Privilege");
                calculatePayment(totalprice);
                tp = totalprice;
            } else if (select == 'n' || select == 'N') {
                totalprice = ((x + iphone[choose - 1].getphonePrice()));
                calculatePayment(totalprice);
                tp = totalprice;
                break;
            } else {
                System.out.println("Invalid input please choose again!");
            }
        } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

        //Staff
        boolean match = false;
        int a = 0;
        do {
            System.out.print("\nPlease enter Staff ID: ");
            Sid = input2.nextLine();
            for (int i = 0; i < StaffData.ExistingStaff; i++) //counter
            {
                if ((StaffData.MobileStaffs[i].getstaffID()).equals(Sid)) //search
                {
                    a = i;
                    match = true;
                    break;
                }

            }
            if (match == true) {
                StaffData.MobileStaffs[a].setSales(tp);
            } else {
                System.out.println("******Staff ID Not Found******\n");
            }

        } while (match == false);

        deliveryDetails();
        ProductFunction.iphone[choose - 1].setphoneQty((ProductFunction.iphone[choose - 1].getphoneQty()) - 1); //quatity minus 1
        Report.dailysales += tp; 
        buyiphone[countI] = choose - 1;//daily sales
        countI++;													//daily report
        salesI += tp;

    }

    public static void buysamsung() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choose = 0;
        double totalprice;
        double privilege = 0.02;
        String Sid;
        String Cid;
        boolean continueInput = true;
        char select;

        ProductFunction.display(2);  //   display
        do {
            do {
                try {
                    System.out.print("Enter the number of product customer want to buy : ");
                    choose = input.nextInt();
                    continueInput = false;
                } catch (Exception e) {
                    System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                    System.out.print("Enter the number of product customer want to buy : ");
                    input.nextLine();
                }
            } while (continueInput);
        } while (choose < 1 || choose > counterS);

        boolean confirm = false;
        do {
            if (samsung[choose - 1].getphoneQty() == 0) {
                System.out.print("\n\t\t\t\t\t\tWARNING!");
                System.out.print("\n\t\t\t\t\tThis product has out of stock!");
                confirm = false;
                System.out.print("\nDo you want to continue purchase another product? (Y/N): ");
                char resume = input.next().charAt(0);

                if (resume == 'Y' || resume == 'y') {
                    ProductCategory.displayProductMenu();
                    do {
                        do {
                            try {
                                System.out.print("Enter the number of product customer want to buy : ");
                                choose = input.nextInt();
                                continueInput = false;
                            } catch (Exception e) {
                                System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                                System.out.print("Enter the number of product customer want to buy : ");
                                input.nextLine();
                            }
                        } while (continueInput);
                    } while (choose < 1 || choose > counterS);
                } else if (resume == 'n' || resume == 'N') {
                    Afirstpage.Menu();
                } else {
                    System.out.println("Invalid input please choose again!");
                    confirm = true;
                }
            }

        } while (confirm);

        System.out.println("\n=============================================================================================================");
        System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
        System.out.println("=============================================================================================================");
        System.out.println(String.format("%2d", choose) + "  " + samsung[choose - 1]);                        //edit
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Select Delivery Company
        selectDeliveryCom();
        //Calculation

        do {
            System.out.print("\nAny Membership? (Y/N)");
            select = input.next().charAt(0);
            if (select == 'Y' || select == 'y') {
                totalprice = ((x + samsung[choose - 1].getphonePrice())) * (1 - privilege);
                membership(totalprice);
                System.out.println("------------------------------------------");
                System.out.println("   2%s discount Member Privilege");
                calculatePayment(totalprice);
                tp = totalprice;
            } else if (select == 'n' || select == 'N') {
                totalprice = ((x + samsung[choose - 1].getphonePrice()));
                calculatePayment(totalprice);
                tp = totalprice;
                break;
            } else {
                System.out.println("Invalid input please choose again!");
            }
        } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

        //Staff
        boolean match = false;
        int a = 0;
        do {
            System.out.print("\nPlease enter Staff ID: ");
            Sid = input2.nextLine();
            for (int i = 0; i < StaffData.ExistingStaff; i++) //counter
            {
                if ((StaffData.MobileStaffs[i].getstaffID()).equals(Sid)) //search
                {
                    a = i;
                    match = true;
                    break;
                }

            }
            if (match == true) {
                StaffData.MobileStaffs[a].setSales(tp);
            } else {
                System.out.println("******Staff ID Not Found******\n");
            }

        } while (match == false);


        deliveryDetails();
        ProductFunction.samsung[choose - 1].setphoneQty((ProductFunction.samsung[choose - 1].getphoneQty()) - 1); //quatity minus 1
        Report.dailysales += tp;															//daily sales
        buysamsung[countS] = choose - 1;
        countS++;													//daily report
        salesS += tp;																		//daily sales

    }

    public static void buyhuawei() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choose = 0;
        double totalprice;
        double privilege = 0.02;
        String Sid;
        String Cid;
        boolean continueInput = true;
        char select;

        ProductFunction.display(3);  //   display
        do {
            do {
                try {
                    System.out.print("Enter the number of product customer want to buy : ");
                    choose = input.nextInt();
                    continueInput = false;
                } catch (Exception e) {
                    System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                    System.out.print("Enter the number of product customer want to buy : ");
                    input.nextLine();
                }
            } while (continueInput);
        } while (choose < 1 || choose > counterH);

        boolean confirm = false;
        do {
            if (iphone[choose - 1].getphoneQty() == 0) {
                System.out.print("\n\t\t\t\t\t\tWARNING!");
                System.out.print("\n\t\t\t\t\tThis product has out of stock!");
                confirm = false;
                System.out.print("\nDo you want to continue purchase another product? (Y/N): ");
                char resume = input.next().charAt(0);

                if (resume == 'Y' || resume == 'y') {
                    ProductCategory.displayProductMenu();
                    do {
                        do {
                            try {
                                System.out.print("Enter the number of product customer want to buy : ");
                                choose = input.nextInt();
                                continueInput = false;
                            } catch (Exception e) {
                                System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                                System.out.print("Enter the number of product customer want to buy : ");
                                input.nextLine();
                            }
                        } while (continueInput);
                    } while (choose < 1 || choose > counterH);
                } else if (resume == 'n' || resume == 'N') {
                    Afirstpage.Menu();
                } else {
                    System.out.println("Invalid input please choose again!");
                    confirm = true;
                }
            }

        } while (confirm);

        System.out.println("\n=============================================================================================================");
        System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
        System.out.println("=============================================================================================================");
        System.out.println(String.format("%2d", choose) + "  " + huawei[choose - 1]);                        //edit
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Select Delivery Company
        selectDeliveryCom();

        //Calculation
        //calculate
        do {
            System.out.print("\nAny Membership? (Y/N)");
            select = input.next().charAt(0);
            if (select == 'Y' || select == 'y') {
                totalprice = ((x + huawei[choose - 1].getphonePrice())) * (1 - privilege);
                membership(totalprice);
                System.out.println("------------------------------------------");
                System.out.println("   2%s discount Member Privilege");
                calculatePayment(totalprice);
                tp = totalprice;
            } else if (select == 'n' || select == 'N') {
                totalprice = ((x + huawei[choose - 1].getphonePrice()));
                calculatePayment(totalprice);
                tp = totalprice;
                break;
            } else {
                System.out.println("Invalid input please choose again!");
            }
        } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

        //Staff
        boolean match = false;
        int a = 0;
        do {
            System.out.print("\nPlease enter Staff ID: ");
            Sid = input2.nextLine();
            for (int i = 0; i < StaffData.ExistingStaff; i++) //counter
            {
                if ((StaffData.MobileStaffs[i].getstaffID()).equals(Sid)) //search
                {
                    a = i;
                    match = true;
                    break;
                }

            }
            if (match == true) {
                StaffData.MobileStaffs[a].setSales(tp);
            } else {
                System.out.println("******Staff ID Not Found******\n");
            }

        } while (match == false);

        deliveryDetails();
        ProductFunction.huawei[choose - 1].setphoneQty((ProductFunction.huawei[choose - 1].getphoneQty()) - 1); //quantity minus 1
        Report.dailysales += tp; 																//daily sales
        buyhuawei[countH] = choose - 1;
        countH++;													//daily report
        salesH += tp;																		//daily sales
    }

    public static void buyaccessories() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choose = 0;
        double totalprice;
        double privilege = 0.02;
        String Sid;
        String Cid;
        boolean continueInput = true;
        char select;

        ProductFunction.display(4);  //   display
        do {
            do {
                try {
                    System.out.print("Enter the number of product customer want to buy : ");
                    choose = input.nextInt();
                    continueInput = false;
                } catch (Exception e) {
                    System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                    System.out.print("Enter the number of product customer want to buy : ");
                    input.nextLine();
                }
            } while (continueInput);
        } while (choose < 1 || choose > counterA);

        boolean confirm = false;
        do {
            if (accessories[choose - 1].getaccessoriesQty() == 0) {
                System.out.print("\n\t\t\t\t\t\tWARNING!");
                System.out.print("\n\t\t\t\t\tThis product has out of stock!");
                confirm = false;
                System.out.print("\nDo you want to continue purchase another product? (Y/N): ");
                char resume = input.next().charAt(0);

                if (resume == 'Y' || resume == 'y') {
                    ProductCategory.displayProductMenu();
                    do {
                        do {
                            try {
                                System.out.print("Enter the number of product customer want to buy : ");
                                choose = input.nextInt();
                                continueInput = false;
                            } catch (Exception e) {
                                System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
                                System.out.print("Enter the number of product customer want to buy : ");
                                input.nextLine();
                            }
                        } while (continueInput);
                    } while (choose < 1 || choose > counterA);
                } else if (resume == 'n' || resume == 'N') {
                    Afirstpage.Menu();
                } else {
                    System.out.println("Invalid input please choose again!");
                    confirm = true;
                }
            }

        } while (confirm);

        System.out.println("\n=============================================================================================================");
        System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
        System.out.println("=============================================================================================================");
        System.out.println(String.format("%2d", choose) + "  " + accessories[choose - 1]);                        //edit
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Select Delivery Company
        selectDeliveryCom();

        do {
            System.out.print("\nAny Membership? (Y/N)");
            select = input.next().charAt(0);
            if (select == 'Y' || select == 'y') {
                totalprice = ((x + accessories[choose - 1].getaccessoriesPrice())) * (1 - privilege);
                membership(totalprice);
                System.out.println("------------------------------------------");
                System.out.println("   2%s discount Member Privilege");
                calculatePayment(totalprice);  //Show price
                tp = totalprice;
            } else if (select == 'n' || select == 'N') {
                totalprice = ((x + accessories[choose - 1].getaccessoriesPrice()));
                calculatePayment(totalprice);  //Show price
                tp = totalprice;
                break;
            } else {
                System.out.println("Invalid input please choose again!");
            }
        } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

        //Staff
        boolean match = false;
        int a = 0;
        do {
            System.out.print("\nPlease enter Staff ID: ");
            Sid = input2.nextLine();
            for (int i = 0; i < StaffData.ExistingStaff; i++) //counter
            {
                if ((StaffData.MobileStaffs[i].getstaffID()).equals(Sid)) //search
                {
                    a = i;
                    match = true;
                    break;
                }

            }
            if (match == true) {
                StaffData.MobileStaffs[a].setSales(tp);
            } else {
                System.out.println("******Staff ID Not Found******\n");
            }

        } while (match == false);

        deliveryDetails();
        ProductFunction.accessories[choose - 1].setaccessoriesQty((ProductFunction.accessories[choose - 1].getaccessoriesQty()) - 1); //quatity minus 1
        Report.dailysales += tp; 																//daily sales
        buyaccessories[countA] = choose - 1;
        countA++;													//daily report
        salesA += tp;																		//daily sales
    }

    public static void selectDeliveryCom() {
        //Select Delivery Company
        Scanner input2 = new Scanner(System.in);
        System.out.println("\n\n=====Delivery Company =====");
        for (int i = 0; i < DeliveryCompanyData.counterCom; i++) {
            System.out.println(String.format("%2d", (i + 1)) + "." + DeliveryCompanyData.com[i].getComName() + (String.format(" ----- RM%.2f", DeliveryCompanyData.com[i].getPrice())));

        }

        int choice;
        do {
            try {
                System.out.print("Your choice : ");
                choice = input2.nextInt();
                if (choice >= 1 && choice <= DeliveryCompanyData.counterCom) {
                    break;
                }
            } catch (Exception e) {
            } finally {

                input2.nextLine();
            }

            System.out.printf("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to %d\n", DeliveryCompanyData.counterCom);

        } while (true);

        //System.out.println(DeliveryCompanyData.com[choice - 1].getComName());
        double shipping = DeliveryCompanyData.com[choice - 1].getPrice();
        x = shipping;
    }

    public static void membership(double totalprice) {
        String Cid;
        boolean match1 = false;
        int b = 0;
        Scanner input2 = new Scanner(System.in);

        do {
            System.out.print("\nPlease enter Member ID: ");
            Cid = input2.nextLine();
            for (int i = 0; i < MemberDisplay.counterMem; i++) //counter
            {
                if ((MemberDisplay.mem[i].getmemID()).equals(Cid)) //search
                {
                    b = i;
                    match1 = true;
                    break;
                }

            }
            if (match1 == true) {
                MemberDisplay.mem[b].setBuy(totalprice);
            } else {
                System.out.println("******Member ID Not Found******\n");
            }

        } while (match1 == false);

    }

    public static void calculatePayment(double totalprice) {
        int b = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.printf("   Total Price: RM%.2f \n", totalprice);
        System.out.println("------------------------------------------");
        System.out.print("\nSelect Payment Method:\n1. Cash\n2. Card");
        do {
            int m;
            try {
                System.out.print("\nMethod (1 or 2): ");
                m = input.nextInt();
                if (m == 1 || m == 2) {
                    break; //counter
                }
            } catch (Exception e) {
            } finally {
                input.nextLine();
            }
            System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number (1 - 2)\n");
        } while (true);

        MemberDisplay.mem[b].numbuy++;
        System.out.println("\n█▀▀█ █▀▀█ █░░█ █▀▄▀█ █▀▀ █▀▀▄ ▀▀█▀▀ 　 █▀▀ █░░█ █▀▀ █▀▀ █▀▀ █▀▀ █▀▀   ▄ ▀▄  ");
        System.out.println("█░░█ █▄▄█ █▄▄█ █░▀░█ █▀▀ █░░█ ░░█░░ 　 ▀▀█ █░░█ █░░ █░░ █▀▀ ▀▀█ ▀▀█   ─ ─█  ");
        System.out.println("█▀▀▀ ▀░░▀ ▄▄▄█ ▀░░░▀ ▀▀▀ ▀░░▀ ░░▀░░ 　 ▀▀▀ ░▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀   ▀ ▄▀\n");
        System.out.println("\n ");
    }

    public static void deliveryDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n[ Enter Delivery Details ]");

        String custName;
        boolean nameC = true;
        do {
            nameC = true;
            System.out.print("Name   : ");
            custName = input.nextLine();

            if (custName.length() > 40) {
                System.out.println("Name cannot more than 40 characters\nPlease insert again!\n");
            }
            for (int i = 0; i < custName.length(); i++) {
                if (Character.isDigit(custName.charAt(i))) {
                    System.out.println("Name cannot contains number!\nPlease insert again!\n");
                    nameC = false;
                }
            }
        } while (custName.length() > 30 || nameC == false);

        String custAddress;
        boolean addC = true;
        do {
            addC = true;
            System.out.print("Address  : ");
            custAddress = input.nextLine();

            if (custAddress.length() > 100) {
                System.out.println("Address cannot more than 60 characters\nPlease insert again!\n");
                addC = false;
            }
        } while (custAddress.length() > 100 || addC == false);

        String custCity;
        boolean cityC = true;
        do {
            cityC = true;
            System.out.print("State : ");
            custCity = input.nextLine();

            for (int i = 0; i < custCity.length(); i++) {
                if (Character.isDigit(custCity.charAt(i))) {
                    System.out.println("City cannot contains number!\nPlease insert again!\n");
                    cityC = false;
                }
            }

        } while (cityC = false);

        String custPostcode;
        boolean postcodeC = true;
        do {
            nameC = true;
            System.out.print("Postcode   : ");
            custPostcode = input.nextLine();

            if (custPostcode.length() > 5) {
                System.out.println("Postcode cannot more than 5 digit!\nPlease insert again!\n");
            }
            for (int i = 0; i < custPostcode.length(); i++) {
                if (Character.isLetter(custPostcode.charAt(i))) {
                    System.out.println("Invalid postcode format!\nPlease insert again!\n");
                    postcodeC = false;
                }
            }
        } while (custPostcode.length() > 5 || postcodeC == false);

        int postcode = Integer.parseInt(custPostcode);

        String phone;
        boolean phoneC = true;
        do {
            phoneC = true;
            System.out.print("Contact number : ");
            phone = input.nextLine();

            if (phone.charAt(0) != '0' || phone.charAt(1) != '1' || phone.length() > 11 || phone.length() < 10) {
                System.out.println("Invalid phone format! Please insert again!\n");
                phoneC = false;
                continue;
            }
            for (int i = 0; i < phone.length(); i++) {
                if (Character.isLetter(phone.charAt(i))) {
                    System.out.println("Invalid phone format! Please insert again!\n");
                    phoneC = false;
                    break;
                }
            }
        } while (phoneC == false);

        String id;
        boolean result = false;
        //input.nextLine();
        do {

            System.out.println("Order ID     : D00" + (counterOrder + 1) + "<<<<<");
            System.out.print("Please follow the Order ID given to insert the Order ID again for confirmation : ");
            id = input.nextLine();
            result = true;

            if (id.length() != 4) {
                System.out.println("Order ID unmatch, please insert again!");
            } else if (id.charAt(0) != 'D') {
                System.out.println("Order ID unmatch, please insert again!");
            } else if (id.charAt(1) != '0') {
                System.out.println("Order ID unmatch, please insert again!");
            } else if (id.charAt(2) != (((int)(counterOrder+1)/10)) + '0') {
                System.out.println("Order ID unmatch, please insert again!");
            } else if (id.charAt(3) != (((int)(counterOrder+1)%10)) + '0') {
                System.out.println("Order ID unmatch, please insert again!");
            } 	
            else 
                result = false;
        } while (result == true);

        String status = "Paid";

        cust[counterOrder] = new CustDeliveryDetails(custName, custAddress, custCity, postcode, phone, id, status);
        //System.out.println(String.format("%2d", counterOrder + 1) + "  " + cust[counterOrder]);
        counterOrder++;
        System.out.print("\n\t\t*******Order placed Successfully*******\n\n");
        //System.out.print("-----Receipt-----\n");
        //System.out.printf("Ship To : %s",cust[counterOrder].getCustName());
        //System.out.printf("\n%s,\n%s,%d", cust[counterOrder].getCustAddress(),cust[counterOrder].getCustCity(),cust[counterOrder].getCustPostcode());
        
    }
}
