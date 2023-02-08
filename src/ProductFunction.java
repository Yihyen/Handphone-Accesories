//LIM TZE YANG //*

public class ProductFunction {
	public static ProductClass[] iphone = new ProductClass[30];
	public static ProductClass[] samsung = new ProductClass[30];
	public static ProductClass[] huawei = new ProductClass[30];
	public static ProductClass[] accessories = new ProductClass[30];

	public static int counterI=10;
	public static int counterS=10;
	public static int counterH=10;
	public static int counterA=11;
	

    public ProductFunction() {
    	 
    }
    
    public static void iniProducts()
    {
    	iphone[0] = new ProductClass("I001","Iphone 12 128GB","Black Colour","iPhone",3599.0,0);
        iphone[1] = new ProductClass("I002","Iphone 12 256GB","Black Colour","iPhone",4099.0,1);
        iphone[2] = new ProductClass("I003","Iphone 12 128GB","White Colour","iPhone",3599.0,5);
        iphone[3] = new ProductClass("I004","Iphone 12 256GB","White Colour","iPhone",4099.0,5);
        iphone[4] = new ProductClass("I005","Iphone 12 Pro Max 128GB","Black Colour","iPhone",5299.0,5);
        iphone[5] = new ProductClass("I006","Iphone 12 Pro Max 256GB","Black Colour","iPhone",5799.0,5);
        iphone[6] = new ProductClass("I007","Iphone 12 Pro Max 128GB","White Colour","iPhone",5299.0,5);
        iphone[7] = new ProductClass("I008","Iphone 12 Pro Max 256GB","White Colour","iPhone",5799.0,5);
        iphone[8] = new ProductClass("I009","Iphone 12 Pro Max 128GB","Gold Colour","iPhone",5299.0,5);
        iphone[9] = new ProductClass("I010","Iphone 12 Pro Max 256GB","Gold Colour","iPhone",5799.0,5);
        
    	
        samsung[0] = new ProductClass("S001","Samsung Note 10 128GB","Black Colour","Samsung",3299.0,5);
        samsung[1] = new ProductClass("S002","Samsung Note 10 256GB","Black Colour","Samsung",3299.0,5);
        samsung[2] = new ProductClass("S003","Samsung Note 10 128GB","White Colour","Samsung",3299.0,5);
        samsung[3] = new ProductClass("S004","Samsung Note 10 256GB","White Colour","Samsung",3299.0,5);
        samsung[4] = new ProductClass("S005","Samsung Note 10+ 128GB","Black Colour","Samsung",3299.0,5);
        samsung[5] = new ProductClass("S006","Samsung Note 10+ 256GB","Black Colour","Samsung",3299.0,5);
        samsung[6] = new ProductClass("S007","Samsung Note 10+ 128GB","White Colour","Samsung",3299.0,5);
        samsung[7] = new ProductClass("S008","Samsung Note 10+ 256GB","White Colour","Samsung",3299.0,5);
        samsung[8] = new ProductClass("S009","Samsung Note 20 Ultra 5G 256GB","Black Colour","Samsung",3299.0,5);
        samsung[9] = new ProductClass("S010","Samsung Note 20 Ultra 5G 512GB","Gold Colour","Samsung",3299.0,5);
        	
    	huawei[0] = new ProductClass("H001","Huawei P40 128GB","Black Colour","Huawei",3299.00,5);
        huawei[1] = new ProductClass("H002","Huawei P40 256GB","Black Colour","Huawei",3799.00,5);
        huawei[2] = new ProductClass("H003","Huawei P40 128GB","White Colour","Huawei",3299.00,5);
        huawei[3] = new ProductClass("H004","Huawei P40 256GB","White Colour","Huawei",3799.00,5);
        huawei[4] = new ProductClass("H005","Huawei P40 Pro 128GB","Black Colour","Huawei",3899.00,5);
        huawei[5] = new ProductClass("H006","Huawei P40 Pro 256GB","Black Colour","Huawei",4399.00,5);
        huawei[6] = new ProductClass("H007","Huawei P40 Pro 128GB","White Colour","Huawei",3899.00,5);
        huawei[7] = new ProductClass("H008","Huawei P40 Pro 256GB","White Colour","Huawei",4399.00,5);
        huawei[8] = new ProductClass("H009","Huawei Mate 40 Pro 256GB","Black Colour","Huawei",3899.00,5);
        huawei[9] = new ProductClass("H010","Huawei Mate 40 Pro 256GB","Silver Colour","Huawei",3899.00,5);
        

    	accessories[0] = new ProductClass("A001","Iphone 12 Phone Case","Transparent","Accessories",20.0,5);
        accessories[1] = new ProductClass("A002","Iphone 12 Pro Max Phone Case","Transparent","Accessories",25.0,5);
        accessories[2] = new ProductClass("A003","Samsung Note 10 Phone Case","Transparent","Accessories",20.0,5);
        accessories[3] = new ProductClass("A004","Samsung Note 10+ Phone Case","Transparent","Accessories",25.0,5);
        accessories[4] = new ProductClass("A005","Samsung Note 20 Ultra 5G Phone Case","Transparent","Accessories",30.0,5);
        accessories[5] = new ProductClass("A006","Huawei P40 Phone Case","Transparent","Accessories",15.0,5);
        accessories[6] = new ProductClass("A007","Huawei P40 Pro Phone Case","Transparent","Accessories",20.0,5);
        accessories[7] = new ProductClass("A008","Huawei Mate 40 Pro Phone Case","Transparent","Accessories",30.0,5);
        accessories[8] = new ProductClass("A009","Iphone Charging Cable","White Colour","Accessories",15.0,5);
        accessories[9] = new ProductClass("A010","Samsung Charging Cable","White Colour","Accessories",15.0,5);
        accessories[10] = new ProductClass("A011","Huawei Charging Cable","White Colour","Accessories",15.0,5);
	
    }
    		
    public static void display(int choice){
    	
    	if(choice==1)
    		System.out.print("\nCategory: Iphone\n");
    	else if(choice==2)
    		System.out.print("\nCategory: Samsung\n");
    	else if(choice==3)
    		System.out.print("\nCategory: Huawei\n");
    	else 
    		if(choice==4)
    		System.out.print("\nCategory: Accessories\n");
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	switch(choice)
    	{
    		case 1:
    			for(int i=0 ; i<counterI;i++)
    			{
    				System.out.println(String.format("%2d",i+1)+"  "+iphone[i]);
    				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    			}
    			break;
    		case 2:
    			for(int i=0 ; i<counterS;i++)
    			{
    				System.out.println(String.format("%2d",i+1)+"  "+samsung[i]);
    				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    			}
    			break;
    		case 3:
    			for(int i=0 ; i<counterH;i++)
    			{
    				System.out.println(String.format("%2d",i+1)+"  "+huawei[i]);
    				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    			}
    			break;
    		case 4:
    			for(int i=0 ; i<counterA;i++)
    			{
    				System.out.println(String.format("%2d",i+1)+"  "+accessories[i]);
    				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    			}
    			break;
    			
    	}
    	
    } 

}
