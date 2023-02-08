package Assignment;

//CHIN JOEL FEI //*

import java.util.Scanner;

public class StaffAdd extends StaffData{

    public StaffAdd() {
    }
    
    public static void addStaff(){
    	Scanner sc = new Scanner(System.in);
    	char option;
    	System.out.println("\n=====Add Staff=====");
    	                                                                                                                                                
    	//Add a Name
    	String Name;
    	boolean N=true;
    	do{
    		N=true;
    		System.out.print("Staff Name : ");
    		Name = sc.nextLine();
    		
        
                
    		if(Name.length()>50)
    			System.out.println("System is not allowed more than 50 Characters(-.-;)\n<!>Please enter your name again<!>\n");                        		
                for(int i=0;i<Name.length();i++)
    		{
    			if(Character.isDigit(Name.charAt(i)))
    			{
        
                            System.out.println("It's impossible for a staff's name to contain a digit(-.-;)\nPlease enter your name again without digit<!>\n" );
    			   

                                N=false;
    			}
    		}
    	}while(Name.length()>50||N==false);
    	
    	//Add a IC
    	boolean identitycard=true;
    	String IdentityCard;
    	do{
    		identitycard=true;
    		System.out.print("Staff Identity Card  : ");
    		IdentityCard = sc.nextLine();
    		
    		if(IdentityCard.length()!=12){
    			System.out.println("An IC is only contain 12 digits( •̀ㅁ•́;)\n<!>Please examine it whether you insert extra or less digit and enter again<!>\n");
    			identitycard=false;
    			continue;
    		}
    		
    		for(int i =0;i<IdentityCard.length();i++)
    		{
    			if(Character.isLetter(IdentityCard.charAt(i))){
    				System.out.println("Letter is not allow in a format of IC!Please enter again!\n");
    				identitycard=false;
    				break;
    			}
    				
    		}
    		}while(identitycard==false);
    	
    	//add a phone
    	
    	String phoneNo;
    	boolean P=true;
    	do{
    		P=true;
    		System.out.print("Phone number : ");
    		phoneNo = sc.nextLine();
    		
    		if(phoneNo.charAt(0)!='0'||phoneNo.charAt(1)!='1'||phoneNo.length()>11||phoneNo.length()<10)
    		{
    			System.out.println("Please Enter Correct Format Of Phone Number( •̀ㅁ•́;)\n");
    			P=false;
    			continue;
    		}
    		for(int i =0;i<phoneNo.length();i++)
    		{
    			if(Character.isLetter(phoneNo.charAt(i))){
    				System.out.println("Please Enter Correct Format Of Phone Number( •̀ㅁ•́;)\n");
    				P=false;
    				break;
    			}		
    		}
    	}while(P==false);
    	
    	//add a Joined Year
    	int staffJoinYear;	
    	do{
    		try{
    				System.out.print("Staff Join year : ");
    				staffJoinYear = sc.nextInt();
    				if(staffJoinYear>=2018&&staffJoinYear<=2021) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			sc.nextLine();
    		}
    		
    		System.out.println("\nStaff Join Year Must between 2018 to 2021! Please enter again!(-.-;)\n");
    	
    		
    			
    	}while(true);
    		
    	
    	//add a gender
    	char gender;
    	do{
    		System.out.print("Male(M) Or Female(F) : ");
    		gender = sc.next().charAt(0);
    		gender = Character.toUpperCase(gender);
    		System.out.println(gender);
    		if(gender!='M'&&gender!='F')
    			System.out.println("Please enter either M or F! \n");
    	}while(gender!='M'&&gender!='F');
    	
    	
    	String IDd;
    	boolean result=false;
    	sc.nextLine();
    	do{
    		
    		System.out.println("\nStaff ID : S0"+(ExistingStaff+1)+"\n***This is your ID and please mark it**");
    		System.out.print("To make sure your info is stored\nPlease enter the Staff ID again: ");
    		IDd= sc.nextLine();
    		
    		if(IDd.length()!=4)
    			System.out.println("\nPlease follow the Staff ID given to insert!(¯―¯٥)");
    		else if(IDd.charAt(1)!='0')
    			System.out.println("\nPlease follow the Staff ID given to insert!(¯―¯٥)");
    		else if(IDd.charAt(2)!=(((int)(ExistingStaff+1)/10))+'0')
    			System.out.println("\nPlease follow the Staff ID given to insert!(¯―¯٥)");
    		else if(IDd.charAt(3)!=(((int)(ExistingStaff+1)%10))+'0')
    			System.out.println("\nPlease follow the Staff ID given to insert!(¯―¯٥)");
    		else if(IDd.charAt(0)!='S')
    			System.out.println("\nPlease follow the Staff ID given to insert!(¯―¯٥)");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	MobileStaffs[ExistingStaff]=new StaffClass(Name,phoneNo,IdentityCard,IDd,staffJoinYear,gender);
    	System.out.println("\n※※※※※※Your Detail Had been Stored in our System※※※※※※");
    	System.out.println("============================================================================");
    	System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	System.out.println("============================================================================");
    	System.out.println(String.format("%2d",ExistingStaff+1)+"  "+MobileStaffs[ExistingStaff]);
    	System.out.println("----------------------------------------------------------------------------");
    	ExistingStaff++;
    	
    	  
    	do{
    		System.out.println("Do you want to continue add new staff? (Y/N): ");
    		option = sc.next().charAt(0);
                switch (option) {
                    case 'Y':
                    case 'y':
                        addStaff();
                        break;
                    case 'n':
                    case 'N':
                        StaffMainMenu.MainmenuStaff();
                        break;
                    default:
                        System.out.println("Please enter a valid option!(¯―¯٥)");
                        break;                       
                }
    	}while(option!='Y'&&option!='y'&&option!='n'&&option!='N');
    }
    
}