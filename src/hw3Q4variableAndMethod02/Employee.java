package hw3Q4variableAndMethod02;

public class Employee {
	 String Name; 
	 int age; 
	 char sex;  
	 boolean usaCitizen;
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.Name="tofael";
		emp.age=44;
		emp.sex='M';
		emp.usaCitizen=false;
		emp.empInfo();
	}
    public void  empInfo() {
    	System.out.println("This employee's name is  "+Name+".His  "+age+ "and his sex is "+sex+" "
    			+ ".He is a uscitizen "+""+ usaCitizen);
    }
}
