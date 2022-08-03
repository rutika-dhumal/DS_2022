class NestedClassTest {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(111, "JOHN ");
        System.out.println("Name is : "+emp.getName()); 
        
        Employee1.Address addr = new Employee1.Address("Pune", "Maharashtra");
        System.out.println("City is : "+addr.getCity());
       
    }
}

class Employee1{
    private int empId;
    private String name;
    
    
    public Employee1(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	


	public static class Address{
		String City;
		String State;
		public Address(String city, String state) {
			super();
			City = city;
			State = state;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		
		
	}
	
    
}