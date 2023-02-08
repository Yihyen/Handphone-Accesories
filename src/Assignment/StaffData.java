package Assignment;

//CHIN JOEL FEI //*

public class StaffData {
	public static StaffClass[] MobileStaffs = new StaffClass[100];
	public static int ExistingStaff = 10;

    public StaffData() {
    }
    
    public static void Staffsinfo(){
    	MobileStaffs[0] = new StaffClass("Chin Joel Fei","01120331532","010505101212","S001",2020,'M');
    	MobileStaffs[1] = new StaffClass("Lim Tze Yang","0192623022","011212110323","S002",2018,'M');
    	MobileStaffs[2] = new StaffClass("Soh Zhi Ying","01160910640","010723101321","S003",2017,'F');
    	MobileStaffs[3] = new StaffClass("Tan Yih Yen","0109386025","010606131314","S004",2021,'F');
    	MobileStaffs[4] = new StaffClass("Tan Jia Hau","01156807735","010323131234","S005",2017,'M');
    	MobileStaffs[5] = new StaffClass("Chee Jun Hui","0172789473","010707132342","S006",2012,'M');
    	MobileStaffs[6] = new StaffClass("Lee Mei Ling","0123456779","990122144321","S007",2015,'F');
    	MobileStaffs[7] = new StaffClass("Ang Ho Ho","01120738268","710212313421","S008",2019,'F');
    	MobileStaffs[8] = new StaffClass("Ong Huat Huat","01120448836","901212123421","S009",2020,'F');
    	MobileStaffs[9] = new StaffClass("Low Xuan Ming","01620278267","901505101212","S010",2021,'M');
    }
    
    public static void ViewALLStaff(){
    	System.out.println("============================================================================");
    	System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	System.out.println("============================================================================");
    	for(int i=0;i<ExistingStaff;i++){
    		System.out.println(String.format("%2d",i+1)+"  "+MobileStaffs[i]);
    		System.out.println("----------------------------------------------------------------------------");
    	}
    	
    }
    
}