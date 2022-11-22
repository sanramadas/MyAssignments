package week1.day1;

public class TwoWheeler {
	
		int noOfWheels= 2;
		float mileage= 70.1f;
		boolean isPunctured= false;
		char bikeNameFirstLetter= 'H';

	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		
		System.out.println("Total no of Wheels "+obj.noOfWheels);
		System.out.println("Total Mileage "+obj.mileage);
		System.out.println("Type Punctructred "+obj.isPunctured);
		System.out.println("Brand First Letter "+obj.bikeNameFirstLetter);
	}

}
