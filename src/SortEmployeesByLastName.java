import java.util.Comparator;

public class SortEmployeesByLastName implements Comparator<Employee>  {

	public int compare(Employee a, Employee b)
    {
 
        return a.getLastName().compareTo(b.getLastName());
    }
	
}

