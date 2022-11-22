package week1.day1;

public class Mobile2 {
	
	char mobileLogo= 'A';
	short noOfMobilePiece= 1;
	int modelNumber= 1234;
	float mobilePrice= 999.99f;
	boolean isDamaged= true;
	
	public static void main(String[] args) {
		
		Mobile2 obj = new Mobile2();
		
		System.out.println("Name of the mobile: "+obj.mobileLogo);
		System.out.println("Total Peices: "+obj.noOfMobilePiece);
		System.out.println("Model number: "+obj.modelNumber);
		System.out.println("Mobile Price: "+obj.mobilePrice);
		System.out.println("Mobile Damaged: "+obj.isDamaged);
				
	}
	

}
