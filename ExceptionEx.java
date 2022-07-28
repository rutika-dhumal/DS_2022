class ExceptionEx {
    public static void main(String[] args) {
        Student s= new Student () ;
        try{
           s.registeredOnPortal();
           s.portal();
        }
        catch(notRegisteredException e){
            System.out.println("exception : "+e);
        }
        
    }
}

// checked exception --- compileTime
class notRegisteredException extends Exception{
    notRegisteredException (String m){
      super(m);
    }
}

// unchecked exception  --- runtime
class defaulterStudentException extends RuntimeException{
	public defaulterStudentException(String m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
}
class Student {
    boolean registered;
    void registeredOnPortal() {
        if(registered==false) {
            registered=true;
        }
        System.out.println("student is registered ") ;
    }
    
    void portal() throws notRegisteredException{
        if(registered==false){
            notRegisteredException nre= new notRegisteredException ("Student is not yet registered on portal");
            throw nre;
        } 
        attendance () ;
//        assignments ();
    }
    
    void attendance (){
        double attendanceCount=Math.random();
    	System.out.println("attendance is updated");
        
        if(attendanceCount <75) {
        	defaulterStudentException defaultStudEx = new defaulterStudentException("attendance is less than 75");
        	throw defaultStudEx;
        }
        assignments();
    }
    
    void assignments (){
        System.out.println("Assignment is allocated");
    }
}
