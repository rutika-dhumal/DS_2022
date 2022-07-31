import java.util.*;
import java.util.concurrent.*;

class Employee {

	int employeeId;
	String name;
	public Employee(int employeeId, String name)
	{
		this.employeeId = employeeId;
		this.name = name;
	}

	public String toString()
	{
		return this.employeeId + " " + this.name ;
	}
}


class SortByEmpId implements Comparator<Employee> {
	public int compare(Employee a, Employee b)
	{
		return a.employeeId - b.employeeId;
	}
}

public class TreeMapTest {
	static void createTreeMap()
	{
		TreeMap<Employee, Integer> tree_map = new TreeMap<Employee, Integer>( new SortByEmpId());

		tree_map.put(new Employee(11, "Rutu"),1);
		tree_map.put(new Employee(18, "John"), 2);
		tree_map.put(new Employee(16, "Snehal"), 3);

		System.out.println("TreeMap: " + tree_map);
	}


	public static void main(String[] args)
	{	
	     
		System.out.println("TreeMap");
		createTreeMap();
	}

}	

