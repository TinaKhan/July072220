package exam;

public class Iphone2 extends Iphone1 {
	
	
	public char Male='M';
	public Iphone2() {
		System.out.println("This is the default constructor of Iphone1 ");	
	}
	public Iphone2(char Male) {
		this.Male=Male;
		System.out.println("The user  of Iphone2 is "+Male);	
	}
	public void iPhone2Info() {
		super.iPhone2Info(700);
		
	}
	public void iphon2Info() {
		System.out.println("This is the method of iphone2Info");
	    }
}
