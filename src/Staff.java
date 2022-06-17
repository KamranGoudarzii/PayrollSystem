import java.util.Calendar;

public class Staff extends Employee {

	public double HourlyRate;
	
	
	
	public Staff() {
		super();
		HourlyRate = 0;
	}
	
	public Staff(String ln, String fn, String id, char g, Calendar bday, double hourlyRate) {
		super( ln,  fn,  id,  g,  bday);
		HourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	@Override
	public double monthlyEarnings() {
		
		return HourlyRate * 7 * 4;
	}
	
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  
	
	
	public String toString() 
	{
		
		String result = super.toString()+ "Full Time\nMonthly Salary: " +
		                     String.valueOf(monthlyEarnings())+"\n";
		return result;
		
	}

	
}
