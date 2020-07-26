package exam;

public class Iphone1 extends AppleWatch implements Phone {
	private int price=700;
	private String iNfo="Bought in April";
	private char user='F';
	private boolean madeInUSA=true;
	
	String dbox="dropbox";
    public void iPhone2Info(int price) {
    	System.out.println("The price   of Iphone2  is "+price);
	}
	public void regularClassInfo() {
		System.out.println("Regular class can extend another "
				+ "class and implement one or more Interfaces");
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getiNfo() {
		return iNfo;
	}

	public void setiNfo(String iNfo) {
		this.iNfo = iNfo;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

}
