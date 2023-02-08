package Assignment;

//SOH ZHI YING //*
import java.util.Scanner;

public class CustOrderSearch extends OrderProduct {

    public CustOrderSearch() {
    }

    public static void SearchOrder() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        boolean match = false;
        String data;
        char select;
        int choose;
        char option;

        System.out.print("\nSearch by Order ID: ");
        data = input.nextLine();

        for (int i = 0; i < counterOrder; i++) //counter
        {
            if ((cust[i].getOrderID()).equals(data)) //search
            {
                a = i;
                match = true;
                break;
            }

        }

        if (match == true) {
            if ((cust[a].getStatus()).equals("Paid")) {
                System.out.println("===========================================================================================================================================");
                System.out.println("\tOrder ID \tShip To \tCustomer Address \t State \t Postcode \tPhone \t\t Delivery Status");
                System.out.println("===========================================================================================================================================");
                System.out.println(String.format("%2d", a + 1) + "  " + cust[a]);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

                String s;
                do {
                    System.out.println("Have you receive the product ? (Y/N): ");
                    select = input.next().charAt(0);
                    if (select == 'Y' || select == 'y') {
                        s = "Received";
                        for (int i = 0; i < OrderProduct.counterOrder; i++) {
                            cust[a].setStatus(s);
                            System.out.print("\n1.Rate \n2.Return \nChoose : ");
                            choose = input.nextInt();
                            if (choose == 1) {
                                System.out.print("How many star would you like to give us (1-5) : ");
                                int rate = input.nextInt();
                                String r = "Rated";
                                cust[a].setStatus(r);
                                System.out.println("\n\t\t*******Rated Succesfully*******");
                                //System.out.println(String.format("%2d", a + 1) + "  " + cust[a]);
                                //Do you want to search another order ? 
                                do {
                                System.out.println("Do you want to search another order? (Y/N): ");
                                select = input.next().charAt(0);
                                if (select == 'Y' || select == 'y') {
                                    SearchOrder();
                                } else if (select == 'n' || select == 'N') {
                                    Afirstpage.Menu();// +++++++++++++++++++
                                } else {
                                    System.out.println("Invalid input please choose again!");
                                }
                            } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');
                                Afirstpage.Menu();
                            } else if (choose == 2) {
                                productReturn();

                                do {
                                    System.out.print("Return accept? (Y/N) :");
                                    option = input.next().charAt(0);
                                    if (option == 'Y' || option == 'y') {
                                        String pr = "Returned";
                                        cust[a].setStatus(pr);
                                        System.out.println(String.format("%2d", a + 1) + "  " + cust[a]);
                                        System.out.println("\n\t\t*******Product Return Successfully*******\n");
                                    } else if (option == 'n' || option == 'N') {
                                        String pr = "Return unsuccess";
                                        cust[a].setStatus(pr);
                                        System.out.println("\n\t\t*******Product Return Unsuccess*******\n");
                                    } else {
                                        System.out.println("Please enter a valid option !");
                                    }
                                } while (option != 'Y' && option != 'y' && option != 'n' && option != 'N');

                            }
                            //Do you wan to search another order ?
                            do {
                                System.out.println("Do you want to search another order? (Y/N): ");
                                select = input.next().charAt(0);
                                if (select == 'Y' || select == 'y') {
                                    SearchOrder();
                                } else if (select == 'n' || select == 'N') {
                                    Afirstpage.Menu();// +++++++++++++++++++
                                } else {
                                    System.out.println("Invalid input please choose again!");
                                }
                            } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');
                        }
                    } else if (select == 'n' || select == 'N') {
                        Afirstpage.Menu();
                    } else {
                        System.out.println("Invalid input please choose again!");
                    }
                } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');

            } else {
                System.out.println(String.format("%2d", a + 1) + "  " + cust[a]);
                //do you wan to search another order ? 
                do {
                                System.out.println("Do you want to search another order? (Y/N): ");
                                select = input.next().charAt(0);
                                if (select == 'Y' || select == 'y') {
                                    SearchOrder();
                                } else if (select == 'n' || select == 'N') {
                                    Afirstpage.Menu();
                                } else {
                                    System.out.println("Invalid input please choose again!");
                                }
                            } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');
            }

        } else {
            System.out.println("******Order ID Not Found******\n");
            //do you wan to search another order ? 
            do {
                                System.out.println("Do you want to search another order? (Y/N): ");
                                select = input.next().charAt(0);
                                if (select == 'Y' || select == 'y') {
                                    SearchOrder();
                                } else if (select == 'n' || select == 'N') {
                                    Afirstpage.Menu();// +++++++++++++++++++
                                } else {
                                    System.out.println("Invalid input please choose again!");
                                }
                            } while (select != 'Y' && select != 'y' && select != 'n' && select != 'N');
        }

    }

    public static void productReturn() {
        Scanner sc = new Scanner(System.in);
        String reason;
        double price;

        System.out.print("Enter the Reason for return: ");
        reason = sc.nextLine();
        System.out.print("Enter the price needed for return : ");
        price = sc.nextDouble();

    }
}
