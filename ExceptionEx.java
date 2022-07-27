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

class notRegisteredException extends Exception{
    notRegisteredException (String m){
      super(m);
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
        assignments ();
    }
    
    void attendance (){
        System.out.println("attendance is updated");
    }
    
    void assignments (){
        System.out.println("Assignment is allocated");
    }
}
