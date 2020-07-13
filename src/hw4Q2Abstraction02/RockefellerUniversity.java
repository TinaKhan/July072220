package hw4Q2Abstraction02;

public class RockefellerUniversity extends MedicalSchool implements College,Hospital,University{
	
	public RockefellerUniversity () {
		System.out.println("This is a default constructor  of RockefellerUniversity  class");
	}
   //public abstract void maths();
	public  void statistics() {
		System.out.println("This is a non-abstract method  of RockefellerUniversity  class");
	}
@Override
public void anatomyLab() {
	// TODO Auto-generated method stub
	
}
@Override
public void biochemistryLab() {
	// TODO Auto-generated method stub
	
}
@Override
public void classSize() {
	// TODO Auto-generated method stub
	
}
@Override
public void field() {
	// TODO Auto-generated method stub
	
}
@Override
public void teacher() {
	// TODO Auto-generated method stub
	
}
@Override
public void emergencyRoom() {
	// TODO Auto-generated method stub
	
}
@Override
public void surgeryRoom() {
	// TODO Auto-generated method stub
	
}
@Override
public void cafeteria() {
	// TODO Auto-generated method stub
	
}
@Override
public void commonRoom() {
	// TODO Auto-generated method stub
	
}
@Override
public void laboratory() {
	// TODO Auto-generated method stub
	
}
@Override
public void languageClub() {
	// TODO Auto-generated method stub
	
}
}
