package hw4Q2Abstraction02;

public abstract class NursingSchool {
	public NursingSchool() {
		 System.out.println("This is a default constructor of NursingSchool Abstract class");
	}
   public abstract void  hygiene();//abstract method can not be implemented
   
   public void caring() {
	   System.out.println("This is non-abstract  method from NursingSchool abstract class");
   }
}
