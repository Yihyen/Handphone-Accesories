package Assignment;

//LIM TZE YANG //*

import java.util.Scanner;
public class ProductDelete extends ProductFunction{

    public ProductDelete() {
    }
    
    public static void deleteProduct()
    {
    	Scanner input = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("\n*****Delete Product******");
    	System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n");
    		
    	do{
    		try{
    				System.out.print("\nPlease choose the category(1-4) :");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=6) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choice){
    		case 1: deleteIphone();break;
    		case 2: deleteSamsung();break;
    		case 3: deleteHuawei();break;
    		case 4: deleteAccessories();break;
    	}
    			
    }
    
    public static void deleteIphone(){
    	ProductFunction.display(1);
    	Scanner input = new Scanner(System.in);
    	int choose;
    	char choice;
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to delete: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterI) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+iphone[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    	
    	do{
    		System.out.println("Are you sure you want to delete? (Y/N) :");
    		choice = input.next().charAt(0);
    		if(choice=='Y'||choice=='y')
    		{
    			int a=0;
    			PhoneClass[] temp = new PhoneClass[30];
    			for(int i=0 ;i<counterI;i++)
    			{
    				if(i!=(choose-1))
    				{
    					temp[a]=iphone[i];                            //copy
    					a++;
    				}
    			}	
    			counterI--;                                            //counter
    			for(int i=0;i<counterI;i++)                            //counter
    			{
    				iphone[i]=temp[i];								//copy
    			}
    			System.out.println("\n******Record Deleted******\n");
    		}	
    		else if(choice=='n'||choice=='N')
    			continue;// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(choice!='Y'&&choice!='y'&&choice!='n'&&choice!='N');
    	
    	
    	do{
    		System.out.println("Do you want to delete another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			deleteProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    }
    
    public static void deleteSamsung(){
    	ProductFunction.display(2);
    	Scanner input = new Scanner(System.in);
    	int choose;
    	char choice;
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to delete: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterS) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+samsung[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    	
    	do{
    		System.out.println("Are you sure you want to delete? (Y/N) :");
    		choice = input.next().charAt(0);
    		if(choice=='Y'||choice=='y')
    		{
    			int a=0;
    			PhoneClass[] temp = new PhoneClass[30];
    			for(int i=0 ;i<counterS;i++)
    			{
    				if(i!=(choose-1))
    				{
    					temp[a]=samsung[i];                            //copy
    					a++;
    				}
    			}	
    			counterS--;                                            //counter
    			for(int i=0;i<counterS;i++)                            //counter
    			{
    				samsung[i]=temp[i];								//copy
    			}
    			System.out.println("\n******Record Deleted******\n");
    		}	
    		else if(choice=='n'||choice=='N')
    			continue;// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(choice!='Y'&&choice!='y'&&choice!='n'&&choice!='N');
    	
    	
    	do{
    		System.out.println("Do you want to delete another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			deleteProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    }
    
    public static void deleteHuawei(){
    	ProductFunction.display(3);
    	Scanner input = new Scanner(System.in);
    	int choose;
    	char choice;
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to delete: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterH) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+huawei[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    	
    	do{
    		System.out.println("Are you sure you want to delete? (Y/N) :");
    		choice = input.next().charAt(0);
    		if(choice=='Y'||choice=='y')
    		{
    			int a=0;
    			PhoneClass[] temp = new PhoneClass[30];
    			for(int i=0 ;i<counterH;i++)
    			{
    				if(i!=(choose-1))
    				{
    					temp[a]=huawei[i];                            //copy
    					a++;
    				}
    			}	
    			counterH--;                                            //counter
    			for(int i=0;i<counterH;i++)                            //counter
    			{
    				huawei[i]=temp[i];								//copy
    			}
    			System.out.println("\n******Record Deleted******\n");
    		}	
    		else if(choice=='n'||choice=='N')
    			continue;// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(choice!='Y'&&choice!='y'&&choice!='n'&&choice!='N');
    	
    	
    	do{
    		System.out.println("Do you want to delete another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			deleteProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    }
    
    public static void deleteAccessories(){
    	ProductFunction.display(4);
    	Scanner input = new Scanner(System.in);
    	int choose;
    	char choice;
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to delete: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterA) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+accessories[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    	
    	do{
    		System.out.println("Are you sure you want to delete? (Y/N) :");
    		choice = input.next().charAt(0);
    		if(choice=='Y'||choice=='y')
    		{
    			int a=0;
    			PhoneAccessoriesClass[] temp = new PhoneAccessoriesClass[30];
    			for(int i=0 ;i<counterA;i++)
    			{
    				if(i!=(choose-1))
    				{
    					temp[a]=accessories[i];                            //copy
    					a++;
    				}
    			}	
    			counterA--;                                            //counter
    			for(int i=0;i<counterA;i++)                            //counter
    			{
    				accessories[i]=temp[i];								//copy
    			}
    			System.out.println("\n******Record Deleted******\n");
    		}	
    		else if(choice=='n'||choice=='N')
    			continue;// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(choice!='Y'&&choice!='y'&&choice!='n'&&choice!='N');
    	
    	
    	do{
    		System.out.println("Do you want to delete another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			deleteProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    } 
}