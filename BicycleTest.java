public class BicycleTest{
	public static void main(String[]args){
		Bicycle b1 = new Bicycle();
			b1.speedup(20);
				 System.out.println("The speed of the Bicycle one is" +" " + b1.returnSpeed());

       
		Bicycle b2 = new Bicycle();
		
		b2.speedup(40);
		System.out.println("The speed of bicycle two is" +" "+ b2.returnSpeed());
	}
}
