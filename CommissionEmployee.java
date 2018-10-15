public class CommissionEmployee extends Object{


	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
		//implicit call to supperclass Commission
		firstName= first;
		lastName = last;
		socialSecurityNumber = ssn;
		grossSales = sales;
		commissionRate = rate;
		
	}
        
       public void setFirstName (String first){
		firstName= first;
}
	public String getFirstName(){
		return firstName;
	}
	public void setlastName (String last){
		lastName = last;
}
	public String getLastname (){
		return lastName;
}
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber = ssn;
}
	public String getsocialsecurityNumber(){
		return socialSecurityNumber;
}
	public void setGrossSales(double sales){
		grossSales = sales;
}
	public double getGrossSales(){
		return grossSales;
}
    public void setCommissionRate(double rate){
		commissionRate = rate;
}
	public double getCommissionRate(){
		return commissionRate;
}
	public double earnings(){
		return commissionRate * grossSales;
}
	



}