package hw4Q2Abstraction02;

public abstract class EngineeringSchool extends NursingSchool implements College,Hospital,University{
	public EngineeringSchool() {
		System.out.println("This is a default constructor of EngineeringSchool Abstract class");
	}
	public  abstract void  mechanicalLab();
	//System.out.println("This is a abstract method");
	public void computerLab() {
		System.out.println("This is a non-abstract method");
	}
}
