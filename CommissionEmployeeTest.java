public class CommissionEmployeeTest{
	public static void main(string[]args){
	CommissionEmployee employee = new CommissionEmployee("clement","ng'ethe","12345678",10000.00,0.06);
	System.out.println("first name is " + ""+employee.setFirstName());
	System.out.println("Gross sales is"+""+employee.getGrossSales());
	System.out.println("CommissionRate"+""+employee.getCommissionRate());
	System.out.println("Earnings is"+""+employee.earnings());
	}
}