package Assignment;

//SOH ZHI YING //*

public class DeliveryCompanyData {
    public static DeliveryCompanyClass[] com = new DeliveryCompanyClass[50];
    public static int counterCom=3;
        
    public DeliveryCompanyData() {
    }
    
    public static void DeliveryCompanyinfo(){
        com[0] = new DeliveryCompanyClass("J&T","27, Jalan Udang Kertas 4, Taman Megah Kepong","01160910640","J&TKepong@gmail.com",15.00,"DC01");
        com[1] = new DeliveryCompanyClass("DHL","38, Jalan Udang gantung 6, Taman Sri Kepong","0126718392","DHL_Kepong@gmail.com",18.00,"DC02");
        com[2] = new DeliveryCompanyClass("PosLaju","56, Jalan Harimau, Taman petaling Kepong","019801783621","PosKepong@gmail.com",11.00,"DC03");
       //String comName, String comAddress, String comPhone, String comEmail, double price,String comID
    }
   
    public static void displayDeliveryCompanyList()
    {
       System.out.print("\n\t\t\t****************Delivery Company List****************\n");
    	System.out.println("===========================================================================================================================================");
    	System.out.println("  Company ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
    	System.out.println("===========================================================================================================================================");
    	for(int i=0;i<counterCom;i++){
    		System.out.println(String.format("%2d",i+1)+"  "+com[i]);
    		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    	}
    }
}
