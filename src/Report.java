//CHIN JOEL FEI, LIM TZE YANG, SOH ZHI YING, TAN YIH YEN //*

import java.util.Scanner;
public class Report extends OrderProduct{
    public static double dailysales=0;

    public Report() {
    }
    
    public static void report(){
    	Scanner input = new Scanner(System.in);
    	char select;
    	System.out.println("\n******Summary Report*****");
    	System.out.println("Select the type of report: ");
    	System.out.println("1. Daily Sales Report\n2. Customer Total Purchase Report\n3. Staff Sales Report\n4. Privilege Report\n5. Stock Report");
    	
    	int choice;
    	do{
    		try{
    				System.out.print("\nYour choice :");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=6) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number and between 1 to 6\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choice){
    		case 1:
    		{
    			System.out.println("\n===========================================================================================================");
    			System.out.println("********************************************Sold Product Details********************************************");
    			System.out.println("===========================================================================================================");
    			System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    			System.out.println("===========================================================================================================");
    	
    			for(int i=0;i<OrderProduct.countI;i++)
    			{
    					System.out.println(iphone[buyiphone[i]]);
    					System.out.println("-----------------------------------------------------------------------------------------------------------");
    				
    					
    			}
    			for(int i=0;i<OrderProduct.countS;i++)
    			{
    			
    				
    					System.out.println(samsung[buysamsung[i]]);
    					System.out.println("-----------------------------------------------------------------------------------------------------------");
    				
    			}
    			for(int i=0;i<OrderProduct.countH;i++)
    			{
    			
    					System.out.println(huawei[buyhuawei[i]]);
    					System.out.println("-----------------------------------------------------------------------------------------------------------");
    				
    			}
    			for(int i=0;i<OrderProduct.countA;i++)
    			{
    				
    					System.out.println(accessories[buyaccessories[i]]);
    					System.out.println("-----------------------------------------------------------------------------------------------------------");
    				
    			}break;
    		}
    		case 2:
    		{
    			System.out.println("\n=============================================================");
    			System.out.println("*****************Customer Total Buy Report****************");
    			System.out.println("=============================================================");
    			System.out.println("MemberID\tName\t\t\tTotal Buy(RM)\tTotal Number");
    			System.out.println("=============================================================");
    			
    			for(int i=0;i<MemberDisplay.counterMem;i++)
    			{
    				if(MemberDisplay.mem[i].getBuy()!=0){
    					System.out.println(MemberDisplay.mem[i].getmemID()+"        "+String.format("%-16s",MemberDisplay.mem[i].getName())+
    					String.format("%-20.2f",MemberDisplay.mem[i].getBuy())+MemberDisplay.mem[i].numbuy);
    					System.out.println("-------------------------------------------------------------");
    				}
    					
    			}break;
    		}
    		case 3:
    		{
    			System.out.println("\n=============================================================");
    			System.out.println("*****************Staff Performance Report****************");
    			System.out.println("=============================================================");
    			System.out.println("StaffID  Name\t\t\tTotal Sales(RM)\t Number of Sales");
    			System.out.println("=============================================================");
    			
    			for(int i=0;i<StaffData.ExistingStaff;i++)
    			{
    				if(StaffData.MobileStaffs[i].getSales()!=0){
    					System.out.println(StaffData.MobileStaffs[i].getstaffID()+"    "+String.format("%-16s",StaffData.MobileStaffs[i].getName())+
    					String.format("%-17.2f",StaffData.MobileStaffs[i].getSales())+StaffData.MobileStaffs[i].numsales);
    					System.out.println("-------------------------------------------------------------");
    				}
    					
    			}
    			break;
    		}
    		case 4:
    		{
    			System.out.println("\n=============================================================");
    			System.out.println("*****************Total Privilege Given Report****************");
    			System.out.println("=============================================================");
    			double totalP = dailysales*2/98;
    			System.out.printf("Total Privilege: RM%.2f\n",totalP);
    			break;
    		}
    		case 5:
    		{
    			int stockI=0;
    			int stockS=0;
    			int stockH=0;
    			int stockA=0;
    			System.out.println("\n========================================================");
    			System.out.println("*****************Product Stock Level Report****************");
    			System.out.println("========================================================");
    			System.out.println("Category     Quantity");
    			System.out.println("========================================================");
    			
    			for(int i=0;i<ProductFunction.counterI;i++)
    			{
    				stockI+=iphone[i].getproductQty();
    			}
    			for(int i=0;i<ProductFunction.counterS;i++)
    			{
    				stockS+=samsung[i].getproductQty();
    			}
    			for(int i=0;i<ProductFunction.counterH;i++)
    			{
    				stockH+=huawei[i].getproductQty();
    			}
    			for(int i=0;i<ProductFunction.counterA;i++)
    			{
    				stockA+=accessories[i].getproductQty();
    			}

    			System.out.println("iPhone         : "+stockI);
    			System.out.println("Samsung        : "+stockS);
    			System.out.println("Huawei         : "+stockH);
    			System.out.println("Accessories    : "+stockA);
    			break;	
    		}
                case 6:
                {
                    System.out.println("\n===================================================================");
    			System.out.println("*****************Customer Delivery Details Report****************");
    			System.out.println("=================================================================");
    			System.out.println("Order ID     Status");
    			System.out.println("=================================================================");
                        for (int i = 0; i < counterOrder; i++){
                            System.out.println(String.format("%2d", i + 1) + "  " + cust[i]);
                        }
                }
    		
    	}//end of switch
    	
    	do{
    			System.out.println("\nDo you want to view another Report? (Y/N): ");
    			select = input.next().charAt(0);
    			if(select=='Y'||select=='y')
    				report();
    			else if(select=='n'||select=='N')
    				Afirstpage.Menu();
    			else
    			{
    				System.out.println("Invalid input please choose again!");
    			}
    		}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
}
