public class CommisionEmployee extends Object{
	private String firstName,
	private String lastName,
	private String socialSecurityNumber,
	private double grossSales,
	private double commissionRate;
        
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
		socialSecurityNumber = snn;
}
	public String getsocialsecurityNumber(){
		return socialSecurityNumber;
}
	public void set GrossSales(double sale){
		grossSales = sales;
}
	public Double getGrossSales(){
		return grossSales;
}
    public void setCommissionRate(double rate){
		commissionRate = rate;
}
	public Double getCommissionRate(){
		return commissionRate;
}
	public double earnings(){
		return commissionRate * grossSales;
}
	public CommissionEmployee(String first, String last, String ssn,double Sales, double rate){
		//implicit call to supperclass Commission
		firstName= first;
		lastName = last;
		socialSecurityNumber = snn;
		grossSales = sales;
		commissionRate = rate;
		
}
}