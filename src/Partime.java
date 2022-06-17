import java.util.Calendar;

public class Partime extends Staff {

	int hoursWorkedPerWeek;

		
	public Partime() {
		super();
		this.hoursWorkedPerWeek = 0;
	}

	public Partime(String ln, String fn, String id, char g, Calendar bday, double hourlyRate,int hoursWorkedPerWeek) {
		super(ln, fn, id, g,  bday, hourlyRate);
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}
	
	
	public int getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}
	

	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}
	
	@Override
	public double monthlyEarnings() {
		
		return super.HourlyRate * this.hoursWorkedPerWeek;
	
	}
	
	public String toString() 
	{
		
		String result = super.toString()+ "Hours works per month: " +
		                     String.valueOf((hoursWorkedPerWeek/7)*30)+"\n" ;
		return result;
		
	}
	
}
