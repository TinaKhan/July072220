package exam;

import java.nio.channels.Pipe;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 pi=new Iphone1();
		pi.abstractClassInfo();
		pi.appleWatchInfo();
		pi.battery();
		pi.call();
		pi.camera();
		pi.interfaceInfo();
		pi.message();
		pi.regularClassInfo();
		pi.setPrice(750);
		pi.setiNfo("I bought this phone in 2000");
		pi.setUser('F');
		pi.setMadeInUSA(false);
		System.out.println(pi.getiNfo()+", the price was "+pi.getPrice()+", grade is "+pi.getUser()+" and the boolean value is "
				+ ""+pi.isMadeInUSA());

	}

}
