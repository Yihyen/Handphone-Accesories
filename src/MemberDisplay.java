/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yen_y
 */
public class MemberDisplay {
    	public static Members[] mem = new Members[50];
	public static int counterMem=10;

    public MemberDisplay() {
    }
	

    public static void DisplayMember()
    {
        
        
    		mem[0] = new Members("Marcus Goh","0174171180","010920010121","M001","marcus@gmail.com",'M');
                mem[1] = new Members("Chee Jun Hui","0124952341","011205071021","M002","junhui@hotmail.com",'M');
		mem[2] = new Members("Tan Ah Ming","0119345582","030303032788","M003","ming123@yahoo.com",'F');
		mem[3] = new Members("Tan Mei Ling","0124956823","010921025919","M004","meiling@live.com",'M');
		mem[4] = new Members("Nicholas Lee","0185821582","001105092305","M005","nicholas@outlook.com",'M');
		mem[5] = new Members("Sofia Yeow","0123586729","010205076568","M006","sofia1@gmail.com",'F');
		mem[6] = new Members("Ooi Xiao Ming","014825296","010401080291","M007","ooi01@gmail.com",'M');
		mem[7] = new Members("Lee Ann","0123586349","010406023406","M008","ann01@live.com",'M');
		mem[8] = new Members("Joanne Ooi","0196839539","010930084050","M009","Joanne@hotmail.com",'F');
		mem[9] = new Members("John Lee","0158634934","011209044921","M010","John99@outlook.com",'M');
		
    }
    
    public static void displayMemberList()
    {
    	System.out.println("============================================================================================");
    	System.out.println("   Member ID\tMember Name\t       IC No.\t     Phone\t\tEmail       Gender");
    	System.out.println("============================================================================================");
    	for(int i=0;i<counterMem;i++){
    		System.out.println(String.format("%2d",i+1)+"  "+mem[i]);
    		System.out.println("--------------------------------------------------------------------------------------------");
    	}
    	
    }
}
